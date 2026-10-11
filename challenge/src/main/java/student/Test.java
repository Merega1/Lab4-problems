package student;

public class Test {
    public static void main(String[] args) {
        Major computerScience = Major.COMPUTER_SCIENCE;
        Major mathematics = new Major("24", "Mathematics");

        Student amal = new Student(
                "Amal", "Esamourai", "0612121212",
                "amal@samorai.com", "CB1111"
        );

        Student samir = new Student(
                "Samir", "Eraya", "0632563265",
                "samir@eraya.com", "CD1112",
                computerScience
        );
        Student sara = new Student(
                "Koura", "Imane", "0632456789",
                 "koura@imane.com", "CD3232",
                mathematics
        );
        // Display computer science students
        System.out.println(
                "The list of students in the computer science major is:"
        );
        System.out.print(computerScience.getStudentListAsString());

        System.out.println(
                "Formatted name: " + amal.getFullNameFormatted()
        );

        System.out.println(
                "Student found: "
                        + computerScience.findStudentByCNE("23585976")
        );

        System.out.println(
                "Current enrollment: " + computerScience.getStudentCount()
        );

        System.out.println(
                "Occupancy rate = " + computerScience.getOccupancyRate() + "%"
        );

        System.out.println(
                "Student removed: "
                        + computerScience.removeStudent("CB1111")
        );

        System.out.println("After removal:");
        System.out.print(computerScience.getStudentListAsString());

        System.out.println(
                "Current enrollment: " + computerScience.getStudentCount()
        );

        System.out.println(
                "Occupancy rate = " + computerScience.getOccupancyRate() + "%"
        );
    }
}