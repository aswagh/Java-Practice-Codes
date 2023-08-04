import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetCollection {

	public static void main(String[] args) {


		Set<String> hashSet = new HashSet<String>();
		hashSet.add("Tiger");
		hashSet.add("Lion");
		hashSet.add("Cheetah");
		hashSet.add("Gorila");
		hashSet.add("Deer");
		hashSet.add("Elephant");
		hashSet.add("Tiger");
		System.out.println("HashSet Example: "+hashSet+" Insertion order is not preserved");
		
		Set<String> treeSet = new TreeSet<String>();
		treeSet.addAll(hashSet);
		System.out.println("HashSet Example: "+ treeSet+ " Inserted according to natural order");

		Set<String> linkedHashset = new LinkedHashSet<String>();
		linkedHashset.addAll(hashSet);
		System.out.println("LinkedHashSet Example:	"+hashSet+" Insertion order is preserved");
	}

}
