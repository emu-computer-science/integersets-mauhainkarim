import java.util.*;

public class RunIntegerSets {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		CollectionSetOfIntegers collect = new CollectionSetOfIntegers();
		int s = 0;
		char selection = 0;
		
		System.out.println("Integer Sets by Mauhainkarim");
		System.out.println("Made by Albara Abdulkarim, Colin Maurier, and Garrett Haines\n");

		do {
			// Print menu and get command
			System.out.println("List of Commands: ");
			System.out.println(" - show\n - new\n - select\n - delete\n - sort\n - reverse\n - randomize\n - save\n - restore\n - quit\n");
			System.out.println("Please enter a command by name: (ex. add)");
			String userInput = input.nextLine();

			// Switch statement from user input
			switch (userInput.toLowerCase()) {
			case "show":
				if (collect.getSize() == 0)
					System.out.println("There are no sets.");
				else {
					for (int i = 0; i < collect.getSize(); i++) {
						collect.collection.get(i).printSet();
					}
				}
				cont();
				break;

			case "new":
				collect.add();
				cont();
				break;

			case "select":
				// If collection is empty
				if (collect.getSize() == 0)
					System.out.println("There are no sets to select.");

				// If collection is not empty
				else {
					System.out.print("Please select a set (A - " + collect.alphabet[collect.getSize()] + "): ");
					char choice = Character.toUpperCase(input.next().charAt(0));
					input.nextLine();

					// If choice is empty but selection is valid value and in bounds
					if ((choice == ' ' || choice == 0) && selection >= 65 && selection - 64 <= collect.getSize()) {
						System.out.print("Set " + choice + " is now the current set: ["
								+ collect.collection.get(selection - 65).getState() + "] {");
						for (int i = 0; i < collect.collection.get(selection - 65).getSize(); i++) {
							if (i == 0)
								System.out.print(collect.collection.get(selection - 65).set.get(i));
							else
								System.out.print(", " + collect.collection.get(selection - 65).set.get(i));
						}
						System.out.println("}");
					}

					// If choice is valid value and in bounds
					else if (choice > 64 && choice - 64 <= collect.getSize()) {
						System.out.print("Set " + choice + " is now the current set: ["
								+ collect.collection.get(choice - 65).getState() + "] {");
						for (int i = 0; i < collect.collection.get(choice - 65).getSize(); i++) {
							if (i == 0)
								System.out.print(collect.collection.get(choice - 65).set.get(i));
							else
								System.out.print(", " + collect.collection.get(choice - 65).set.get(i));
						}
						System.out.println("}");
					}

					// If choice is valid but out of bounds
					else if (choice > 64 && choice < 91)
						System.out.println("You input " + choice + ", but there is no Set " + choice + ".");

					// If input is invalid
					else
						System.out.println("Input is invalid type.");

					selection = choice;
				}
				cont();
				break;

			case "delete":
				System.out.println("Not yet implemented");
				break;

			case "sort":
				cont();
				break;

			case "reverse":
				System.out.println("Not yet implemented");
				cont();
				break;

			case "randomize":
				//
				break;

			case "save":
				System.out.println("Not yet implemented");
				cont();
				break;

			case "restore":
				System.out.println("Not yet implemented");
				cont();
				break;

			case "quit":
				System.exit(0);
				break;

			default:
				System.out.println("Unrecognized input!\n");
				cont();
				break;
			}

		} while (true);

	}
	
	public static void cont() {
		Scanner input = new Scanner(System.in);
		System.out.println("Press enter to continue...");
		input.nextLine();
		System.out.println("\n\n\n\n");
	}

}