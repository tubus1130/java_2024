package ch04;

public class ProfilePrint {
    byte age;
    String name;
    boolean isMarried;
    public void setAge(byte age){
        this.age = age;
    }
    public byte getAge(){
        return age;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setMarried(boolean flag){
        isMarried = flag;
    }
    public boolean isMarried(){
        return isMarried;
    }
    public static void main(String[] args) {
        ProfilePrint profile = new ProfilePrint();
        profile.setAge((byte)31);
        profile.setName("김동호");
        profile.setMarried(false);

        System.out.println("나이 : " + profile.getAge());
        System.out.println("이름 : " + profile.getName());
        System.out.println("결혼여부 : " + profile.isMarried());
    }
}
