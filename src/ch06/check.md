### 💭 6장 정리

---

#### ☑️ 조건문
```java
class Condition{
    public static void main(String[] args) {
        // if else문
        if(point > 90){

        }else if(point > 80){

        }else{

        }
        
        // switch문
        switch(비교대상변수){
            case 점검값1: 
                
            break;
            case 점검값2:
                
            break;
            default:
                
            break;
        }
    }
}
```

#### ☑️ 반복문

```java
class Loop{
    public static void main(String[] args) {
        // while문
        while(boolean 조건){
            
        }
        
        // do-while문
        do{
            
        }while(boolean 조건);
        
        // for문
        for(초기화;종료조건;증감식) {

        }
    }
}
```

---

### 💭 단답형

#### 1. if 문장의 소괄호 안에는 어떤 형태의 결과가 제공되어야 하나요?

- boolean

#### 2. if 조건에 맞지 않는 모든 경우를 처리할 때 사용하는 예약어는?

- else

#### ⚠️ 3. switch를 사용할 수 있는 기본 자료형의 타입에는 어떤 것들이 있나요?

- long을 제외한 정수, Enum, String

#### 4. switch 블록 안에서 비교 대상값 앞에 사용하는 예약어는?

- case

#### 5. switch 조건을 빠져나가도록 하는 예약어는?

- break

#### 6. switch 조건들에 맞지 않을 때 기본처리를 하기위한 예약어는?

- default

#### 7. while문의 소괄호 안에는 어떤 형태의 결과가 제공되어야 하나요?

- boolean

#### 8. while문을 무조건 한번은 실행하게 하려면 어떻게 해야 하나요?

- do-while문

#### 9. while문을 마음대로 빠져나가게 하려면 어떤 예약어를 사용하면 되나요?

- break

#### 10. while문의 중간에 while문의 소괄호 점검 구문으로 건너 뛰도록 할때 사용하는 예약어?

- continue

#### 11. for 루프의 소괄호안의 가장 첫 구문은 for 루프가 수행되는 동안 몇번수행되나요?

- 1번

#### 12. for 루프의 소괄호 안의 중간에 있는 구문은 어떤 타입의 결과가 제공되어야 하나요?

- boolean

#### 13. for 루프의 소괄호 안의 마지막에 있는 구문에서는 어떤 작업을 수행하나요?

- index의 증감식