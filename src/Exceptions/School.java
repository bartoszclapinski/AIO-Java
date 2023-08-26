package Exceptions;

import Exceptions.Custom.NoElementFoundException;
import Exceptions.Custom.NoMoreSpaceException;

public class School {
    private final Student[] students;
    private int studentsNumber;

    public School(int studentsNumber) {
        this.students = new Student[studentsNumber];
    }

    public void add(Student student) throws NoMoreSpaceException {
        if (studentsNumber == students.length) {
            throw new NoMoreSpaceException("No more space in school");
        }
        students[studentsNumber] = student;
        studentsNumber++;
    }

    public Student find(String firstName, String lastName) throws NoElementFoundException {
        int i = 0;
        while (i < studentsNumber) {
            if (students[i].getFirstName().equals(firstName) && students[i].getLastName().equals(lastName)) {
                return students[i];
            }
            i++;
        }
        throw new NoElementFoundException("No element found");
    }
}
