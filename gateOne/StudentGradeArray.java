import java.util.Arrays;
import java.util.Scanner;
public class StudentGradeArray {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

System.out.println("Welcome to Lagbaja Schools");

System.out.println("Enter the number of students: ");
int numberOfStudents = input.nextInt();

System.out.println("Enter thr number of Subjects: ");
int numberOfSubjects = input.nextInt();

int[][] scores = new int[numberOfStudents][numberOfSubjects];
int[] studentsum = new int[numberOfStudents];
double[] studentaverage = new double[numberOfStudents];
int sum = 0;

for (int student = 0; student < numberOfStudents; student++) {
	System.out.println("Enter scores for Student " + (student + 1));
	for(int studentScores = 0; studentScores < numberOfSubjects; studentScores++) {
	System.out.println("Enter the student score in subject " +(studentScores + 1));
	int score = input.nextInt();
		if(score > 100 || score < 0){
		System.out.println("Invalid score, Enter the student score in subject " +(studentScores + 1));
		score= input.nextInt();
	
		}
	   
		scores[student][studentScores] = score;
		sum += score;
		break;
	}

	double average = (double) sum / numberOfSubjects;
	studentsum[student] = sum;
	studentaverage[student] = average;
}

for (int student = 0; student < numberOfStudents; student++) {
System.out.println("Enter scores for Student " + (student + 1));
for(int studentScores = 0; studentScores < numberOfSubjects; studentScores++) {
System.out.print(scores[student][studentScores] + " ");
}
System.out.println();
System.out.println("The total score for student " + (student + 1) + " is "+ studentsum[student]);
System.out.printf("the average Score for Student %d is %.2f\n", (student + 1), studentaverage[student]);
System.out.println();
}









}
}