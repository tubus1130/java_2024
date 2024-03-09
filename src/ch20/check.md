### 💭 20장 정리

---

#### ☑️ 숫자를 처리하는 클래스

- 기본자료형은 자바의 힙 영역이 아닌 스택 영역에 저장되어 관리됨
- 따라서, 계산할 때 보다 빠른 처리가 가능하다
- `parse타입()`은 기본자료형을 리턴하고, `valueOf()`는 참조자료형을 리턴함

```java
class Number{
    String value = "3";
    byte byte1 = Byte.parseByte(value);
    Integer int1 = Integer.valueOf(value);
}
```

#### ☑️ System 클래스
```java
class System{
    /*
        System : 클래스
        out : System클래스에 static으로 선언되어 있는 변수
        println : PrintStream클래스에 static으로 선언되어 있는 메소드
     */
    // public final static PrintStream out = null;
    System.out.println();
}
```

---

### 💭 단답형

#### 1. 자바 패키지 중 같은 패키지에 있는 클래스를 제외하고, 별도로 import하지 않아도 되는 패키지는?

- java.lang

#### ⚠️ 2. 자바의 메모리가 부족해서 발생하는 에러는 무엇인가요?

- java.lang.OutOfMemoryError

#### 3. 메소드 호출 관계가 너무 많아서 발생하는 에러는 무엇인가요?

- StackOverflowError

#### 4. java.lang 패키지에 선언되어 있는 3개의 어노테이션은?

- Deprecated : 더이상 사용되지 않음을 컴파일러에게 알림
- Override : 해당 메소드는 부모클래스에 있는 메소드를 오버라이드 했음을 명시적으로 선언
- SuppressWarnings : 경고 제외

#### 5. Double과 Integer 같은 숫자 타입에서 처리할 수 있는 최대, 최소값을 알수 있는 상수의 이름은?

- MAX_VALUE, MIN_VALUE

#### ⚠️ 6. Integer 값을 2진법으로 표현하려면 어떤 메소드?

- toBinaryString()

#### ⚠️ 7. Integer 값을 16진법으로 표현하려면 어떤 메소드?

- toHexString()

#### ⚠️ 8. 속성과 환경값의 차이는 무엇인가요?

- 속성은 java.util 패키지에 속하면 Hashtable의 상속을 받음, 추가 또는 변경가능
- 환경값 env는 읽기만 가능

#### 9. System.out과 System.err에서 사용할 수 있는 메소드를 확인하려면 어떤 클래스를 찾아야 하나요?

- PrintStream

#### ⚠️ 10. System 클래스에서 현재시간을 조회하는 용도의 메소드는?

- System.currentTimeMillis()

#### ⚠️ 11. System 클래스에서 시간 측정용도로 사용하는 메소드는?

- System.nanoTime()

#### 12. System.out.print() 메소드와 System.out.println()메소드의 차이는?

- 출력 후 개행여부

#### ⚠️ 13. System.out.println() 메소드에 객체가 매개변수로 넘어왔을 때 String의 어떤 메소드가 호출되어 결과를 출력하나요?

- valueOf(), 전달 받은 객체가 null값인 경우 문자열로 null을 반환하기 위해