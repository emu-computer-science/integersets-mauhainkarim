import java.util.*;

public class RunIntegerSets {
	public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      CollectionSetOfIntegers collection1 = new CollectionSetOfIntegers();
      int s = 0;
      SetOfIntegers set1 = new SetOfIntegers(s);
      boolean b = true;
      do{
		System.out.println("List of Commands : ");
		System.out.println(" show\n add\n select\n delete\n sort\n reverse\n randomize\n save\n restore\n quit");
		System.out.println("Please enter a command by name: (ex. add) ");
      String userInput = in.nextLine();
      switch(userInput.toLowerCase()){
         case "show" :
            set1.printSet();
            break;
         case "add" :
            set1 = new SetOfIntegers();
            break;
         case "select" :
            System.out.println("Not yet implemented");
            break;
         case "delete" :
            System.out.println("Not yet implemented");
            break;
         case "sort" :
            set1.sort(set1.set);
            break;
         case "reverse" :
            System.out.println("Not yet implemented");
            break;
         case "randomize" :
            set1.randomize(set1.set);
            break;
         case "save" :
            System.out.println("Not yet implemented");
            break;
         case "restore" :
            System.out.println("Not yet implemented");
            break;
         case "quit" :
            b = collection1.quit();
            break;
         default :
            System.out.println("Unrecognized input!\n");
            break;
         }
      }while(b);
    }
}