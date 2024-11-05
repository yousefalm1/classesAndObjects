package University;

public class Course {

    private String courseName;
    private String instructor;
    private int numberOfStudents;


    public Course(String courseName, String instructor, int numberOfStudents) {

        this.courseName = courseName;
        this.instructor = instructor;
        this.numberOfStudents = numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getInstructor() {
        return instructor;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }


    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", instructor='" + instructor + '\'' +
                ", numberOfStudents=" + numberOfStudents +
                '}';
    }
}
