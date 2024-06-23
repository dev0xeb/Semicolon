import java.util.Scanner;
public class PatternA
{
	public static void main(String[] args)
	{
	Scanner input = new Scanner(System.in);

	for (int pattern = 1; pattern <=6; pattern++){
		for (int counter = 1; counter <= pattern; counter++){
		System.out.printf("%d ", counter);}
	System.out.println();}
	}
}