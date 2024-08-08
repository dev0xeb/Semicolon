import java.util.ArrayList;
import java.util.Scanner;

public class PhoneBook {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	ArrayList<String> names = new ArrayList<>();
	ArrayList<String> phonenumber = new ArrayList<>();
	for(int i = 0; i <3; i++){
	System.out.println("Enter name: ");
	String userName = input.next();
	System.out.println("Enter the number: ");
	String userNumber = input.next();
	phonenumber.add(userNumber);
	names.add(userName);
		}

	for(String name : names){
	System.out.println(name);}
	for(String number : phonenumber){
	System.out.println(number);}
	}
}