package copy;

public class Test {

    public static void main(String[] args) {

        ThreadLocal<String> context = new ThreadLocal<String>();
        context.set("hello");

        String name = "wxg";
        Student student = new Student();
        student.setName(name);

        Student student1 = (Student) student.clone();
        student1.setName("lss");

        //name = "lss";
        System.out.println(student.getName());
        System.out.println(student1.getName());

    }


}
