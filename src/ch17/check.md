### 💭 17장 정리

---

#### ☑️ @Override

- 해당 메소드가 부모 클래스에 있는 메소드를 Override 했다는 것을 명시적으로 선언함
- 실수로 매개변수가 하나 빠질 경우, 어노테이션을 통해 컴파일러가 오류를 찾아줌(제대로 오버라이드 했는지 확인하는 수단)

#### ☑️ @Deprecated

- 클래스나 메소드가 더 이상 사용되지 않는 경우
- 하위 버전 호환성을 위해서 선언이 필요함

#### ☑️ @SupressWarnings

- 컴파일러가 경고를 날린것에 대해, 내가 일부러 한것이라고 경고를 표시하지 말라고 할 때(`경고제외`)

```java
public class Sample{
    @SuppressWarnings("deprecation")
    public void useDeprecated(){
        
    }
}
```

#### ☑️ 메타 어노테이션

- 메타 어노테이션은 어노테이션을 우리가 직접 선언할 때 사용
- `@Target` : 어노테이션을 어떤 것에 적용할지를 선언
- `@Retention` : 얼마나 오래 어노테이션 정보가 유지되는지를 선언
- `@Documented` : 해당 어노테이션 정보가 Javadocs(API) 문서에 포함된다는 것을 선언
- `@Inherited` : 모든 자식클래스에서 부모 클래스의 어노테이션을 사용가능하다는 것을 선언

```java
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface userAnnotation{
    public int number();
    public String text() default "This is first annotation";
}
```


---

### 💭 단답형

#### 1. @Override 어노테이션의 용도는?

- 이 메소드가 오버라이드된 메소드라는 것을 명시적으로 알려줌

#### 2. @SupressWarning 어노테이션의 용도는?

- 경고에 대해 내가 이미 인지하고 있다는것을 알려줌(경고 제외)

#### 3. @Deprecated 어노테이션의 용도는?

- 더이상 사용하지 않음을 컴파일러에게 알림

#### 4. 어노테이션을 선언할 때 사용하는 어노테이션을 무엇이라고 부르나요?

- 메타 어노테이션

#### 5. 4번의 답에 있는 어노테이션을 사용할 때 import 해야하는 패키지는?

- java.lang.Annotation

#### ⚠️ 6. @Target 어노테이션의 용도는?

- 어노테이션을 어떤 것에 적용할지를 선언

#### ⚠️ 7. @Retention 어노테이션의 용도는?

- 얼마나 오래 어노테이션 정보가 유지되는지를 선언

#### ⚠️ 8. @Inherited 어노테이션의 용도는?

- 모든 자식 클래스에서 부모클래스의 어노테이션을 사용할 수 있다는 것을 선언

#### ⚠️ 9. 어노테이션을 선언할때에는 class 대신 어떤 예약어를 사용해야 하나요?

- @interface

