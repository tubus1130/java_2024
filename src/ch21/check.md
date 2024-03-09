### 💭 21장 정리

---

#### ☑️ 제네릭

```java
import java.io.Serializable;

class GenericDTO<T> implements Serializable {
    private T object;

    public void setObject(T object) {
        this.object = object;
    }

    public T getObject() {
        return object;
    }
}

class GenericSample{
    public static void main(String[] args) {
        GenericSample sample = new GenericSample();
        sample.checkDTO();
    }
    public void checkDTO(){
        GenericDTO<String> dto1 = new GenericDTO<String>();
        GenericDTO<StringBuilder> dto2 = new GenericDTO<StringBuilder>();
        GenericDTO<StringBuffer> dto3 = new GenericDTO<StringBuffer>();
        
        dto1.setObject(new String());
        dto2.setObject(new StringBuilder());
        dto3.setObject(new StringBuffer());
        
        // 제네릭으로 선언하면 형변환을 해주지 않아도 됨
        // String temp1 = (String)dto1.getObject();
        String temp1 = dto1.getObject();
        StringBuilder temp2 = dto2.getObject();
        StringBuffer temp3 = dto3.getObject();
    }
}
```

- 타입 형변환에서 발생할 수 있는 문제점을 사전(컴파일 단계)에 없애기 위해서 만들어짐

#### ☑️ 와일드카드

```java
class WildcardGeneric<W>{
    W wildcard;
    public void setWildcard(W wildcard){
        this.wildcard = wildcard;
    }
    public void getWildcard(){
        return wildcard;
    }
}
class WildcardSample{
    public static void main(String[] args) {
        WildcardSample sample = new WildcardSample();
        sample.callWildCardMethod();
    }
    public void callWildCardMethod(){
        // 특정 타입으로 값 지정 불가능
        // WildCardGeneric<?> wildcard = new WildCardGenric<String>();
        WildCardGeneric<String> wildcard = new WildCardGenric<String>();
        wildcard.setWildCard("A");
        wildcardStringMethod(wildcard);
    }
    // String이 아닌 다른 타입으로 선언된 객체를 받으려고 할때 문제발생
    // public void wildcardStringMethod(WildCardGeneric<String> c){
    public void wildcardStringMethod(WildCardGeneric<?> c){
        Object value = c.getWildcard();
        System.out.println(value);
    }
}
```

- 와일드카드는 `메소드의 매개변수로만 사용`하는 것이 좋다
- 와일드카드로 선언하고 그 객체의 값은 가져올 수 있지만, 특정타입으로 값을 지정하는 것은 불가능

#### ☑️ Bounded 와일드카드

```java
// Car 클래스를 상속받은 Bus 클래스가 있다고 가정

public class CarWildcardSample{
    public static void main(String[] args) {
        CarWildcardSample sample = new CarWildcardSample();
        sample.callBoundedWildcardMethod();
    }
    public void callBoundedWildcardMethod(){
        WildcardGeneric<Bus> wildcard = new WildcardGeneric<Bus>();
        wildcard.setWildcard(new Bus("6620"));
        boundedWildcardMethod(wildcard);
    }
    public void boundedWildcardMethod(WildcardGeneric<? extends Car> c){
        Car value = c.getWildcard();
        System.out.println(value); // Bus name = 6620
    }
}
```

- 와일드카드로 사용하는 타입을 제한할 수 있음
- 예제에서는 Car를 상속받는 클래스만 들어갈 수 있게 제한해둠
- 위와 마찬가지로 조회용 매개변수로만 사용해야 한다.

---

### 💭 단답형

#### 1. 제네릭이 자바에 추가된 이유는?

- 타입 형변환에서 발생할 수 있는 문제점을 사전에 없애기 위해 만들어짐

#### 2. 제네릭 타입의 이름은 T나 E처럼 하나의 캐릭터로 선언되어야 하나요?

- 상관없음, 단 대문자로 시작해야 한다

#### 3. 메소드에서 제네릭 타입을 명시적으로 지정하기 애매할 경우에는 <> 안에 어떤 기호를 넣나요?

- `<?>`

#### 4. 메소드에서 제네릭 타입을 명시적으로 지정하기에는 애매하지만, 어떤 클래스의 상속을 받은 특정타입만 가능하다는 것을 나타내려면 어떤 기호를 넣나요?

- `<? extends 타입>`

#### 5. 제네릭 선언시 wildcard라는 것을 선언했을 때 어떤 제약사항이 있나요?

- 값 지정 불가, 호출만 가능

#### ⚠️ 6. 메소드를 제네릭하게 선언하려면 리턴타입 앞에 어떤 것을 추가해 주면 되나요?

- 꺽쇠 안에 원하는 제네릭 타입을 명시한다