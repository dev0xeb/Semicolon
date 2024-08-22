import java.util.Scanner;
public class StudentGrademain 
{
	public static void main(String[] args)
	{
	Scanner input = new Scanner(System.in);

	System.out.println("Welcome to Labaja Schools");

	System.out.println("Enter first subjects");
	String firstSubject = input.nextLine(); 

	System.out.println("Enter second subjects");
	String secondSubject = input.nextLine();

	System.out.println("Enter third subjects");
	String thirdSubject = input.nextLine();



	//first student

	System.out.println("Enter student 1 in " + firstSubject);
	int student1ScorefirstSubject = input.nextInt(); 

	if (student1ScorefirstSubject > 100){
		System.out.println("invalid input, enter correct score: ");
		int score1 = input.nextInt();}	

	System.out.println("Enter student 1 in " + secondSubject);
	int student1ScoresecondSubject = input.nextInt(); 

	if (student1ScoresecondSubject > 100){
		System.out.println("invalid input, enter correct score: ");
		int score2 = input.nextInt();}	

	System.out.println("Enter student 1 in " + thirdSubject);
	int student1ScorethirdSubject = input.nextInt(); 

	if (student1ScorethirdSubject > 100){
		System.out.println("invalid input, enter correct score: ");
		int score3 = input.nextInt();	}

	



	//second student
	System.out.println("Enter student 2 in " + firstSubject);
	int student2ScorefirstSubject = input.nextInt(); 

	if (student2ScorefirstSubject > 100){
		System.out.println("invalid input, enter correct score: ");
		int score5 = input.nextInt();}	


	System.out.println("Enter student 2 in " + secondSubject);
	int student2ScoresecondSubject = input.nextInt();
 
	if (student2ScoresecondSubject > 100){
		System.out.println("invalid input, enter correct score: ");
		int score6 = input.nextInt();}

	System.out.println("Enter student 2 in " + thirdSubject);
	int student2ScorethirdSubject = input.nextInt();

	if (student2ScorethirdSubject > 100){
		System.out.println("invalid input, enter correct score: "); 
		int score7 = input.nextInt();}

	


	//Third Student
	System.out.println("Enter student 3 in " + firstSubject);
	int student3ScorefirstSubject = input.nextInt(); 

	if (student3ScorefirstSubject > 100){
		System.out.println("invalid input, enter correct score: ");
		int score9 = input.nextInt();}


	System.out.println("Enter student 3 in " + secondSubject);
	int student3ScoresecondSubject = input.nextInt(); 

	if (student3ScoresecondSubject > 100){
		System.out.println("invalid input, enter correct score: ");
		int score0 = input.nextInt();}

	System.out.println("Enter student 3 in " + thirdSubject);
	int student3ScorethirdSubject = input.nextInt(); 

	if (student3ScorethirdSubject > 100){
		System.out.println("invalid input, enter correct score: ");
		int score11 = input.nextInt();}



	//Fourth Student
	System.out.println("Enter student 4 in " + firstSubject);
	int student4ScorefirstSubject = input.nextInt(); 

	if (student4ScorefirstSubject > 100){
		System.out.println("invalid input, enter correct score: ");
		int score12 = input.nextInt();}


	System.out.println("Enter student 4 in " + secondSubject);
	int student4ScoresecondSubject = input.nextInt(); 

	if (student4ScoresecondSubject > 100){
		System.out.println("invalid input, enter correct score: ");
		int score13 = input.nextInt();}

	System.out.println("Enter student 4 in " + thirdSubject);
	int student4ScorethirdSubject = input.nextInt(); 

	if (student4ScorethirdSubject > 100){
		System.out.println("invalid input, enter correct score: ");
		int score14 = input.nextInt();}

	
	//Student 1
	System.out.println("Student 1 " + firstSubject + student1ScorefirstSubject);
	
	System.out.println("Student 1 " + secondSubject + student1ScoresecondSubject);
	
	System.out.println("Student 1 " + thirdSubject + student1ScorethirdSubject);

	int sumStudent1 = student1ScorefirstSubject + student1ScoresecondSubject + student1ScorethirdSubject;
	float averageStudent1 = sumStudent1 / 3;


	//student 2	
	System.out.println("Student 2 " + firstSubject + student2ScorefirstSubject);
	
	System.out.println("Student 2 " + secondSubject + student2ScoresecondSubject);

	System.out.println("Student 2 " + thirdSubject + student2ScorethirdSubject);

	int sumStudent2 = student2ScorefirstSubject + student2ScoresecondSubject + student2ScorethirdSubject;
	float averageStudent2 = sumStudent2 / 3;


	//student 3
	System.out.println("Student 3 " + firstSubject + student3ScorefirstSubject);
	
	System.out.println("Student 3 " + secondSubject + student3ScoresecondSubject);

	System.out.println("Student 3 " + thirdSubject + student3ScorethirdSubject);

	int sumStudent3 = student3ScorefirstSubject + student3ScoresecondSubject + student3ScorethirdSubject;
	float averageStudent3 = sumStudent3 / 3;


	//student 4
	System.out.println("Student 4 " + firstSubject + student4ScorefirstSubject);
	
	System.out.println("Student 4 " + secondSubject + student4ScoresecondSubject);

	System.out.println("Student 4 " + thirdSubject + student4ScorethirdSubject);

	int sumStudent4 = student4ScorefirstSubject + student4ScoresecondSubject + student4ScorethirdSubject;
	float averageStudent4 = sumStudent3 / 3;




	System.out.println("STUDENT  		firstSubject 		secondSubject 		thirdSubject 		 Total		 Average");
	System.out.printf("Student 1 		%d			%d			%d			%d		%.1f%n", 	student1ScorefirstSubject, student1ScoresecondSubject, student1ScorethirdSubject, sumStudent1, averageStudent1);
	System.out.printf("Student 2		%d			%d			%d			%d		%.1f%n", 	student2ScorefirstSubject, student2ScoresecondSubject, student2ScorethirdSubject, sumStudent2, averageStudent2);
	System.out.printf("Student 3 		%d			%d			%d			%d		%.1f%n", 	student3ScorefirstSubject, student3ScoresecondSubject, student3ScorethirdSubject, sumStudent3, averageStudent3);
	System.out.printf("Student 4 		%d			%d			%d			%d		%.1f%n", 	student4ScorefirstSubject, student4ScoresecondSubject, student4ScorethirdSubject, sumStudent4, averageStudent4);



	System.out.println("Class Summary");

	if (sumStudent1 > sumStudent2 && sumStudent1 > sumStudent3 && sumStudent1 > sumStudent4)
		System.out.println("The best graduating student is Student 1 scoring " + sumStudent1);

	else if (sumStudent2 > sumStudent1 && sumStudent2 > sumStudent3 && sumStudent2 > sumStudent4)
		System.out.println("The best graduating student is Student 2 scoring " + sumStudent2);
	
	else if (sumStudent3 > sumStudent1 && sumStudent3 > sumStudent2 && sumStudent3 > sumStudent4)
		System.out.println("The best graduating student is Student 3 scoring " + sumStudent3);

	else  
		System.out.println("The best graduating student is Student 4 scoring " + sumStudent4);



	if (sumStudent1 < sumStudent2 && sumStudent1 < sumStudent3 && sumStudent1 < sumStudent4)
		System.out.println("The worst graduating student is Student 1 scoring " + sumStudent1);

	else if (sumStudent2 < sumStudent1 && sumStudent2 < sumStudent3 && sumStudent2 < sumStudent4)
		System.out.println("The worst graduating student is Student 2 scoring " + sumStudent2);
	
	else if (sumStudent3 < sumStudent1 && sumStudent3 < sumStudent2 && sumStudent3 < sumStudent4)
		System.out.println("The worst graduating student is Student 3 scoring " + sumStudent3);

	else if (sumStudent4 < sumStudent1 && sumStudent4 < sumStudent2 && sumStudent4 < sumStudent3)
		System.out.println("The worst graduating student is Student 1 scoring " + sumStudent1);



	int classTotal = sumStudent1 + sumStudent2 + sumStudent3 + sumStudent4;
	System.out.println("the class total is " + classTotal);


	float classAverage = classTotal / 4;
	System.out.printf("the class average is %.1f ",  classAverage);
	}
}


	
 
 

	