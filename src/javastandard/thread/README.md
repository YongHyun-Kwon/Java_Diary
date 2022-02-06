# Thread

## Process

- 실행중인 프로그램을 Pocess라 칭한다.
- 프로그램을 실행하면 OS로부터 실행에 필요한 자원을 할당받아 프로세스가 된다.
- Process는 프로그램을 수행하는 데 필요한 데이터와 메모리 등의 자원 그리고 쓰레드로 구성
- 프로세스의 자원을 이용해서 실제로 작업을 하는 것이 Therad이다.
- 모든 Process는 하나 이상의 thread가 존재하며 둘이상의 Therad를 가진 Process를 “멀티쓰레드 프로세스(Multi- threaded process)”라고 한다.

## Multi-tasking, Multi-threading

윈도우, Unix 등의 대부분의 OS들은 다중작업(Multi-tasking)을 지원하기에 여러 개의 프로세스가 동시에 실행 될 수 있다.

Multi- threading은 하나의 프로세스 내에서 여러 thread가 동시에 작업을 수행하는 것

CPU의 core가 한 번에 단 하나의 작업만 수행할 수 있기에 동시에 처리되는 작업의 수는 Core의 개수와 동일하다.

처리해야하는 thread의 수는 코어의 개수보다 많지만 각 Core가 짧은 시간 동안 여러 작업을 번걸아 가며 수행함으로 동시에 수행되는 것처럼 보이게 된다.

Process의 성능이 단순히 thread의 개수에 비례하는 것은 아니다.

### Multi- threading의 장점

- CPU의 사용율을 향상
- 자원을 보다 효율적으로 사용할 수 있다.
- 사용자에 대한 응답성이 향상된다.
- 작업이 분리되어 코드가 간결해진다.

<aside>
💡 멀티쓰레드 프로세스는 여러  thread가 같은 Process내에서 자원을 공유하며 작업하기에 발생할 수 있는 동기화, 교착상태와 같은 문제들을 고려해서 프로그래밍해야한다.

</aside>

### Thread의 구현과 실행

- Thread클래스를 상속

```java
class UseThread extedns Thread {
	public void run() { // 작업내용 } // Thread클래스의 run()을 오버라이딩
}
```

- Runnable 인터페이스를 구현

```java
class UseThread implements Runnable {
	public void run() { // 작업내용 } // Runnable Interface의 run()을 구현
}
```
