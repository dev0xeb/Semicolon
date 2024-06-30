import java.util.Scanner;
public class NokiaMenu
{
	public static void main(String[] args)
	{
	Scanner input = new Scanner(System.in);
	
	
	System.out.println(" 1.Phone book \n 2.Messages \n 3.Chat \n 4.Call Register \n 5.Tones \n 6.Settings \n 7.Call divert \n 8.Games \n 9.Calculator \n 10. Reminders \n 11.Clock \n 12. Profiles \n 13. SIM services");

	System.out.println("Press any number to start: ");
	int menu = input.nextInt();
		

	switch (menu) {
		case 1:
		System.out.println("Phone book");
		System.out.println(" 1.Search \n 2.Service Nos \n 3.Add name \n 4.Erase \n 5.Edit \n 6.Assign tone \n 7.Send b'card \n 8.Options \n 9.Speed dials \n 10. Voice tags");
			System.out.println("Press any number to select: ");
			int phoneBook = input.nextInt();

			switch(phoneBook) {
					case 1:
					System.out.println("Search");
					break;

					case 2:
					System.out.println("Service Nos");
					break;
		
					case 3:
					System.out.println("Add name");
					break;

					case 4:
					System.out.println("Erase");
					break;

					case 5:
					System.out.println("Edit");
					break;
			
					case 6:
					System.out.println("Assign tone");
					break;

					case 7:
					System.out.println("Send b'card");
					break;

					case 8:
					System.out.println("Options");
						System.out.println("\n 1.Type of view \n 2.Memory status");
							
						System.out.println("Press any number to select any option: ");
						int options = input.nextInt();
						
						switch (options){
							case 1:
							System.out.println("Type of view");
							break;

							case 2:
							System.out.println("Memory Status");

							default:
							System.out.print("invalid input");
							}
					
					break;

					case 9:
					System.out.println("Speed dials");
					break;

					case 10:
					System.out.println("Voice tags");
					break;

					default: 
					System.out.print("Invalid input");
					}

				
		break;


		case 2:
		System.out.print("Messages");
		System.out.println(" 1.	Write messages \n 2.Inbox \n 3.Outbox \n 4.Picture messages \n 5.Templates \n 6.Smileys \n 7.Messages settings \n 8.Info service \n 9.Voice mailbox number \n 10. Service command editor");
			System.out.println("Press any number to select option: ");
			int messages = input.nextInt();

			switch(messages) {
					case 1:
					System.out.println("write messages");
					break;

					case 2:
					System.out.println("Inbox");
					break;
		
					case 3:
					System.out.println("Outbox");
					break;

					case 4:
					System.out.println("Picture messages");
					break;

					case 5:
					System.out.println("Templates");
					break;

					case 6:
					System.out.println("Smileys");
					break;

					case 7:
					System.out.println("Message settings");

					System.out.println("\n 1.Set \n 2. Common");

					System.out.println("Press any number to select any option: ");
					int messageSettings = input.nextInt();

					switch (messageSettings){
						case 1:
						System.out.println("Set");
						System.out.println("\n 1.Message centre number \n 2. Messages sent as \n 3. Message validity");
						int set = input.nextInt();
							switch(set){
							case 1:
							System.out.println("Message centre number");
							break;
							
							case 2:
							System.out.println("Messages sent as");
							break;

							case 3:
							System.out.println("Message validity");
							break;

							default:
							System.out.print("Invalid input");
							}
						break;

						case 2:
						System.out.println("Common");
						System.out.println("\n 1.Delivery reports \n 2. Reply via same centre \n 3. Character support");
						int common = input.nextInt();
							switch(common){
							case 1:
							System.out.println("Delivery reports");
							break;
							
							case 2:
							System.out.println("Reply via same centre");
							break;

							case 3:
							System.out.println("Character support");
							break;

							default:
							System.out.print("Invalid input");
							}

						break;

						default:
						System.out.print("Invald input");
						
	}
					break;

					case 8:
					System.out.println("Info service");
					break;

					case 9:
					System.out.println("Voice mailbox number");
					break;
		
					case 10:
					System.out.println("Service command editor");
					break;

					default: 
					System.out.print("Invalid input");
					}


				break;
		
		case 3:
		System.out.print("Chat");
		break;

		case 4:
		System.out.print("Call Register");

		System.out.println(" 1.Missed calls \n 2.Received calls \n 3.Dialed numbers \n 4.Erase recent call lists \n 5. Show call duration \n 6.Show call costs \n 7.Call cost settings \n 8.Prepaid credit");
			System.out.println("Press any number to select option: ");
			int callRegister = input.nextInt();

				switch(callRegister) {
					case 1:
					System.out.println("Missed calls");
					break;

					case 2:
					System.out.println("Received calls");
					break;
		
					case 3:
					System.out.println("Dialed numbers");
					break;

					case 4:
					System.out.println("Erase recent call lists");
					break;

					case 5:
					System.out.println("Show call duration");
					System.out.println("\n 1.Last call duration \n 2. All calls duration \n 3. Received calls duration \n 4. Dialled calls duration \n 5. Clear timers");

					System.out.println("Press any number to select option: ");
					int callDuration = input.nextInt();

						switch(callDuration){
							case 1:
							System.out.println("Last call duration");
							break;

							case 2:
							System.out.println("All calls duration");
							break;
		
							case 3:
							System.out.println("Received calls duration");
							break;

							case 4:
							System.out.println("Dialled calls duration");
							break;

							case 5:
							System.out.println("Clear timers");
							break;

							default:
							System.out.print("Invalid input");
							}
					break;

					case 6:
					System.out.println("Show call costs");
					System.out.println("\n 1.Last call cost \n 2. All calls cost \n 3.Clear counters");

					System.out.println("Press any number to select option: ");
					int callCost = input.nextInt();

						switch(callCost){
							case 1:
							System.out.println("Last call cost");
							break;

							case 2:
							System.out.println("All calls cost");
							break;
		
							case 3:
							System.out.println("Clear counters");
							break;

							default:
							System.out.print("Invalid input");
							}

					break;
			
					case 7:
					System.out.println("Call cost settings");
					System.out.println("\n 1. Call cost limit \n 2. Show costs in");

					System.out.println("Press any number to select option: ");
					int callCost2 = input.nextInt();

						switch(callCost2){
							case 1:
							System.out.println("Call cost limit");
							break;

							case 2:
							System.out.println("Show costs in");
							break;
		
							default:
							System.out.print("Invalid input");
							}


					break;

					case 8:
					System.out.println("Prepaid credit");
					break;

					default:
					System.out.print("Invalid input");
					}


		break;

		case 5:
		System.out.print("Tones");
		break;

		case 6:
		System.out.print("Settings");
		System.out.println("\n 1. Call settings \n 2.Phone settings \n 3.Security settings \n 4. Restore Factory");
		
		System.out.println("Press any number to select option: ");
		int settings = input.nextInt();
			switch (settings){
					case 1:
					System.out.println("Call settings");
					System.out.println("\n 1.Automatic redial \n 2.Speed dialing \n 3.Call waiting options \n 4.Own number sending \n 5. Phone line in use \n 6. Automatic answer");
					System.out.println("Press any number to select option: ");
					int callSettings = input.nextInt();
						switch (callSettings){
							case 1:
							System.out.println("Automatic redial");
							break;
		
							case 2:
							System.out.println("Speed dialling");
							break;
		
							case 3:
							System.out.println("Call waiting options");
							break;

							case 4:
							System.out.println("Own number sending");
							break;

							case 5:
							System.out.println("Phone line in use");
							break;

							case 6:
							System.out.println("Automatic answer");
							break;

							default:
							System.out.print("invalid input");

							}

					break;

					case 2:
					System.out.println("Phone settings");
					System.out.println("\n 1.Language \n 2.Cell info display \n 3.Welcome note \n 4.Network selection \n 5.lights \n 6. Confirm SIM service actions");
					System.out.println("Press any number to select option: ");
					int phoneSettings = input.nextInt();
						switch (phoneSettings){
							case 1:
							System.out.println("Language");
							break;
		
							case 2:
							System.out.println("Cell info display");
							break;
		
							case 3:
							System.out.println("welcome note");
							break;

							case 4:
							System.out.println("Network selection");
							break;

							case 5:
							System.out.println("lights");
							break;

							case 6:
							System.out.println("Confirm SIM service actions");
							break;

							default:
							System.out.print("invalid input");

							}


					break;
		
					case 3:
					System.out.println("Security settings");
					System.out.println("\n 1.PIN code request \n 2.Call barring service \n 3.Fixed dialling \n 4.Closed user group \n 5.Phone security \n 6. Change access codes");
					System.out.println("Press any number to select option: ");
					int securitySettings = input.nextInt();
						switch (securitySettings){
							case 1:
							System.out.println("PIN code request");
							break;
		
							case 2:
							System.out.println("Call barring service");
							break;
		
							case 3:
							System.out.println("Fixed dialling");
							break;

							case 4:
							System.out.println("Closed user group");
							break;

							case 5:
							System.out.println("Phone security");
							break;

							case 6:
							System.out.println("Change access codes");
							break;

							default:
							System.out.print("invalid input");

							}

					break;

					case 4:
					System.out.println("Restore factory settings");
					break;

					default:
					System.out.print("Invalid input");
				}


		break;
	
		case 7:
		System.out.print("Call divert");
		break;

		case 8:
		System.out.print("Games");
		break;

		case 9:
		System.out.print("Calculator");
		break;

		case 10:
		System.out.print("Reminders");
		break;

		case 11:
		System.out.print("Clock");
		System.out.println("\n 1.Alarm clock \n 2.Clock settings \n 3.Date setting \n 4.Stopwatch \n 5.Countdown timer \n 6.Auto update of date and time");
		System.out.println("Press any number to select option: ");
		int phoneSettings = input.nextInt();
			switch (phoneSettings){
				case 1:
				System.out.println("Alarm clock");
				break;
		
				case 2:
				System.out.println("Clock settings");
				break;
		
				case 3:
				System.out.println("Date setting");
				break;

				case 4:
				System.out.println("Stopwatch");
				break;

				case 5:
				System.out.println("Countdown timer");
				break;

				case 6:
				System.out.println("Auto update of date and time");
				break;

				default:
				System.out.print("invalid input");

							}

		break;

		case 12:
		System.out.print("Profiles");
		break;

		case 13:
		System.out.print("SIM services");
		break;


		default: 
		System.out.print("Invalid input");

		}

	}
}

	