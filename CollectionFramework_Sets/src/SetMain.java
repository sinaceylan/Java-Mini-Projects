import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetMain {

	public static void main(String[] args) {
		
		
		Set<String>set1 = new HashSet<String>();
		Set<String>set2 = new LinkedHashSet<String>();
		Set<String>set3 = new TreeSet<String>();
		 
		set1.add("Java");
		set1.add("Python");
		set1.add("C++");
		set1.add("Javascript");
		set1.add("Php");
		
		set2.add("Java");
		set2.add("Python");
		set2.add("C++");
		set2.add("Javascript");
		set2.add("Php");
		
		set3.add("Java");
		set3.add("Python");
		set3.add("C++");
		set3.add("Javascript");
		set3.add("Php");
		
		System.out.println("HashSet *************************");
		for(String a: set1) {
			System.out.println(a);
		}
		
		System.out.println();
		
		System.out.println("LinkedHashSet *************************");
		for(String a: set2) {
			System.out.println(a);
		}
		
		System.out.println();
		
		System.out.println("TreeSet *************************");
		for(String a: set1) {
			System.out.println(a);
		}
		
		System.out.println();

		System.out.println(set1.contains("Java"));
		
		System.out.println();
		
		System.out.println(set1.isEmpty());
	}

}
