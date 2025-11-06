package task3;

import java.io.*;

public class Main {
    private final static String FILENAME = "enrollment.ser";

    public static void main(String[] args) {
        File file = new File(FILENAME);
        Student student = new Student(1, "Mustafa", 21);
        Course course = new Course("1111", "Linux", "Joseph");
        Enrollment enrollment = new Enrollment(student, course, "11-12-25");

        if (file.exists() && file.isFile()) {
            try (
                    FileInputStream input = new FileInputStream(file);
                    ObjectInputStream objectInput = new ObjectInputStream(input);
            ) {
                enrollment = (Enrollment) objectInput.readObject();
                System.out.println("Enrollment: " + enrollment);
                System.out.println("Student: " + enrollment.getStudent().getName());
                System.out.println("Course: " + enrollment.getCourse().getCourseName());
                System.out.println("EnrollmentDate: " + enrollment.getEnrollmentDate());
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            try (
                    FileOutputStream output = new FileOutputStream(file);
                    ObjectOutputStream objects = new ObjectOutputStream(output);
            ) {
                objects.writeObject(enrollment);

                System.out.println  ("File is made and enrollment is written to file");

            } catch (Exception e) {
                System.err.println("Writing person: " + e);
            }

        }

    }
}
