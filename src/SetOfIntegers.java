import java.util.*;
import java.io.*;

public class SetOfIntegers {
	// ArrayList for dynamic set
	ArrayList<Integer> set = new ArrayList<Integer>();

	// 0 = random, 1 = increasing, 2 = decreasing
	int state = 0;
	private char identifier;

	public SetOfIntegers(char c) {
		Scanner input = new Scanner(System.in);
		identifier = c;
		int currentInt;

		System.out.println("\nPlease enter a sequence of integers separated by spaces.");
		System.out.println("Terminate the sequence by pressing ENTER.");

		// Read in sequence of integers to set
		String token = input.nextLine();
		String[] tokens = token.split(" ");

		if (tokens[0] != "") {
			for (int i = 0; i < tokens.length; i++) {
				set.add(Integer.parseInt(tokens[i]));
			}
		}

		System.out.print("\nA new set, " + identifier + ", has been added: [random] {");

		// Print new set
		for (int i = 0; i < set.size(); i++) {
			if (i == 0)
				System.out.print(set.get(i));
			else
				System.out.print(", " + set.get(i));
		}
		System.out.println("}.");
	}

	public char getID() {
		return identifier;
	}
	
	public void setID(char c) {
		identifier = c;
	}
	
	public int getSize() {
		return set.size();
	}
	
	public String getState() {
		if(state == 0)
			return "random";
		else if(state == 1)
			return "increasing";
		else if(state == 2)
			return "decreasing";
		else
			return "ERROR: INVALID STATE";
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
		System.out.print("\n" + identifier + ". [" + getState() + "] {");
		
		for (int i = 0; i < set.size(); i++) {
			if (i == 0)
				System.out.print(set.get(i));
			else
				System.out.print(", " + set.get(i));
		}
		System.out.print("}");
	}
   public void save() {
      FileWriter wr = null;
      try
      {
         System.out.println("Please enter the name of your save state: ");
         Scanner in = new Scanner(System.in);
         String fileName = in.nextLine();
         wr = new FileWriter(fileName + ".txt");
         wr.write(identifier + "\n");
         wr.write(getState() + "\n");
         for(int i = 0; i < set.size(); i++)
         {
			   wr.write(set.get(i).toString());
         }
         System.out.println("Successfully wrote to the file.");
         wr.close();
      }
      catch(Exception e)
      {
         System.out.println("Error!");
      }
   }

}