package Design_Patterns.Builder.v1_getBuiler_Method;

public class Client {
    public static void main(String[] args) {

//        StudentBuilder studentBuilder=new StudentBuilder();
        StudentBuilder studentBuilder=Student.getBuilder();
        studentBuilder.setAge(25);
        studentBuilder.setfName("abc");
        studentBuilder.setlName("xyz");
        studentBuilder.setEmail("abc@xyz");

        Student student=new Student(studentBuilder);

        System.out.println(student.toString());
    }
}
