import java.util.Scanner;
public class Task3{
public static void main(String[] args){
  Scanner input = new Scanner(System.in);
    
   
    int sum = 0;
    
	for(int count=1; count <= 10; count++){
	System.out.println("Enter scores: ");
	int scores = input.nextInt();
	
	sum = sum + scores;}
	System.out.println("the sum of the number is " + sum);
	
	double average = sum / 10;
	System.out.printf("the average of the number is %.2f", average);
	}
	
	}
