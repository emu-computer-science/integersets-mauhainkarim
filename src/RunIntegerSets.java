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
				for (int i = 0; i < collect.getSize(); i++) {
					collect.collection.get(i).printSet();
				}
				break;

			case "add":
				collect.add();
				break;

			case "select":
				System.out.print("Please select a set (A - " + collect.alphabet[collect.getSize()] + ": ");
				selection = Character.toUpperCase(input.next().charAt(0));
				if(selection - 65 > 0 && selection - 65 <= collect.getSize()) {
					// Input valid
				}
				break;

			case "delete":
				System.out.println("Not yet implemented");
				break;

			case "sort":
				//
				break;

			case "reverse":
				System.out.println("Not yet implemented");
				break;

			case "randomize":
				//
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

}