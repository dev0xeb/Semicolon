import java.util.Scanner;
public class PatternB
{
	public static void main(String[] args)
	{
	Scanner input = new Scanner(System.in);
	
	for (int pattern = 6; pattern >=1; pattern--){
		for(int counter = 6; counter >= pattern; counter--){
		System.out.printf("%d ", counter);}
	System.out.println();}
	}
}