import org.w3c.dom.ls.LSOutput;

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

		System.out.println("Sequence terminated.");
		System.out.println("Your current list is now:");

		// Print new set
		for (int i = 0; i < set.size(); i++) {
			if (i == 0)
				System.out.print(set.get(i));
			else
				System.out.print(", " + set.get(i));
		}
		System.out.println("");
	}

	public char getID() {
		return identifier;
	}
	
	public void setID(char c) {
		identifier = c;
	}

	public void randomize(List<Integer> s) {
		Random r = new Random();
		for (int x = 0; x < s.size(); x++) {
			int current = s.get(x);
			int random = x + r.nextInt(s.size() - x);
			s.set(x, s.get(random));
			s.set(random, current);
		}
		state = 0;
	}

	public void sort(List<Integer> s) {
		for (int x = 0; x < s.size(); x++) {
			for (int y = s.size() - 1; y > x; y--) {
				if (s.get(x) > s.get(y)) {
					int temp = s.get(x);
					s.set(x, s.get(y));
					s.set(y, temp);
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
		if(state == 0) {
			System.out.print(identifier + ". [random] {");
		}
		else if(state == 1) {
			System.out.print(identifier + ". [increasing] {");
		}
		else if(state == 2) {
			System.out.print(identifier + ". [decreasing] {");
		}
		
		for (int i = 0; i < set.size() - 1; i++) {
			if (i == 0)
				System.out.print(set.get(i));
			else
				System.out.print(", " + set.get(i));
		}
		System.out.println("}");
	}

}