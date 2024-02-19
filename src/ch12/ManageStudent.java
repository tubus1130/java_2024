package ch12;

public class ManageStudent {
    public static void main(String[] args) {
        //Student[] student = null;
        //ManageStudent manage = new ManageStudent();
        //student = manage.addStudent();
        //manage.printStudents(student);
        ManageStudent manage = new ManageStudent();
        manage.checkEquals();
    }
    public Student[] addStudent(){
        Student[] student = new Student[3];
        student[0] = new Student("Lim");
        student[1] = new Student("Min");
        student[2] = new Student("Sook", "Seoul", "010XXXXXXXX", "ask@godofjava.com");
        return student;
    }
    public void printStudents(Student[] student){
        for(Student st : student){
            System.out.println(st.toString());
        }
    }
    public void checkEquals(){
        Student a = new Student("Min", "Seoul", "010XXXXXXXX", "ask@godofjava.com");
        Student b = new Student("Min", "Seoul", "010XXXXXXXX", "ask@godofjava.com");
        if(a.equals(b)){
            System.out.println("Equal");
        }else{
            System.out.println("Not Equal");
        }
    }
}
