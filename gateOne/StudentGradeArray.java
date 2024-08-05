import java.util.Arrays;
import java.util.Scanner;
public class StudentGradeArray {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

System.out.println("Welcome to Lagbaja Schools");

System.out.println("Enter the number of students: ");
int numberOfStudents = input.nextInt();

System.out.println("Enter the number of Subjects: ");
int numberOfSubjects = input.nextInt();
System.out.println("Saving >>>>>>>>>>>>>>>>");
System.out.println("Saved successfully");

int[][] scores = new int[numberOfStudents][numberOfSubjects];
int[] studentsum = new int[numberOfStudents];
double[] studentaverage = new double[numberOfStudents];
int sum = 0;

for (int student = 0; student < numberOfStudents; student++) {
	System.out.println();
	System.out.println("Entering scores for Student " + (student + 1));
	for(int studentScores = 0; studentScores < numberOfSubjects; studentScores++) {
	System.out.println("Enter the student score in subject " + (studentScores + 1));
	int score = input.nextInt();
	System.out.println("Saving >>>>>>>>>>>>>>>>");
	System.out.println("Saved successfully");
		if(score > 100 || score < 0){
		System.out.println("Invalid score, Enter the student score in subject " + (studentScores + 1));
		score= input.nextInt();
	
		}
	   
		scores[student][studentScores] = score;
		studentsum[student] += score;
	}

	
	studentaverage[student] = (double) studentsum[student] / numberOfSubjects;
}
System.out.println();
for (int student = 0; student < numberOfStudents; student++) {
System.out.println("The summary of the performance for Student " + (student + 1) + " is:");
for(int studentScores = 0; studentScores < numberOfSubjects; studentScores++) {
System.out.print(scores[student][studentScores] + " ");
}
System.out.println();
System.out.println("The total score for student " + (student + 1) + " is "+ studentsum[student]);
System.out.printf("the average Score for Student %d is %.2f\n", (student + 1), studentaverage[student]);
System.out.println();
}

System.out.printf("STUDENT\t");
for(int subject = 0; subject < numberOfSubjects; subject++){
	System.out.printf("\tSUB" + (subject + 1));
	}
System.out.print("\tTOTAL\tAVERAGE");








}
}