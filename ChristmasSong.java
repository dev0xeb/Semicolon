import java.util.Scanner;
public class ChristmasSong
{
	public static void main (String[] args)
	{
	Scanner input = new Scanner(System.in);
	
	for (int day=1; day <= 12; day++)
	{
		System.out.print("on the ");

		switch (day)
		{
			case 1:
			System.out.print("first ");
			break;
		
			case 2:
			System.out.print("second ");
			break;

			case 3:
			System.out.print("third ");
			break;

			case 4:
			System.out.print("fourth ");
			break;
	
			case 5:
			System.out.print("fifth ");
			break;

			case 6:
			System.out.print("sixth ");
			break;

			case 7:
			System.out.print("seventh ");
			break;

			case 8:
			System.out.print("eighth ");
			break;

			case 9:
			System.out.print("nineth ");
			break;

			case 10:
			System.out.print("tenth ");
			break;

			case 11:
			System.out.print("eleventh ");
			break;

			case 12:
			System.out.print("tweifth ");
			break;
		}
		
		System.out.print("day of christmas, my true love gave to me: ");
		switch (day)
		{
			
			case 1:
			System.out.print("a patridge in a pear tree.");
			break;

			case 2:
			System.out.print("two turtle doves, and ");
			break;

			case 3:
			System.out.print("three french hens");
			break;

			case 4:
			System.out.print("four calling birds");
			break;

			case 5:
			System.out.print("five golden rings");
			break;

			case 6:
			System.out.print("six gesse-a-laying");
			break;

			case 7:
			System.out.print(" seven swams-a-swimming");
			break;

			case 8:
			System.out.print("eight maid-a-milking");
			break;

			case 9:
			System.out.print("nine ladies dancing");
			break;

			case 10:
			System.out.print("ten drummers drumming");
			break;

			case 11:
			System.out.print("eleven pipers piping");
			break;

			case 12:
			System.out.print("twelve lords-a-leaping");
		}
		System.out.println();}
	}
}	
