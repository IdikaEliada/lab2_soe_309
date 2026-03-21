package infrastructure.repository;

import domain.Student;
import infrastructure.data.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class GetStudentRepository {
    public List<Student> getStudents() {
        // Fix: initialize as an empty list instead of passing null
        List<Student> students = new ArrayList<>();

        try {
            Connection connection = DatabaseConnection.getConnection();
            String sql = "SELECT * FROM students";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                // Fix: use the parameterized constructor
                Student student = new Student(
                        resultSet.getInt("id"),
                        resultSet.getString("reg_number"), // Make sure this column name matches your DB table
                        resultSet.getString("first_name"), // Make sure this column name matches your DB table
                        resultSet.getString("last_name"), // Make sure this column name matches your DB table
                        resultSet.getString("phone"),
                        resultSet.getString("email"),
                        resultSet.getString("department"));

                students.add(student);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return students;
    }
}
