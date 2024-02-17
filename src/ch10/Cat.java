package ch10;

public class Cat extends Animal{
    boolean likeMouse;
    @Override
    public void move() {
        System.out.println("고양이가 움직입니다.");
    }

    @Override
    public void eatFood() {
        System.out.println("고양이가 밥을 먹습니다.");
    }
}
