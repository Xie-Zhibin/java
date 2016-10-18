
public class TestCourse {
    public static void main(String[] args) {
        Course course1 = new Course("Data Structures");
        Course course2 = new Course("Database System");

        course1.addStudent("Peter Jones");
        course1.addStudent("island");

        course2.addStudent("island");
        course2.addStudent("Beyond");

        System.out.println("Number of students int course1: " +
                           course1.getNumberOfStudents());
        String[] students = course1.getStudents();
        for (int i = 0; i < course1.getNumberOfStudents(); i++) {
            System.out.print(students[i] + ", ");
        }
        System.out.println();
        System.out.print("Number of students in course2: " +
                         course2.getNumberOfStudents());
    }
}
