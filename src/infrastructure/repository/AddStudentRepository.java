package infrastructure.repository;


// Removed: import domain.repository.UserRepository; (unused)
import domain.Student;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import infrastructure.data.DatabaseConnection;


public class AddStudentRepository {
    public void addStudent(Student student) {
        String sql = "INSERT INTO students (reg_number, first_name, last_name, phone, email, department) " +
                "VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, student.getRegNumber());
            pstmt.setString(2, student.getFirstName());
            pstmt.setString(3, student.getLastName());
            pstmt.setString(4, student.getPhone());
            pstmt.setString(5, student.getEmail());
            pstmt.setString(6, student.getDepartment());
            pstmt.executeUpdate();
            System.out.println("Student added successfully");
        } catch (SQLException e) {
            System.err.println("Error adding student: " + e.getMessage()); // use stderr, not stdout
            e.printStackTrace();
        }
    }
}