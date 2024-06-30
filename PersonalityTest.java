import java.util.Scanner;
public class PersonalityTest
{
	public static void main(String[] args)
	{
	Scanner input = new Scanner(System.in);

	System.out.println("kindly enter your name: ");
	String name = input.nextLine();

	System.out.println("Welcome " + name);

	System.out.println("to take MBTI test press any number");
	int takeTest = input.nextInt();




  	int Extrovert =0; 
	int Introvert= 0;

	System.out.println("Do you prefer to focus on the outer world");
	System.out.println("Enter 1 for yes or 0 for no");
	int result = input.nextInt();

	if (result == 1){
	Extrovert++;
	}else {
	Introvert++;}
	
	System.out.println("Do you gain energy from being around people");
	System.out.println("Enter 1 for yes or 0 for no");
	result = input.nextInt();

	if (result == 1){
	Extrovert++;
	}else {
	Introvert++;}

	System.out.println("I prefer to work on projects myself");
	System.out.println("Enter 1 for yes or 0 for no");
	result = input.nextInt();

	if (result == 1){
	Extrovert++;
	}else {
	Introvert++;}

	System.out.println("I find it easy to start conversations with strangers");
	System.out.println("Enter 1 for yes or 0 for no");
	result = input.nextInt();

	if (result == 1){
	Extrovert++;
	}else {
	Introvert++;}

	System.out.println("I enjoy being the center of attention");
	System.out.println("Enter 1 for yes or 0 for no");
	result = input.nextInt();

	if (result == 1){
	Extrovert++;
	}else {
	Introvert++;}





	int Sensing = 0;
	int Intuition = 0;

	System.out.println("I prefer pratical and realistic information over abstract ideas");
	System.out.println("Enter 1 for yes or 0 for no");
	result = input.nextInt();

	if (result == 1){
	Sensing++;
	}else {
	Intuition++;}

	System.out.println("I focus on future possibilities rather than past experiences");
	System.out.println("Enter 1 for yes or 0 for no");
	result = input.nextInt();

	if (result == 1){
	Sensing++;
	}else {
	Intuition++;}

	System.out.println("I trust my hunches and gut feelings");
	System.out.println("Enter 1 for yes or 0 for no");
	result = input.nextInt();

	if (result == 1){
	Sensing++;
	}else {
	Intuition++;}

	System.out.println("I am detail oriented and focus on the specifics");
	System.out.println("Enter 1 for yes or 0 for no");
	result = input.nextInt();

	if (result == 1){
	Sensing++;
	}else {
	Intuition++;}

	System.out.println("I enjoy brainstorming and thinking about the big picture");
	System.out.println("Enter 1 for yes or 0 for no");
	result = input.nextInt();

	if (result == 1){
	Sensing++;
	}else {
	Intuition++;}




	int Thinking =0;
	int Feeling = 0;

	System.out.println("i make decisions based on logic and objective criteria");
	System.out.println("Enter 1 for yes or 0 for no");
	result = input.nextInt();

	if (result == 1){
	Thinking++;
	}else {
	Feeling++;}

	System.out.println("I consider the impact of my decisions on others feelings");
	System.out.println("Enter 1 for yes or 0 for no");
	result = input.nextInt();

	if (result == 1){
	Thinking++;
	}else {
	Feeling++;}

	System.out.println("I value fairness and justice over personal considerations");
	System.out.println("Enter 1 for yes or 0 for no");
	result = input.nextInt();

	if (result == 1){
	Thinking++;
	}else {
	Feeling++;}

	System.out.println("I prioritize harmony over conflict");
	System.out.println("Enter 1 for yes or 0 for no");
	result = input.nextInt();

	if (result == 1){
	Thinking++;
	}else {
	Feeling++;}

	System.out.println("I am more concerned with being tactful than being truthful");
	System.out.println("Enter 1 for yes or 0 for no");
	result = input.nextInt();

	if (result == 1){
	Thinking++;
	}else {
	Feeling++;}

	


	
	int Judging =0;
	int Perceiving = 0;

	System.out.println("i like to have a plan and stick to it");
	System.out.println("Enter 1 for yes or 0 for no");
	result = input.nextInt();

	if (result == 1){
	Judging++;
	}else {
	Perceiving++;}

	System.out.println("i prefer to keep my options open and be spontaneous");
	System.out.println("Enter 1 for yes or 0 for no");
	result = input.nextInt();

	if (result == 1){
	Judging++;
	}else {
	Perceiving++;}

	System.out.println("i feel stressed when things are unplanned or last minute");
	System.out.println("Enter 1 for yes or 0 for no");
	result = input.nextInt();

	if (result == 1){
	Judging++;
	}else {
	Perceiving++;}

	System.out.println("i am comfortable with changing plans if needed");
	System.out.println("Enter 1 for yes or 0 for no");
	result = input.nextInt();

	if (result == 1){
	Judging++;
	}else {
	Perceiving++;}

	System.out.println("i prefer to make decisions early rather than waiting until the last minute");
	System.out.println("Enter 1 for yes or 0 for no");
	result = input.nextInt();

	if (result == 1){
	Judging++;
	}else {
	Perceiving++;}


	System.out.println("Extrovert: " + Extrovert);
	System.out.println("Introvert: " + Introvert);
	
	System.out.println("Sensing: " + Sensing);
	System.out.println("Intuition: " + Intuition);
	

	System.out.println("Thinking: " + Thinking);
	System.out.println("Feeling: " + Feeling);
	
	System.out.println("Judging: " + Judging);
	System.out.println("Perceiving: " + Perceiving);
	
	System.out.print(name + ", you MBTI test result is ");
	if (Extrovert > Introvert){
	System.out.print("E");
	}else{
	System.out.print("I");}

	if (Sensing > Intuition){
	System.out.print("S");
	}else{
	System.out.print("I");}

	if (Thinking > Feeling){
	System.out.print("T");
	}else{
	System.out.print("F");}

	if (Judging > Perceiving){
	System.out.print("J");
	}else{
	System.out.print("P");}


	




	}
}