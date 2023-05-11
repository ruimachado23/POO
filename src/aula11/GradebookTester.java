package aula11;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class GradebookTester {
    public static void main(String[] args) {
        // Create a new Gradebook instance
        Gradebook gradebook = new Gradebook();

        // Load the student data from a text file
        gradebook.load("alunos.txt");

        // Add a new student to the collection
        Double[] gradesArray = {10.0, 10.0, 10.0};
        List<Double> gradesList = new ArrayList<>(Arrays.asList(gradesArray));
        Student newStudent = new Student("Johny May", gradesList);
        gradebook.addStudent(newStudent);

        // Remove a student from the collection
        gradebook.removeStudent("Jane Smith");

        // Retrieve a student from the collection
        gradebook.getStudent("John Doe");

        // Calculate the average grade for a specific student
        double averageGrade = gradebook.calculateAverageGrade("John Doe");
        System.out.println("Average grade for John Doe: " + averageGrade);

        // Print a summary of all students in the collection
        gradebook.printAllStudents();
    }
}

