import java.util.Scanner;
public class Task5{
public static void main(String[] args){
  Scanner input = new Scanner(System.in);
    
    int sum = 0;
    int evenscorecount = 0;
    
	for(int count=1; count <= 10; count++){
	System.out.println("Enter scores: ");
	int scores = input.nextInt();
	
	if(scores % 2 == 0)
	sum = sum + scores;
  evenscorecount++;
	}
	System.out.println("the sum of the number is " + sum);
	
}
}
