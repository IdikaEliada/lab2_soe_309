import domain.Student;
import infrastructure.repository.GetStudentRepository;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        GetStudentRepository getStudentRepository = new GetStudentRepository();
        List<Student> students = getStudentRepository.getStudents();
        for (Student student : students) {
            System.out.println("---------------");
            System.out.println("ID: " + student.getId());
            System.out.println("Reg Number: " + student.getRegNumber());
            System.out.println("First Name: " + student.getFirstName());
            System.out.println("Last Name: " + student.getLastName());
            System.out.println("Phone: " + student.getPhone());
            System.out.println("Email: " + student.getEmail());
            System.out.println("Department: " + student.getDepartment());
            System.out.println("---------------");
        }
    }
}
