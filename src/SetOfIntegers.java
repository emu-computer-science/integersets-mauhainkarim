import java.util.*;

public class SetOfIntegers {
	// ArrayList for dynamic set
	ArrayList<Integer> set = new ArrayList<Integer>();

	// 0 = random, 1 = increasing, 2 = decreasing
	int state = 0;
	private char identifier;

	public SetOfIntegers(char c) {
		Scanner input = new Scanner(System.in);
		identifier = c;
		String token;
		int currentInt;

		System.out.println("Please enter a sequence of integers separated by spaces.");
		System.out.println("Terminate the sequence by pressing ENTER (or return),\n" +
				"then typing 'Q'. ");

		// Read in sequence of integers to set
		token = input.next();
		while (!token.equals("Q")) {
			currentInt = Integer.parseInt(token);
			set.add(currentInt);
			token = input.next();
		}

<<<<<<< HEAD
		System.out.print("\nA new set, " + identifier + ", has been added: [random] {");

=======
		System.out.println("Sequence terminated.");
		System.out.println("Your Integer List is now: ");
>>>>>>> refs/remotes/origin/master
		// Print new set
		for (int i = 0; i < set.size(); i++) {
			if (i == 0)
				System.out.print(set.get(i));
			else
				System.out.print(", " + set.get(i));
		}
		System.out.println();
	}
	
	public char getID() {
		return identifier;
	}
	
	public void setID(char c) {
		identifier = c;
	}

	public void randomize() {
		Random r = new Random();
		for (int x = 0; x < set.size(); x++) {
			int current = set.get(x);
			int random = x + r.nextInt(set.size() - x);
			set.set(x, set.get(random));
			set.set(random, current);
		}
		state = 0;
	}

	public void sort() {
		for (int x = 0; x < set.size(); x++) {
			for (int y = set.size() - 1; y > x; y--) {
				if (set.get(x) > set.get(y)) {
					int temp = set.get(x);
					set.set(x, set.get(y));
					set.set(y, temp);
				}
			}
		}
		state = 1;
	}

	public void reverse() {
		for (int i = 0; i < set.size() / 2; i++) {
			Integer temp = set.get(i);
			set.set(i, set.get(set.size() - i - 1));
			set.set(set.size() - i - 1, temp);
		}
		state = 2;

	}

	public void printSet() {
		// Print set
<<<<<<< HEAD
		System.out.print("\n" + identifier + ". [" + getState() + "] {");
=======
		if(state == 0) {
			System.out.print(identifier + ". [random] {");
		}
		else if(state == 1) {
			System.out.print(identifier + ". [increasing] {");
		}
		else if(state == 2) {
			System.out.print(identifier + ". [decreasing] {");
		}
>>>>>>> refs/remotes/origin/master
		
		for (int i = 0; i < set.size() - 1; i++) {
			if (i == 0)
				System.out.print(set.get(i));
			else
				System.out.print(", " + set.get(i));
		}
		System.out.print("}");
	}

}