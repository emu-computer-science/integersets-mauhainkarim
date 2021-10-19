import java.io.*;
import java.util.*;

public class CollectionSetOfIntegers implements Serializable {
	// Create collection of SetOfIntegers type, as well as a char array of the
	// alphabet for naming the sets
	ArrayList<SetOfIntegers> collection = new ArrayList<SetOfIntegers>();
	char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
	private Object CollectionSetOfIntegers;
	Scanner input = new Scanner(System.in);

	public void add() {
		// Create new set
		int size = collection.size();
		SetOfIntegers set = new SetOfIntegers(alphabet[size]);
		collection.add(set);
	}

	public void delete(int index) {
		// Delete set at given index
		if (index == 0)
			System.out.println("\nCannot delete because there is no currently selected set.");
		else {
			collection.remove(index - 65);
			System.out.println(
					"\nSet " + alphabet[index - 65] + " has been deleted. Remaining sets have been relabeled.");
			update();
			if (index - 65 > getSize() || getSize() == 0) {
				System.out.println("No set is currently selected.");
			} else {
				System.out.print("The current set is " + collection.get(index - 65).getID() + ". ["
						+ collection.get(index - 65).getState() + "] {");
				// Print new set
				for (int i = 0; i < collection.get(index - 65).getSize(); i++) {
					if (i == 0)
						System.out.print(collection.get(index - 65).set.get(i));
					else
						System.out.print(", " + collection.get(index - 65).set.get(i));
				}
				System.out.println("}.");
			}
		}
	}

	public void save() throws IOException {
		// Save state of program in a txt file
		System.out.println("\nPlease enter new file name for exported data: ");
		String fileName = input.nextLine();
		FileWriter writer = new FileWriter(fileName + ".txt");

		// Write each set to file
		for (int i = 0; i < collection.size(); i++) {
			writer.write(collection.get(i).getID() + "\n");
			writer.write(collection.get(i).getStateInt() + "\n");

			for (int j = 0; j < collection.get(i).getSize(); j++) {
				writer.write(collection.get(i).set.get(j) + " ");
			}
			writer.write("\n");
		}

		System.out.println("\nSuccessfully wrote data to file.");
		writer.close();
	}

	public void restore() throws IOException {
		// Restore state of program from a file
		System.out.println("\nPlease enter file name to import data (include file extension): ");
		String fileName = input.nextLine();
		FileReader reader = new FileReader(fileName);
		BufferedReader buffReader = new BufferedReader(reader);
		String token;

		// Read each set from file
		while ((token = buffReader.readLine()) != null) {
			char identifier;
			int state;
			ArrayList<Integer> set = new ArrayList<Integer>();
			identifier = token.charAt(0);
			token = buffReader.readLine();
			state = Integer.parseInt(token);
			token = buffReader.readLine();

			StringTokenizer tokenizer = new StringTokenizer(token);
			int count = tokenizer.countTokens();

			for (int x = 0; x < count; x++) {
				set.add(Integer.parseInt((String) tokenizer.nextElement()));
			}

			SetOfIntegers newSOI = new SetOfIntegers(identifier, state, set);
			collection.add(newSOI);
		}

		System.out.println("\nData was imported from file successfully.");
		reader.close();
	}

	public boolean quit() {
		return false;
	}

	public void update() {
		// Update set identifiers
		for (int i = 0; i < collection.size(); i++)
			collection.get(i).setID(alphabet[i]);
	}

	public int getSize() {
		// Return collection size
		return collection.size();
	}
}