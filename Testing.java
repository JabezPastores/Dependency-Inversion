public class Testing {
    public static void main(String[] args) throws Exception {
        Capstone capstone = new Capstone("Sign Language Translator");
        Student student = new Student();

        student.borrowResource(capstone);
    }
}