import java.util.Scanner;
public class TriangleC
{
	public static void main(String[] args)
	{
	Scanner input = new Scanner(System.in);
	
	int row;

	for (row = 1; row <= 10; row++)
	{

	for (int triangle = 1; triangle < row; triangle++)
	System.out.print(" ");
	
	for (int counter = 10; counter >= row; counter--)
	System.out.print("*");
	
	System.out.println();}

	
	}
}
	