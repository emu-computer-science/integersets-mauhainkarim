import java.util.ArrayList;

public class CollectionSetOfIntegers {
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
	
	public void save() {
	   System.out.println("Not yet implemented");
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