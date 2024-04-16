package ch24;

import java.util.Hashtable;
import java.util.Random;
import java.util.Set;

public class RandomNumberStatistics {
    private final int DATA_BOUNDARY = 50;
    Hashtable<Integer, Integer> hashtable = new Hashtable<>();
    public static void main(String[] args){
        RandomNumberStatistics stat = new RandomNumberStatistics();
        stat.getRandomNumberStatistics();
    }
    public void getRandomNumberStatistics(){
        for(int i=0; i<5000; i++){
            Random rand = new Random();
            int tempNumber = rand.nextInt(DATA_BOUNDARY) + 1;
            putCurrentNumber(tempNumber);
        }
        printStatistics();
    }
    public void putCurrentNumber(int tempNumber){
        if(hashtable.containsKey(tempNumber)){
            hashtable.put(tempNumber, hashtable.get(tempNumber) + 1);
        }else{
            hashtable.put(tempNumber, 1);
        }
    }
    public void printStatistics(){
        Set<Integer> set = hashtable.keySet();
        for(int key : set){
            System.out.print(key + "=" + hashtable.get(key) + "\t");
            if(key%10-1 == 0){
                System.out.println();
            }
        }
    }
}
