## I/O

- Input과 Output의 약자로 입출력이라 칭한다.
- 컴퓨터 내부 또는 외부의 장치와 프로그램간의 데이터를 주고 받는 다는 것을 말한다.
- JVM 외부의 데이터를 JVM 내부로 읽어 들이거나, JVM내의 처리된 데이터를 JVM 외부로 내보낼 때 사용하는 클래스들
- java.io 패키지에서 관련 클래스 제공.
- 8bit stream과 16bit stream이 존재한다.
  - byte 기반 스트림 모든 데이터를 읽고 쓸 수 있다.
  - 문자열 기반 스트림

### Stream

- 두 대상을 연결하고 데이터를 전송할 수 있는 무언가가 필요한데 이것을 Stream이라 한다.
- Stream이란 데이터를 운반하는데 사용되는 연결 통로이다.
- 스트림은 단방향 통신만 가능하기에 입력과 출력 2개의 Stream이 필요하다.

### 바이트기반 Stream - InputStream, OutputStream

- 입력스트림과 출력스트림의 종류

| 입력스트림           | 출력스트림            | 입출력 대상의 종류           |
| -------------------- | --------------------- | ---------------------------- |
| FileInputStream      | FileOutputStream      | 파일                         |
| ByteArrayInputStream | ByteArrayOutputStream | 메모리(Byte배열)             |
| PipedInputStream     | PipedOutputStream     | 프로세스(프로세스 간의 통신) |
| AudioInputStream     | AudioOutputStream     | 오디오 장치                  |

- 입력스트림과 출력스트림에 정의된 읽기와 쓰기를 수행하는 method

| InputStream                          | OutputStream                            |
| ------------------------------------ | --------------------------------------- |
| abstract int read()                  | abstract void write(int b)              |
| int read(byte[] b)                   | void write (byte[] b)                   |
| int read(byte[] b, int off, int len) | void write (byte[] b, int off, int len) |

### 보조 스트림

- 스트림의 기능을 향상시키거나 새로운 기능을 추가할 수 있다.
- 보조스트림만으로는 입출력을 처리할 수 없고 스트림을 먼저 생성한 후 보조스트림을 생성
- 버퍼를 사용한 입출력과 사용하지 않은 입출력간의 성능차이는 상당하기 때문에 대부분의 경우에 버퍼를 이용한 보조 스트림을 사용한다.

예시코드

```java
// 1. 기반 스트림 생성
FileInputStream fis = new FileInputStream("test.txt");
// 2. 기반스트림을 이용해 보조스트림을 생성
BuffredInputStream bis = new BufferedInputStream(fis);
// 3. 보조스트림인 BufferedInputStream으로부터 데이터를 얻는다.
bis.read();
```

보조스트림의 종류

| 입력                  | 출력                 | 설명                                                   |
| --------------------- | -------------------- | ------------------------------------------------------ |
| FilterInputStream     | FilterOutputStream   | 필터를 이용한 입출력 처리                              |
| BufferedInputStream   | BufferedOutputStream | 버퍼를 이용한 입출력 성능 향상                         |
| DataInputStream       | DataOutputStream     | int, float와 같은 기본형 단위로 데이터를 처리하는 기능 |
| SequenceInputStream   | 없음                 | 두 개의 스트림을 하나로 연결                           |
| LineNumberInputStream | 없음                 | 읽어 온 데이터의 라인 번호를 카운트                    |
| ObjectInputStream     | ObjectOutputStream   | 데이터를 객체단위로 읽고 쓰는데 사용.                  |
| 없음                  | PrintStream          | 버퍼를 이용하며, 추가적인 print관련 기능               |
| PushbackInputStream   | 없음                 | 버퍼를 이용해 읽어 온 데이터를 다시 되돌리는 기능      |

### 문자기반 스트림 - Reader, Writer

- 문자 데이터를 입출력할때는 문자기반 스트림을 사용할 것
- 바이트기반 스트림과 문자기반 스트림은 이름만 조금 다를 뿐 활용방법은 같다.

<aside>
💡 InputStream → Reader
OutputStream → Writer

</aside>

### File 스트림

- HDD에 존재하는 File에 접근하여 작업하기 위한 Stream.
- 파일내용 읽기.
  - 8bit stream - FileInputStream : 모든파일을 다 읽어 들일 수 있다.
  - 16bit stream - FileReader : 독자포멧을 가지지 않은 문자열 파일을 읽어 들일 수 있다.

### File

- 파일에 관련된 정보를 얻거나, 파일을 조작할 때 사용 생성은 불가 디렉토리 생성

**사용법**

```java
// 객체 생성
File file = new File("경로");

// 파일관련 정보
file.exists(); // 파일이 존재하는지
file.length(); // 파일의 길이
file.isFile(); // 파일인지
file.isDirectory(); // 디렉토리인지
file.canRead(); // 읽기 가능한지
file.canWrite(); // 쓰기 가능한지
file.canExecute(); // 실행 가능한지
file.isHidden(); // 숨김 파일인지
file.lastModified(); // 마지막으로 수정된 시간
file.getPath(); // 파일 경로
file.getAbsolutePath(); // 파일 절대 경로
file.getCanonicalPath(); // 파일 규범 경로

// 파일 조작
// 파일명 변경
 // 1. 변경할 이름의 파일을 생성
	File rename = new File("경로/변경할 이름의 파일명 ");
 // 2. 파일클래스의 method 호출
	file.renameTo(rename);
// directory 생성
// 상위폴더가 존재하면 하위 폴더를 만들 수 있다.
mkdir(); // 상위폴더가 없으면 하위 폴더를 만들지 못한다.
mkdirs(); // 상위폴더를 생성하여 하위 폴더를 만든다.
```

### 파일 읽기

16bit stream

```java
FileReader fr = new FileReader( new File("경로") ); // 1byte로만 읽기 가능.
// 줄 단위로 읽어 들이는 기능을 가진 스트림과 연결해서 사용.
BufferedReader br = new BufferedReader( fr );
String s = br.readLine(); // 읽어들인 데이터가 없으면 null (EOF)이 나온다.

String data = "";
while( (data = br.readLine()) != null ) {
	System.out.println(data); // \n까지 한 줄씩 읽어들인 데이터를 사용할 수 있다.
}

```

### 파일로 출력.

- HDD에 파일을 생성하여 JVM내의 문자열 데이터를 목적지 파일에 출력
  - 8bit stream - FileOutputStream : 모든 데이터를 쓸 수 있다.(파일 복사에 사용)
  - 16bit stream - FileWriter : 문자열데이터를 파일에 쓸 수 있다.

```java
// 16bit Stream
// 1. 스트림 생성
FileWriter fw = new File Writer( new File ("경로") ); //파일이 존재하면 덮어쓰고 없으면 생성
// 파일은 만들 수 있지만 폴더(directory)는 만들 수 없다.

// 2. 스트림에 데이터를 기록( 기본형데이터형은 목적지로 자동 분출되나.
// 참조형데이터형은 목적지로 분출되지 않는다.
fw.write("문자열");

// 3. 스트림에 기록된 내용을 목적지 파일로 분출
fw.flush();
```
