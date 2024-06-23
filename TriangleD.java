import java.util.Scanner;
public class TriangleD
{
	public static void main(String[] args)
	{
	Scanner input = new Scanner(System.in);
	
	int row;

	for (row = 1; row <= 10; row++)
	{

	for (int triangle = 10; triangle > row; triangle--)
	System.out.print(" ");
	
	for (int counter = 1; counter <= row; counter++)
	System.out.print("*");
	
	System.out.println();}

	
	}
}
	