package com.dipika.student.presentation;
import java.util.Scanner;

public class Student 
{
	    public static void main(String[] args) 
	    {
	        Scanner scanner = new Scanner(System.in);         
	        System.out.println("_______________________________________________");
	        System.out.println();
	        System.out.print("Enter the number of subjects: ");
	        int numSubjects = scanner.nextInt();
	        System.out.println("_______________________________________________");

	        int[] subjectMarks = new int[numSubjects];
	        for (int i = 0; i < numSubjects; i++) {
	            System.out.print("Enter the marks for subject " + (i + 1) + ": ");
	            subjectMarks[i] = scanner.nextInt();
	        }
	        System.out.println("_______________________________________________");

	        int totalMarks=calculateTotalMarks(subjectMarks);
	        double averagePercentage = calculateAveragePercentage(totalMarks, numSubjects);
	        char grade = calculateGrade(averagePercentage);

	        System.out.println("_______________________________________________");
            System.out.println();
            System.out.println("\t __________RESULT________");
            System.out.println("Total Marks   Average Percentage      Grade");
            System.out.println(totalMarks +"\t\t"+ averagePercentage +"\t\t\t"+ grade);
	        
	        System.out.println("_______________________________________________");
	        scanner.close();
	    }

	    private static int calculateTotalMarks(int[] marks) {
	        int total = 0;
	        for (int mark : marks) {
	            total += mark;
	        }
	        return total;
	    }

	    private static double calculateAveragePercentage(int totalMarks, int numSubjects) {
	        return (double) totalMarks / numSubjects;
	    }

	    private static char calculateGrade(double averagePercentage) {
	        if (averagePercentage >= 80) {
	            return 'A';
	        } else if (averagePercentage >= 60 &&  averagePercentage<80) {
	            return 'B';
	        } else if (averagePercentage >= 40 && averagePercentage<60) {
	            return 'C';
	        } else {
	            return 'F';
	        }
	    }
	}

