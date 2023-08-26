package Exceptions;

import Exceptions.Custom.NoMoreSpaceException;

public class SchoolApp {
    public static void main(String[] args) {
        School school = new School(2);

        try {
            school.add(new Student(1, "John", "Doe"));
            school.add(new Student(2, "Jane", "Doe"));
            school.add(new Student(3, "John", "Smith"));
        } catch (NoMoreSpaceException e) {
            System.err.println(e.getMessage());
        }

        try {
            System.out.println(school.find("John", "Smith"));
            System.out.println(school.find("John", "Doe"));
            System.out.println(school.find("Jane", "Doe"));
            System.out.println(school.find("John", "Kowalski"));
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
