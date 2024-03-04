### 💭 15장 정리

---

#### ☑️ 캐릭터 셋(CharSet)

- UTF-8, UTF-16, EUC-KR 등등이 존재하며 UTF-16을 많이 사용

#### ☑️ length( ), isEmpty( )
```java
class String{
    public static void main(String[] args) {
        String text = "hi, dongho";
        text.length(); // 문자열의 길이 리턴
        text.isEmpty(); // 문자열이 비어있는지 확인, 비어있으면 true반환
        
    }
}
```

#### ☑️ compareTo( )
```java
public void compareTo(){
    String text1 = "a";
    String text2 = "b";
    String text3 = "c";
    System.out.println(text2.compareTo(text1)); // 1
    System.out.println(text2.compareTo(text3)); // -1
    System.out.println(text1.compareTo(text3)); // -2
}
```
- 비교하려는 매개변수로 넘겨준 String객체가 알파벳 순으로 `앞에있으면 양수, 뒤에있으면 음수`를 반환

#### ☑️ StringBuffer, StringBuilder

- String의 단점인 문자열 더하기 연산시, 새로운 객체를 생성한다는 점을 보완하기 위해 탄생
  - String은 immutable이기 때문에 문자열 덧셈 연산시, 새로운 객체를 생성하고 기존객체는 GC에 의해 처리됨
  - append() 메소드를 통해 극복
- StringBuffer가 더 안전하다
- StringBuilder가 더 빠르다

---

### 💭 단답형

#### 1. String 클래스는 final 클래스인가요?

- 네, 상속불가

#### ⚠️ 2. String 클래스가 구현한 인터페이스에는 어떤 것들이 있나요?

- Serializable, Comparable, CharSequence

#### ⚠️ 3. String 클래스의 생성자 중에서 가장 의미없는 생성자는?

- 기본 생성자

#### 4. String 문자열을 byte 배열로 만드는 메소드의 이름은?

- getBytes( )

#### 5. String 문자열의 메소드를 호출하기 전에 반드시 점검해야 하는 사항은?

- null인지 체크

#### 6. String 문자열의 길이를 알아내는 메소드는?

- length( )

#### 7. String 클래스의 equals( ) 메소드와 compareTo( ) 메소드의 공통점과 차이점은?

- 공통점은 값을 비교하는 것이고, 차이점은 equals는 boolean값 반환, compareTo는 알파벳 순서에 따른 정수값 반환

#### 8. 문자열이 "서울시"로 시작하는지를 확인하려면 어떤 메소드를 사용해야하는가?

- startsWith( )

#### 9. 문자열에 "한국"이라는 단어의 위치를 찾아내려고 할때 어떤 메소드?

- indexOf( )

#### 10. 9번문제의 답에서 "한국"이 문자열에 없을때의 결과값은?

- -1

#### 11. 문자열의 1번째부터 10번째 위치까지의 내용을 String으로 추출하려고할때 어떤메소드 사용?

- subString( )

#### ⚠️ 12. 문자열의 모든 공백을 * 표시로 변환하려고 할때 어떤 메소드?

- replaceAll( )

#### 13. String의 단점을 보완하기 위한 두가지 클래스는?

- StringBuilder, StringBuffer

#### 14. 13번의 답에서 문자열을 더하기 위한 메소드의 이름은?

- append()