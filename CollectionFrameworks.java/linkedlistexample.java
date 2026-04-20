import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("Java");
		linkedList.add("Python");
		linkedList.add("C++");
		linkedList.add("DBMS");  
		System.out.println(linkedList);
		System.out.println(linkedList.get(0));
		

	}

}