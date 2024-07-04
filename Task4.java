import java.util.Scanner;
public class Task4{
public static void main(String[] args){
  Scanner input = new Scanner(System.in);
    
   
    int sum = 0;
    
	for(int index=1; index <= 10; index++){
	System.out.println("Enter scores: ");
	int scores = input.nextInt();
	
	if(index % 2 == 0)
	sum = sum + index;}
	System.out.println("the sum of the number is " + sum);
	
	double average = sum / 10;
	System.out.printf("the average of the number is %.2f", average);
	}
}
