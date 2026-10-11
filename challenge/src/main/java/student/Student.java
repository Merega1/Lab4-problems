package student;

public class Student extends Person {
    private String cne;
    private Major major;

    public Student(){
        this("", "", "", "", "");
    }
    public Student(String nom, String prenom, String telephone, String email, String cne, Major major) {
        super(prenom, nom, telephone, email);
        this.cne = cne;
        this.major = major;
        major.addStudent(this);
    }
    public Student(String nom, String prenom, String telephone, String email, String cne) {

        super(prenom, nom, telephone, email);
        this.cne = cne;
        this.major = Major.COMPUTER_SCIENCE;
        major.addStudent(this);
    }

    // Getters
    public String getCne(){
        return cne;
    }
    public String getMajor(){
        return getMajor();
    }
    // Setters
    public void setMajor(Major major) {
        this.major = major;
    }

    public void setCne(String cne) {
        this.cne = cne;
    }

    public String getFullNameFormatted() {
        return String.format(
                "%s, %s",
                secondName.toUpperCase(),
                firstName
        );
    }

    @Override
    public String toString() {
        return String.format(
                "%s %s %s",
                cne,
                secondName.toUpperCase(),
                firstName
        );
    }

}

