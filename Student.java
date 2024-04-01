import java.time.LocalDate;
import java.time.Period;

public class Student {
    private String name;
    private LocalDate dob;

    public Student(String name, String dob) {
        this.name = name;
        this.dob = LocalDate.parse(dob);
    }

    public void displayInfo() {
        int age = calculateAge();
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    private int calculateAge() {
        LocalDate today = LocalDate.now();
        Period period = Period.between(dob, today);
        return period.getYears();
    }

    public static void main(String[] args) {
        Student student1 = new Student("John Doe", "2000-05-15");
        student1.displayInfo();
    }
}

class StudentCourses {
    private String semester;
    private String[] courses;
    private int[] marks;

    public StudentCourses(String semester, String[] courses, int[] marks) {
        this.semester = semester;
        this.courses = courses;
        this.marks = marks;
    }

    public void displayCourseInfo() {
        System.out.println("Semester: " + semester);
        for (int i = 0; i < courses.length; i++) {
            System.out.println("Course: " + courses[i] + ", Mark: " + marks[i]);
        }
    }

    public static void main(String[] args) {
        String[] coursesSemester1 = {"Math", "Science", "History"};
        int[] marksSemester1 = {85, 90, 78};
        StudentCourses semester1Info = new StudentCourses("Semester 1", coursesSemester1, marksSemester1);
        semester1Info.displayCourseInfo();
    }
}
