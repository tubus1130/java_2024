package ch06;

public class InterestManager {
    public static void main(String[] args) {
        InterestManager manager = new InterestManager();
        for(int i=1; i<=365; i+=10){
            System.out.println(i + "일의 이자는 : " + manager.calculateAmount(i, 1_000_000));
        }
    }
    public double getInterestRate(int day){
        if(day <= 90){
            return 0.5;
        }else if(day <= 180){
            return 1;
        }else if(day <= 364){
            return 2;
        }else{
            return 5.6;
        }
    }
    public double calculateAmount(int day, long amount){
        double rate = getInterestRate(day) * amount / 100.0 + amount;

        return rate;
    }
}
