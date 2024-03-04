package ch15;

public class UseStringMethods {
    public static void main(String[] args){
        String string = "The String class represents character strings.";
        UseStringMethods methods = new UseStringMethods();
        methods.printWords(string);
        methods.findString(string, "string");
        methods.findAnyCaseString(string, "string");
        methods.countChar(string, 's');
        methods.printContainWords(string, "ss");
    }
    public void printWords(String str){
        String[] arr = str.split(" ");
        for(String strtemp : arr){
            System.out.println(strtemp);
        }
    }
    public void findString(String str, String findStr){
        System.out.println(findStr + " is appeared at " + str.indexOf(findStr));
    }
    public void findAnyCaseString(String str, String findStr){
        System.out.println(findStr + " is appeared at " + str.toLowerCase().indexOf(findStr));
    }
    public void countChar(String str, char c){
        char[] arr = str.toCharArray();
        int cnt = 0;
        for(char ch : arr){
            if(ch == c){
                cnt++;
            }
        }
        System.out.println("char '" + c + "' count is " + cnt);
    }
    public void printContainWords(String str, String findStr){
        String[] words = str.split(" ");
        for(String temp : words){
            if(temp.contains(findStr)){
                System.out.println(temp + " contains " + findStr);
            }
        }
    }
}
