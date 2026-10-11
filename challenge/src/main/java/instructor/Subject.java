package instructor;

public class Subject {
    private static int nextId = 1;

    private int id;
    private String code;
    private String title;
    private Instructor instructor;

    public Subject() {
        this("", "", null);
    }

    public Subject(String code, String title, Instructor instructor) {
        this.id = nextId++;
        this.code = code;
        this.title = title;
        this.instructor = instructor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    // 2
    public String normalizedCode() {
        return code.trim().toUpperCase();
    }

    // 3
    public String properTitle() {
        String[] words = title.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                if (result.length() > 0) {
                    result.append(" ");
                }

                result.append(word.substring(0, 1).toUpperCase())
                        .append(word.substring(1));
            }
        }

        return result.toString();
    }

    // 5
    public boolean isIntroCourse() {
        return title.toLowerCase().contains("intro")
                || code.startsWith("INTRO-");
    }

    // 7
    public String syllabusLine(Instructor instructor) {
        StringBuilder result = new StringBuilder();

        result.append(code)
                .append(" - ")
                .append(title)
                .append(" (Instructor: ")
                .append(instructor.getSecondName())
                .append(" ")
                .append(instructor.getFirstName())
                .append(")");

        return result.toString();
    }

    @Override
    public String toString() {
        return String.format(
                "Subject[id=%d, code=%s, title=%s]",
                id, code, title
        );
    }
}