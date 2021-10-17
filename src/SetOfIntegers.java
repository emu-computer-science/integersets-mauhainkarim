import java.util.*;

public class SetOfIntegers {
	// ArrayList for dynamic set
	ArrayList<Integer> set = new ArrayList<Integer>();
	
	// 0 = random, 1 = increasing, 2 = decreasing
	int state = 0; 
	
	public SetOfIntegers() {
		Scanner input = new Scanner(System.in);
		String token;
		int currentInt;
		String setName;
		setName = input.next();
      
		System.out.println("Please enter a sequence of integers separated by spaces.");
		System.out.println("Terminate the sequence by pressing ENTER.");
		
		// Read in sequence of integers to set
		token = input.next();
		while(!token.equals("")) {
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
	
	public void randomize() {
		//Random r = new Random();
		//for(int x = set.size() - 1; x > 0; x--) {
			// int y = r.nextInt(x);
			//int temp = set.get(x);
			//set.get(x) = set.get(y);
			//s.get(y) = temp;
		//}
      Collections.shuffle(set);
	}
   
	public void sort() {
	   int n = set.size();
        for (int i = 1; i < n; ++i) {
            int k = set.get(i);
            int j = i - 1;
 
            while (j >= 0 && set.get(j > k) {
                set.get(j + 1) = set.get(j);
                j = j - 1;
            }
			
            set.get(j + 1) = k;
	}
	
	public void reverse() {
	   for (int i = 0; i < set.size() / 2; i++) {
		   Integer temp = set.get(i);
		   set.set(i, set.get(set.size() - i - 1));
		   set.set(set.size() - i - 1, temp);
	   }
	   
	}
	
}