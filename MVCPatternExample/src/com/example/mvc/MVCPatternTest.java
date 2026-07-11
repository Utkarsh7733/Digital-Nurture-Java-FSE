package com.example.mvc;

public class MVCPatternTest {

    public static void main(String[] args) {

        Student model = new Student("Utkarsh", 101, "A");

        StudentView view = new StudentView();

        StudentController controller =
                new StudentController(model, view);

        controller.updateView();

        controller.setStudentName("Rahul");
        controller.setStudentGrade("A+");

        System.out.println();

        controller.updateView();
    }
}