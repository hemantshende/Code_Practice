package Design_Patterns.Builder.v5_final_impl_innerClass;

public class Client {
    public static void main(String[] args) {

//        StudentBuilder studentBuilder=new StudentBuilder();
        Student student=
                Student.getBuilder()
                .setAge(25)
                .setfName("abc")
                .setlName("xyz")
                .setEmail("abc@xyz").build();

//        Student student=new Student(studentBuilder);

        System.out.println(student.toString());

        //

    }
}
