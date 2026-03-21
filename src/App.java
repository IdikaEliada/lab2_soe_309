import infrastructure.repository.AddStudentRepository;
import domain.Student;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Student student = new Student(
                null,
                "20231368922",
                "Chinonso",
                "Eze",
                "08012345678",
                "chinonso@example.com",
                "Computer Science");
        AddStudentRepository repo = new AddStudentRepository();
        repo.addStudent(student);
    }
}
