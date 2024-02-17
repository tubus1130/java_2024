package ch10;

public class Dog extends Animal{
    String size;
    @Override
    public void move() {
        System.out.println("강아지가 움직입니다.");
    }

    @Override
    public void eatFood() {
        System.out.println("강아지가 밥을 먹습니다.");
    }
}
