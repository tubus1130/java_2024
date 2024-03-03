### 💭 13장 정리

---

#### ☑️ interface
```java
public interface MemberManager{
    public boolean addMember(MemberDTO member);
    public boolean removeMember(String name, String phone);
}
```

- 인터페이스를 구현하는 클래스는 인터페이스의 `모든 메소드를 구현`해야 함(public abstract가 생략된 것)
- 상속이 아니므로 2개 이상의 인터페이스를 구현할 수 있음(`implements`)
- `public static final`과 `public abstract` 제어자는 생략이 가능하다
- 자식클래스에서 상속과 구현은 동시에 가능하다

[인터페이스 설명 참고사이트](https://inpa.tistory.com/entry/JAVA-%E2%98%95-%EC%9D%B8%ED%84%B0%ED%8E%98%EC%9D%B4%EC%8A%A4Interface%EC%9D%98-%EC%A0%95%EC%84%9D-%ED%83%84%ED%83%84%ED%95%98%EA%B2%8C-%EA%B0%9C%EB%85%90-%EC%A0%95%EB%A6%AC)

#### ☑️ abstract class
```java
public abstract class MemberManagerAbstract{
    public abstract boolean addMember(MemberDTO member);
    public abstract boolean removeMember(String name, String phone);
    public void printLog(String data){
        System.out.println("Data = " + data);
    }
}
```

- abstract로 선언된 메소드가 하나라도 있으면, 그 클래스는 반드시 abstract로 선언되어야만 한다.
- abstact 클래스는 몸통이 있는 메소드가 있어도 상관 없으며, static이나 final 메소드가 있어도 된다.
- abstract클래스를 상속받는 클래스는 `abstract메소드를 모두 구현`해야 함
- 추상클래스는 객체 생성 불가

[추상클래스 설명 참고사이트](https://inpa.tistory.com/entry/JAVA-%E2%98%95-%EC%B6%94%EC%83%81-%ED%81%B4%EB%9E%98%EC%8A%A4Abstract-%EC%9A%A9%EB%8F%84-%EC%99%84%EB%B2%BD-%EC%9D%B4%ED%95%B4%ED%95%98%EA%B8%B0)

#### ☑️ final

- `final Class` : 상속 불가
- `final Method` : 오버라이딩 불가
- `final Variable` : 값 변경 불가
  - 인스턴스 변수나 클래스 변수는 생성과 동시에 초기화를 해줘야된다.

```java
import ch08.MemberDTO;

public class FinalReferenceType {
    final MemberDTO dto = new MemberDTO();
    public static void main(String[] args) {
        FinalReferenceType referenceType = new FinalReferenceType();
        referenceType.checkDTO();
    }
    public void checkDTO(){
        dto.name = "dongho"; // 가능
        System.out.println(dto);
    }
}
```

- 해당 클래스가 final이라 해서, 그 안에 있는 인스턴스 변수나 클래스 변수가 final은 아니다.

#### ☑️ enum

```java
public enum OverTimeValue{
    THREE_HOUR(18000),
    FIVE_HOUR(30000),
    WEEKEND_FOUR_HOUR(40000),
    WEEKEND_EIGHT_HOUR(60000);
    private final int amount;
    OverTimeValue(int amount){
        this.amount = amount;
    }
    public int getAmount(){
        return amount;
    }
}
```

- 고정되어 있는 값을 처리할 때 유용

---

### 💭 단답형

#### 1. 인터페이스에 선언되어 있는 메소드는 body(몸통)이 있어도 되나요?

- X

#### 2. 인터페이스를 구현하는 클래스의 선언시 사용하는 예약어는?

- implements

#### 3. 일부만 완성되어 있는 클래스를 무엇이라고 하나요?

- 추상 클래스

#### 4. 3번의 답에 있는 클래스에 body(몸통)이 없는 메소드를 추가하려면 어떤 예약어를 추가해야 하나요?

- abstract

#### 5. 클래스를 final로 선언하면 어떤 제약이 발생하나요?

- 상속 불가

#### 6. 메소드를 final로 선언하면 어떤 제약이 발생하나요?

- 오버라이딩 불가

#### 7. 변수를 final로 선언하면 어떤 제약이 발생하나요?

- 값 수정 불가

#### 8. enum 클래스 안에 정의하는 여러개의 상수들을 나열하기 위해서는 상수 사이에 사용하는 기호는?

- ,(콤마)

#### ⚠️ 9. enum으로 선언한 클래스는 어떤 클래스의 상속을 자동으로 받게되나요?

- java.lang.Enum

#### ⚠️ 10. enum클래스에 선언되어 있지 않지만 컴파일시 자동으로 추가되는 상수의 목록을 배열로 리턴하는 메소드는?

- values( )