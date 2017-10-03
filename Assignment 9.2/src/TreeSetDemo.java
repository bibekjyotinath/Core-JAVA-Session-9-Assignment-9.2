import java.util.*;					//importing the java.util class to use TreeSet
public class TreeSetDemo {			//main class of the program

	public static void main(String[] args) {		//main method of the program
		
		TreeSet<String> S1 = new TreeSet<String>();		//creation of 1st TreeSet 
		//adding elements to the TreeSet
		S1.add("A");
		S1.add("B");
		S1.add("Z");
		S1.add("C");
		
		TreeSet<String> S2 = new TreeSet<String>();		//creation of 1st TreeSet 
		//adding elements to the TreeSet
		S2.add("C");
		S2.add("X");
		S2.add("B");
		S2.add("Z");
		
		System.out.println("The 1st TreeSet Contains (S1): " +S1);		//Displaying the contents of Set S1 on console
		System.out.println("The 2nd TreeSet Contains (S2): " +S2);		//Displaying the contents of Set S1 on console
		
		S1.addAll(S2);													//adding the contents of S2 in S1 (Union Operation)
		System.out.println("The union of Set S1 and Set S2 are: " +S1);	//Displaying the contents after union operation on Console
	}

}
