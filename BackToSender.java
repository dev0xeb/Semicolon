import java.util.Scanner;
public class BackToSender {
	
	public static int multiply(int successfulDelivery){
	int wage;

	if (successfulDelivery < 50){
		wage = (successfulDelivery * 160) + 5000;
		}
	else if (successfulDelivery >= 50 && successfulDelivery <= 59){
		wage = (successfulDelivery * 200) + 5000;
		}
	else if (successfulDelivery >= 60 && successfulDelivery <= 69){
		wage = (successfulDelivery * 250) + 5000;
		}
	else {
		wage = (successfulDelivery * 500) + 5000;
		}
	return wage;
}
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.println("Enter the number of successful deliveries made by the rider: ");
	int successfulDelivery = input.nextInt();

	int result = multiply(successfulDelivery);
	System.out.println(result);
	}
}
		