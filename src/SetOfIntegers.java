import java.util.*;

public class SetOfIntegers {
	// ArrayList for dynamic set
	ArrayList<Integer> set = new ArrayList<Integer>();
	
	// 0 = random, 1 = increasing, 2 = decreasing
	int state = 0; 
	
   public SetOfIntegers(int s)
   {
      set.add(s);
   }
	public SetOfIntegers() {
		Scanner input = new Scanner(System.in);
		String token;
		int currentInt;
      
		System.out.println("Please enter a sequence of integers separated by spaces.");
		System.out.println("Terminate the sequence by pressing ENTER.");
		
		// Read in sequence of integers to set
		token = input.next();
		while(!token.equals("Q")) {
			currentInt = Integer.parseInt(token);
			set.add(currentInt);
			token = input.next();
		}
		
		System.out.println("Sequence terminated.");
		
		// Print new set
		for (int i = 0; i < set.size() - 1; i++) {
			if(i == 0)
				System.out.print(set.get(i));
			else
				System.out.print(", " + set.get(i));
		}
	}
	
      public void randomize(List<Integer> s) {
		Random r = new Random();
		for(int x = 0; x < s.size(); x++) 
      {
         int current = s.get(x);
         int random = x + r.nextInt(s.size() - x);
         s.set(x, s.get(random));
         s.set(random, current);
		}
	}

   
	public void sort(List<Integer> s) {
   
      for (int x = 0; x < s.size(); x++) {
         for (int y = s.size() - 1; y > x; y--) {
            if (s.get(x) > s.get(y)) {
               int temp = s.get(x);
               s.set(x,s.get(y));
               s.set(y,temp);
            }
         }
	   }
   }
	
	public void reverse() {
	   for (int i = 0; i < set.size() / 2; i++) {
		   Integer temp = set.get(i);
		   set.set(i, set.get(set.size() - i - 1));
		   set.set(set.size() - i - 1, temp);
	   }
	   
	}
   public void printSet() {
      // Print new set
		for (int i = 0; i < set.size() - 1; i++) {
			if(i == 0)
				System.out.print(set.get(i));
			else
				System.out.print(", " + set.get(i));
      }
   }
	
}