package student;

public class Major {
    private static int nextId = 1;
    private static int CAPACITY = 50;
    private int id;
    private String code;
    private String name;

    private Student[] students = new Student[CAPACITY];
    private int studentCount = 0;
    public static final Major COMPUTER_SCIENCE =
            new Major("23", "Computer Science");
    public Major(){
        this("", "");
    }

    public Major(String code, String name) {
        this.id = nextId++;
        this.code = code;
        this.name = name;
    }

    // Method to add a student
    public void addStudent(Student s) {
        if(studentCount < CAPACITY && s != null){
            this.students[studentCount] = s;
            studentCount++;
            s.setMajor(this);
        }
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public double getOccupancyRate() {
        return 100.0 * studentCount / CAPACITY;
    }
    public void displayStudents(){
        System.out.println("The list of students in the " + this.name + "is : ");
        for(int i = 0; i <studentCount; i++){
            System.out.println((i + 1) + " " + students[i].getCne() );
        }
    }
    public Student findStudentByCNE(String cne) {
        for (int i = 0; i < studentCount; i++) {
            if (students[i].getCne().equals(cne)) {
                return students[i];
            }
        }
        return null;
    }

    public boolean removeStudent(String cne) {
        Student student = findStudentByCNE(cne);
        if (student == null) {
            return false;
        }
        for (int i = 0; i < studentCount; i++) {
            if (students[i] == student) {
                for (int j = i; j < studentCount - 1; j++) {
                    students[j] = students[j + 1];
                }
                studentCount--;
                students[studentCount] = null;
                return true;
            }
        }
        return false;
    }

    public String getStudentListAsString() {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < studentCount; i++) {
            result.append(i + 1)
                    .append(". ")
                    .append(students[i])
                    .append(System.lineSeparator());
        }

        return result.toString();
    }

    @Override
    public String toString() {
        return String.format(
                "Major[id=%d, code=%s, name=%s]",
                id, code, name
        );
    }
}
