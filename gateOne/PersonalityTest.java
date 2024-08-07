import java.util.Arrays;
import java.util.Scanner;

public class PersonalityTest {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.println("Kindly enter your name to take the MBTI Personality Test: ");
	String userName = input.nextLine();

	System.out.println("Welcome " + userName + ", You can now take the test");

	System.out.println();
	String[] personalityQuestions = { "Introvert/Extrovert.\n Do you prefer to focus on the outer world, Enter A for Yes or B for No.",
					"Do you gain energy from being around people, Enter A  /for Yes or B for No.",
					"I prefer to work on projects myself. Enter A for Yes or B for No.",
					"I find it easy to start conversations with strangers. Enter A for Yes or B for No.",
					"I enjoy being the center of attention. Enter A for Yes or B for No.",
					"Sensing/Intuition.\nI prefer pratical and realistic information over abstract ideas. Enter A for Yes or B for No.",
					"I focus on future possibilities rather than past experiences. Enter A for Yes or B for No.",
					"I trust my hunches and gut feelings. Enter A for Yes or B for No.",
					"I am detail oriented and focus on the specifics. Enter A for Yes or B for No.",
					"I enjoy brainstorming and thinking about the big picture. Enter A for Yes or B for No.",
					"Thinking/Feeling.\n I make decisions based on logic and objective criteria. Enter A for Yes or B for No.",
					"I consider the impact of my decisions on others feelings. Enter A for Yes or B for No.",
					"I value fairness and justice over personal considerations. Enter A for Yes or B for No.",
					"I prioritize harmony over conflict. Enter A for Yes or B for No.",
					"I am more concerned with being tactful than being truthful. Enter A for Yes or B for No.",
					"Judging/Perceiving.\n i like to have a plan and stick to it. Enter A for Yes or B for No.",
					"i prefer to keep my options open and be spontaneous. Enter A for Yes or B for No.",
					"i feel stressed when things are unplanned or last minute. Enter A for Yes or B for No.",
					"i am comfortable with changing plans if needed. Enter A for Yes or B for No.",
					"i prefer to make decisions early rather than waiting until the last minute. Enter A for Yes or B for No."
					};
	int Introvert = 0;
	int Extrovert = 0;
	int Sensing = 0;
	int Intuition = 0;
	int Thinking = 0;
	int Feeling = 0;
	int Judging = 0;
	int Perceiving = 0;

	for(int displayQuestions = 0; displayQuestions < personalityQuestions.length; displayQuestions++) {
	System.out.print(personalityQuestions[displayQuestions]);
	System.out.println("Enter A/B");
	String userInput = input.nextLine();
	String newUserInput = userInput.toUpperCase();
	
		if (newUserInput == "A" || newUserInput == "B"){
		break;
			}

	switch(displayQuestions) {
		case 0:
			if (userInput == "A")
				Extrovert++;
			else if (userInput == "B")
				Introvert++;
			break;
		case 1:
			if (userInput == "A")
				Extrovert++;
			else if (userInput == "B")
				Introvert++;
			break;
		case 2:
			if (userInput == "A")
				Extrovert++;
			else if (userInput == "B")
				Introvert++;
			break;
		case 3:
			if (userInput == "A")
				Extrovert++;
			else if (userInput == "B")
				Introvert++;
			break;
		case 4:
			if (userInput == "A")
				Extrovert++;
			else if (userInput == "B")
				Introvert++;
			break;
		case 5:
			if (userInput == "A")
				Sensing++;
			else if (userInput == "B")
				Intuition++;
			break;
		case 6:
			if (userInput == "A")
				Sensing++;
			else if (userInput == "B")
				Intuition++;
			break;
		case 7:
			if (userInput == "A")
				Sensing++;
			else if (userInput == "B")
				Intuition++;
			break;
		case 8:
			if (userInput == "A")
				Sensing++;
			else if (userInput == "B")
				Intuition++;
			break;
		case 9:
			if (userInput == "A")
				Sensing++;
			else if (userInput == "B")
				Intuition++;
			break;
		case 10:
			if (userInput == "A")
				Thinking++;
			else if(userInput == "B")
				Feeling++;
			break;
		case 11:
			if (userInput == "A")
				Thinking++;
			else if(userInput == "B")
				Feeling++;
			break;
		case 12:
			if (userInput == "A")
				Thinking++;
			else if(userInput == "B")
				Feeling++;
			break;
		case 13:if (userInput == "A")
				Thinking++;
			else if(userInput == "B")
				Feeling++;
			break;
		case 14:
			if (userInput == "A")
				Thinking++;
			else if(userInput == "B")
				Feeling++;
			break;
		case 15:
			if (userInput == "A")
				Judging++;
			else if (userInput == "B")
				Perceiving++;
			break;
		case 16:
			if (userInput == "A")
				Judging++;
			else if (userInput == "B")
				Perceiving++;
			break;
		case 17:
			if (userInput == "A")
				Judging++;
			else if (userInput == "B")
				Perceiving++;
			break;
		case 18:
			if (userInput == "A")
				Judging++;
			else if (userInput == "B")
				Perceiving++;
			break;
		case 19:
			if (userInput == "A")
				Judging++;
			else if (userInput == "B")
				Perceiving++;
			break;
		default:
			System.out.println("Input mismatch");

			}
		}

		/*System.out.println("Your MBTI personality Test result is: ");
		if (Extrovert > Introvert){
		System.out.print("E");
		}else{
		System.out.print("I");}

		if (Sensing > Intuition){
		System.out.print("S");
		}else{
		System.out.print("I");}

		if (Thinking > Feeling){
		System.out.print("T");
		}else{
		System.out.print("F");}  

		if (Judging > Perceiving){
		System.out.print("J");
		}else{
		System.out.print("P");}*/

		System.out.println("Your MBTI personality Test result is: ");
        	System.out.print((Extrovert > Introvert ? "E" : "I"));
       		System.out.print((Sensing > Intuition ? "S" : "N"));
        	System.out.print((Thinking > Feeling ? "T" : "F"));
        	System.out.print((Judging > Perceiving ? "J" : "P"));
	}
}
		