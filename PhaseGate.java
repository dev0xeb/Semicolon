import java.util.Scanner;
public class PhaseGate {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);


for(int number =1; number <= 10; number++){
System.out.println(number);
}

//2
System.out.println(" ");
for(int even = 2; even <= 10; even+=2){
System.out.println(even);
}

//3
System.out.println(" ");
for(int odd = 1; odd <= 10; odd+=2){
System.out.println(odd);
}

//4
System.out.println(" ");
for(int num = 1; num <= 10; num++){
if (num % 4 == 0)
System.out.println(num);
}


//4
System.out.println(" ");

for(int count = 1; count <= 10; count++){
for (int divisibleby4= 1; divisibleby4 <= 5; divisibleby4++)
if (count % 4 == 0)
System.out.println(count);
}



}

}