package ch23;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RandomNumberMaker {
    public static void main(String[] args) {
        RandomNumberMaker maker = new RandomNumberMaker();
        for(int i=0; i<10; i++){
            System.out.println(maker.getSixNumber());
        }
    }
    public HashSet<Integer> getSixNumber(){
        HashSet<Integer> sample = new HashSet<Integer>();
        while(true){
            if(sample.size() == 6){
                break;
            }
            Random random = new Random();
            int tempNumber = random.nextInt(45) + 1;
            sample.add(tempNumber);
        }

        return sample;
    }
}
