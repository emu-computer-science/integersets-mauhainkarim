import java.util.ArrayList;

public class CollectionSetOfIntegers {
	// Create collection of SetOfIntegers type, as well as a char array of the alphabet for naming the sets
	ArrayList<SetOfIntegers> collection = new ArrayList<SetOfIntegers>();
	char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
	
	public void add() {
		int size = collection.size();
		SetOfIntegers set = new SetOfIntegers(alphabet[size]);
	}
	
	public void delete() {
		update();
	}
	
	public void select() {
	   System.out.println("Not yet implemented");
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