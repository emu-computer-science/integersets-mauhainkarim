import java.util.*;

public class RunIntegerSets {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		CollectionSetOfIntegers collect = new CollectionSetOfIntegers();
		int s = 0;
		char selection;

		do {
			System.out.println("List of Commands : ");
			System.out.println(" show\n add\n select\n delete\n sort\n reverse\n randomize\n save\n restore\n quit");
			System.out.println("Please enter a command by name: (ex. add) ");
			String userInput = input.nextLine();

			switch (userInput.toLowerCase()) {
			case "show":
<<<<<<< HEAD
				if (collect.getSize() == 0)
					System.out.println("\nThere are no sets.");
				else {
					for (int i = 0; i < collect.getSize(); i++) {
						collect.collection.get(i).printSet();
					}
				}
				System.out.println();
				cont();
=======
				for (int i = 0; i < collect.getSize(); i++) {
					collect.collection.get(i).printSet();
				}
>>>>>>> refs/remotes/origin/master
				break;

			case "add":
				collect.add();
				break;

			case "select":
<<<<<<< HEAD
				// If collection is empty
				if (collect.getSize() == 0)
					System.out.println("\nThere are no sets to select.");

				// If collection is not empty
				else {
					System.out.print("\nPlease select a set (A - " + collect.alphabet[collect.getSize()] + "): ");
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
						System.out.print("\nSet " + choice + " is now the current set: ["
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
						System.out.println("\nYou input " + choice + ", but there is no Set " + choice + ".");

					// If input is invalid
					else
						System.out.println("\nInput is invalid type.");

					selection = choice;
=======
				System.out.print("Please select a set (A - " + collect.alphabet[collect.getSize()] + ": ");
				selection = Character.toUpperCase(input.next().charAt(0));
				if(selection - 65 > 0 && selection - 65 <= collect.getSize()) {
					// Input valid
>>>>>>> refs/remotes/origin/master
				}
				break;

			case "delete":
				collect.delete(selection);
				if(selection - 65 > collect.getSize())
					selection = 0;
				cont();
				break;

			case "sort":
<<<<<<< HEAD
				if(selection <= 65 && selection >= collect.getSize())
					collect.collection.get(selection - 65).sort();
				else
					System.out.println("\nPlease select a valid set.");
				cont();
				break;

			case "reverse":
				collect.collection.get(selection - 65).reverse();
				cont();
=======
				//
				break;

			case "reverse":
				System.out.println("Not yet implemented");
>>>>>>> refs/remotes/origin/master
				break;

			case "randomize":
				collect.collection.get(selection - 65).randomize();
				cont();
				break;

			case "save":
				System.out.println("Not yet implemented");
				break;

			case "restore":
				System.out.println("Not yet implemented");
				break;

			case "quit":
				System.exit(0);
				break;

			default:
				System.out.println("Unrecognized input!\n");
				break;
			}

		} while (true);

	}
<<<<<<< HEAD
	
	public static void cont() {
		Scanner input = new Scanner(System.in);
		System.out.println("Press enter to continue...");
		input.nextLine();
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	}
=======
>>>>>>> refs/remotes/origin/master

}