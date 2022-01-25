# Collection Framework

## JCF (Java Collection Framwork)

- 자료구조 (데이터를 편하게 사용하기 위해 제공되는 객체들)
- List, Set, Map 제공.
- JDK 1.5에서 부터 Generic, autoboxing, unboxing의 기능이 추가
- **Generic**

  - JDK 1.5에서부터 지원되는 기능.
  - 입력 데이터형에 대한 제한 설정할 때 사용.
  - <> → Diamond 연산자를 사용해 데이터형을 설정한다.
  - JCF는 Object를 입력받는다.

    - 편의성은 좋으나 꺼내서 사용할 때 문제가 발생할 수도 있다.
      사용법 → <사용할 데이터형> -**참조형 데이터형만 설정**할 수 있다.
      Ex) 문자열로만 저장 가능한 `List List<String> list = new ArrayList<String>();`
      JDK1.7 부터는 생성자 뒤의 Generic은 생략이 가능하다.

          정수(int)로만 저장가능한 List

          `List<Integer> list = new ArrayList<Integer>();` → **Wrapper Class**를 이용해야한다

- **Auto boxing**
    <aside>
    💡 **autoboxing**
    
    wrapper Class로 Generic이 설정된 List에 기본형을 입력하면 기본형은 객체가 아니므로 할당되지 않아야 한다. 하지만 할당이된다.(JVM이 기본형을 대응되는 클래스를 사용하여 객체로 생성하여 입력해주기 때문이다.) 이런 것을 auto boxing이라 한다.
    
    `Integer i = 10;` → 기본형이 참조형으로 할당 될 수 없으므로 error가 발생해야 하나  JVM이 Wrapper Class를 사용하여 객체로 생성한 후 할당한다.
    
    </aside>

- **Un boxing**
  - JDK1.5에서 부터 지원하는 문법
  - J
  - Wrapper Class에 들어있는 값이 원래의 데이터형으로 나오는 것
    `Integer ii = new integer( 10 ); int i = ii;`
    JVM이 Wrapper Class의 객체가 가지고 있는 값을 원래의 형으로 얻어내서 한다.

### List

- 일차원 배열형식
- 가변길이형 → 발생하는 데이터의 개수를 모를 때 사용한다.
- **중복 값을 저장하며, 검색의 기능이 있다.**
- 데이터의 크기만큼만 메모리를 사용하기에 메모리가 절약된다.
- 부모는 Collection, 자식은 ArrayLis, Vector, LinkedList

- List를 구현한 Class

  ### Vector

  - 데이터를 순차적으로 붙일 때 사용한다.
  - **multi thread에서 동시접근이 불가능하다.**

    **JDK 1.4 Version 작성법**

  1.  `List i = new Vector();` is a 관계 → 객체 다형성

           2.  `Vector vec = new Vector();`

      **JDK 1.5 Version 작성법**

           1.  `List<E> list = new Vector<E>();`

           2.  `Vector<E> vec = new Vector<E>(();`

  ### ArrayList

  - 데이터를 순차적으로 붙일 때 사용한다.
  - Vector보다 처리속도가 빠르다.
  - **multi thread에서 동시접근이 가능하다.**
    **JDK 1.4 Version 작성법**
    1.  `List i = new ArrayList();` → is a 객체 다형성
    2.  `ArrayList al = new ArrayList();`
        **JDK 1.5 Version 작성법**
    3.  `List<E> list = new ArrayList<E>();`
    4.  `ArrayList<E> al = new ArrayList<E>();`

  ### LinkedList

  - **데이터가 기존의 데이터 사이에 들어가는 일이 많을 때 사용한다.**
  - 처리 순서
    삽입되어야 하는 위치 뒤로 존재하는 데이터를 잘라서 어딘가에 복사 해놓는다. → 새로운 데이터를 붙인 후 - > 복사된 데이터들을 가져와서 뒤로 붙인다.

- 사용법
  - **객체생성**
    - `List<E> list = new ArrayList<E>();` - 입력되는 값이 뒤에서 부터 추가되는 일이 많을때
    - `List<E> list = new Vector<E>();` - 입력되는 값이 뒤에서 부터 추가되는 일이 많을때
    - `List<E> list = new LinkedList<E>();` - 입력되는 값이 기존의 값 사이에 추가되는 일이 많을 때
  - **값 할당** - 방의 크기가 증가한다. 입력데이터는 순차적으로 추가된다.
    - `list.add( E );` - `list.add( “안녕” );` → `list.add( ”하세요” );`
  - **방의 갯수 구하기**
    - `list.size();` 반환형은 int
  - **방의 값 삭제** - > 리스트의 크기는 줄어든다
    - 방의 인덱스로 삭제 → `list.remove( index );`
    - 방의 내용으로 삭제 → `list.remove( value );`
    - 모든 방의 값을 삭제 → `list.clear();`
  - **List의 내용 유무**
    - `list.isEmpty();`
  - **List의 내용을 array로 복사**
    1. 리스트의 크기로 배열을 생성 → `데이터형[] 배열명 = new 데이터형 [ list.size() ];`
    2. 복사 `list.toArray( 생성한 배열 );`

## Set

- 검색의 기능이 없으며, 중복데이터가 저장되지 않는다.
- 데이터가 순차적으로 입력되지 않는다.
- 값을 유일하게 관리할 때 사용한다.

**사용법**

- 객체생성
  - `Set<E> set = new HashSet<E>();`
- 값 할당 - 순차적으로 입력되지 않는다.
  - `set.add( 값 );`
- 크기
  - `set.size();`
- 값이 없는 지?
  - `set.isEmpty();`
- 삭제
  - `set.remove( 값 ); //값 1개만 삭제 set.claer(); //전체삭제`
- 배열로 복사
  - 빈 배열생성 → 데이터형[] 배열명 = new 데이터형[방의 갯수];
  - `set.toArray( 배열명 );`
- 값 얻기 → index가 없으므로 get( i );를 사용할 수 없다. Iterator을 사용하여 Set의 제어권을 받고, 포인터를 움직여서 데이터를 얻는다.
  1. 제어권 받기
     1. `Iterator<E> ita = set.iterator();`
  2. 포인터가 존재하는 다음 위치에 요소가 존재하는 지?
     1. `ita.hasNext(); // 요소가 있다면 true, 없다면 false`
  3. 포인터가 존재하는 곳에 값을 얻고 다음 위치로 이동.
     1. `ita.next();`

## Map

- 키와 값의 쌍(entry)으로 이루어진 데이터 형.
- 키로 값을 검색하는 일.
- 이차원 배열형식.( 열은 고정이고 행만 가변적이다.)
- 구현 클래스로 Hashtable과 HashMap이 존재.
- 전체행의 크기에서 약 75%의 데이터가 채워져 있을 때 검색속도가 가장 빠르다.
- 키는 중복될 수 없고, 값은 중복 될 수 있다.
- 같은 키가 입력되면 이전 키에 덮어써서 중복을 처리한다.

**사용법**

1. 생성
   1. `Map<K,V>map = new Hashtable<K,V>(); // 11개 행 생성 multi thread에서 동시접근 불가능, 속도느림`
   2. `Map<K,V>map = new HashMap<K,V>(); // 16개 행 생성 multi thread에서 동시접근 가능, 속도빠름`
2. 값 할당 → 중복 키가 존재한다면 중복 키에 덮어 쓴다. ( Key는 유일) 입력 되는 값이 순차적으로 들어가지 않는다.
   1. `map.put( Key, Value );`
3. Map의 크기(행의 개수)
   1. `map.size();`
4. 값 얻기
   1. `value =map.get( Key ); // 키가존재 하면 값이 얻어진다. 키가없다면 null`
5. Key 존재 여부

   boolean Key 존재 여부 = map.containsKey( Key );

6. 모든 키 얻기 → 값을 검증할 목적으로.
   1. `Set<E> set = map.keySet();`
7. 값 삭제.
   1. `map.remove( Key ); // Key에 해당하는 entry가 삭제`
   2. `map.clear() // 모든 행을 삭제`
8. Map이 비었는지
   1. `map.isEmpty();`
