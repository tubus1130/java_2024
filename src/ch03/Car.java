package ch03;

public class Car {
    public Car(){

    }
    int speed;
    int distance;
    String color;

    public void speedUp(){
        speed += 5;
    }
    public void breakDown(){
        speed -= 10;
    }
    public int getCurrentSpeed(){
        return speed;
    }
}
