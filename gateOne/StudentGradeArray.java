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

int[][] scores = new int[numberOfStudents][numberOfSubjects]; //holds scores for each student and subject. holding the size of the number of students and number of subjects. 
int[] studentsum = new int[numberOfStudents]; //storing the sum
double[] studentaverage = new double[numberOfStudents]; //storing the average for ths scores
int sum = 0;

//iterating the inputs for each students
//iterates from student variable from 0 to the number of students length.
for (int student = 0; student < numberOfStudents; student++) {
	System.out.println();
	System.out.println("Entering scores for Student " + (student + 1));
		//iterate through each subject
		for(int studentScores = 0; studentScores < numberOfSubjects; studentScores++) {
			System.out.println();
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
//Printing each students summary
System.out.println();
for (int student = 0; student < numberOfStudents; student++) {
System.out.println("The summary of the performance for Student " + (student + 1) + " is ");
for(int studentScores = 0; studentScores < numberOfSubjects; studentScores++) {
System.out.print(scores[student][studentScores] + " ");
}
System.out.println();
System.out.println("The total score for student " + (student + 1) + " is "+ studentsum[student]);
System.out.printf("the average Score for Student %d is %.2f\n", (student + 1), studentaverage[student]);
System.out.println();
}

//Printing the table
System.out.printf("STUDENT\t");
for(int subject = 0; subject < numberOfSubjects; subject++){
	System.out.printf("\tSUB" + (subject + 1));
	}
System.out.print("\tTOTAL\tAVERAGE\n");

for(int studentScores = 0; studentScores < numberOfStudents; studentScores++) {
System.out.printf("Student %d\t", studentScores + 1);
	for(int subject =0; subject < numberOfSubjects; subject++) {
	System.out.printf("%d\t", scores[studentScores][subject]);
	}
System.out.printf("%d\t%.2f\n", studentsum[studentScores], studentaverage[studentScores]);
}








}
}