/* Comparable:
    - It is an inerface present inside java.lang package.
    - It is used to define natural sorting order of the objects.
    - It provides only one method compareTo() to compare the current object with the specified object.
    - Sorting order is written inside same class whose objects are to be sorted.
    - It allows only one sorting sequence.
    - It is used when default sorting logic is required.
    - It is mainly used in TreeSet, TreeMap, and Arrays.sort() method.
    - Example: String, Wrapper classes (Integer, Float, Double, etc.) implement Comparable interface.

   Comparator:
    - It is an interface present inside java.util package.
    - It is used to define custom sorting orders of the objects.
    - It provides two methods compare( Object o1, Object o2) and equals(Object obj).
    - Sorting order is written inside separate class.
    - It allows multiple sorting sequences.
    - Useful for sorting based on multiple fields.
    - It is used when class source code cannot be modified.
    - It does not affect the original class.
    - It is mainly used in TreeSet, TreeMap, and Collections.sort() method.
    - Example: We can create our own Comparator implementation for custom sorting.
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Students implements Comparable<Students>{
	int id;
	String name;
	double marks;
	public Students(int id, String name, double marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	@Override
	public int compareTo(Students s) {
		return this.id - s.id;
	}
}

class SortByNames implements Comparator<Students>{

	@Override
	public int compare(Students s1, Students s2) {
		return s1.name.compareTo(s2.name);
	}
}

class SortByMarks implements Comparator<Students>{

	@Override
	public int compare(Students s1, Students s2) {
		return Double.compare(s1.marks, s2.marks);
	}
	
}
public class ComparableAndComparator {
	public static void main(String[] args) {
		
		List<Students> st = new ArrayList<Students>();
		st.add(new Students(3, "Murali", 75.5));
		st.add(new Students(4, "Aditya", 85.5));
		st.add(new Students(1, "Vishnu", 80.5));
		st.add(new Students(2, "Pramod", 90.5));
		st.add(new Students(2, "Suraj", 55.5));
		System.out.println(st);
		Collections.sort(st);
		System.out.println("\n--Sorted by id--");
		for (Students s : st) {
			System.out.println(s);
		}
		System.out.println("\n--Sorted by name--");
		Collections.sort(st,new SortByNames());
		for (Students s : st) {
			System.out.println(s);
		}
		
		System.out.println("\n--Sorted by marks--");
		Collections.sort(st, new SortByMarks());
		for (Students s : st) {
			System.out.println(s);
		}
	}
}