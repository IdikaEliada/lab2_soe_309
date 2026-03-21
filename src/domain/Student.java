

package domain;

public class Student {
    private final Integer id;
    private final String regNumber;
    private final String firstName;
    private final String lastName;
    private final String phone;
    private final String email;
    private final String department;

    public Student(Integer id, String regNumber, String firstName,
            String lastName, String phone, String email, String department) {
        this.id = id;
        this.regNumber = regNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
        this.department = department;
    }

    public Integer getId() {
        return id;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getDepartment() {
        return department;
    }
}