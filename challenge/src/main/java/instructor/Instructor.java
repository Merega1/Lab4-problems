package instructor;

import student.Person;

public class Instructor extends Person {
    private String employeeNumber;

    public Instructor() {
        this("", "", "", "", "");
    }

    public Instructor(String nom, String prenom, String telephone,
                      String email, String employeeNumber) {
        super(prenom, nom, telephone, email);
        this.employeeNumber = employeeNumber;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    // 1
    public String cleanEmployeeNumber() {
        return employeeNumber.trim().replace(" ", "");
    }

    // 4
    public String summaryLine() {
        return String.format(
                "Instructor[employeeNumber=%s, lastName=%s, firstName=%s]",
                employeeNumber, secondName, firstName
        );
    }

    // 6
    public String toCard() {
        StringBuilder result = new StringBuilder();

        result.append("Instructor\n")
                .append("----------\n")
                .append("Employee #: ").append(employeeNumber).append("\n")
                .append("Name : ").append(secondName)
                .append(", ").append(firstName).append("\n")
                .append("Email : ").append(email).append("\n")
                .append("Phone : ").append(phone);

        return result.toString();
    }

    // 8
    public String displayName() {
        StringBuilder result = new StringBuilder();

        if (secondName != null) {
            result.append(secondName);
        }

        if (firstName != null) {
            if (result.length() > 0) {
                result.append(" ");
            }

            result.append(firstName);
        }

        return result.toString();
    }

    @Override
    public String toString() {
        return summaryLine();
    }
}