package io.lab.unittests.junitlab.student;

import io.lab.unittests.junitlab.student.exception.StudentIncorrectStateException;


public class StudentValidator {
    public static void validateGrade(Student student) {
        if(student.getGrade() < 1) {
            throw new StudentIncorrectStateException();
        }
    }
    
    public static void validateFirstName(Student student) {
        if(checkIfStringIsEmptyOrNull(student.getFirstName())) {
            throw new StudentIncorrectStateException();
        }
    }
    
    public static void validateLastName(Student student) {
        if(checkIfStringIsEmptyOrNull(student.getLastName())) {
            throw new StudentIncorrectStateException();
        }
    }
        
    private static boolean checkIfStringIsEmptyOrNull(String string) {
        if(string.trim().equals("") || string == null) {
            return true;
        }
        else {
            return false;
        }
    }
            
}
