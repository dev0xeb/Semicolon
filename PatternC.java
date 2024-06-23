import java.util.Scanner;
public class PatternC
{
	public static void main(String[] args)
	{
	Scanner input = new Scanner(System.in);
	int form =1;
	
	for (int pattern = 6; pattern > form; pattern--){
	System.out.printf(" ");}
		
		for(int counter = 1; counter <= form; counter++){
		System.out.printf("%d ", counter);}

	System.out.println();
	}
}