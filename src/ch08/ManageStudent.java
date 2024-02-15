package ch08;

public class ManageStudent {
    public static void main(String[] args) {
        Student[] student = null;
        ManageStudent manage = new ManageStudent();
        student = manage.addStudent();
        manage.printStudents(student);
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
}
