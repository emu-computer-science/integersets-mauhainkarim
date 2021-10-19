import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class CollectionSetOfIntegers implements Serializable{
	// Create collection of SetOfIntegers type, as well as a char array of the alphabet for naming the sets
	ArrayList<SetOfIntegers> collection = new ArrayList<SetOfIntegers>();
	char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

	public void add() {
		int size = collection.size();
		SetOfIntegers set = new SetOfIntegers(alphabet[size]);
		collection.add(set);
	}
	
	public void delete(int index) {
		if (index == 0)
			System.out.println("\nCannot delete because there is no currently selected set.");
		else {
			collection.remove(index - 65);
			System.out.println("\nSet " + alphabet[index - 65] + " has been deleted. Remaining sets have been relabeled.");
			update();
			if(index - 65 > getSize() || getSize() == 0) {
				System.out.println("No set is currently selected.");
			}
			else {
				System.out.print("The current set is " + collection.get(index - 65).getID() + ". [" + collection.get(index - 65).getState() + "] {");
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
	
	public static void save() {
		Scanner filename = new Scanner(System.in);
		System.out.println("Please enter a file name to save the state of this system under: (ex: 'file.txt').");
		String N = filename.nextLine();
		try {
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(N));
		} catch (IOException e) {
			System.out.println("Unable to write to file " + N + ".");
		}


	}
	
	public void restore() {
	   System.out.println("Not yet implemented");
	}
	
	public boolean quit() {
	   return false;
	}
	
	public void update() {
		for(int i = 0; i < collection.size(); i++)
			collection.get(i).setID(alphabet[i]);
	}
	
	public int getSize() {
		return collection.size();
	}
	
}