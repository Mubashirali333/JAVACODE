import java.util.*;
public class LinkedListDemo {

   public static void main(String args[]) {
      // create a linked list
      LinkedList obj = new LinkedList();
      
      // add elements to the linked list
      obj.add("F");
      obj.add("B");
      obj.add("D");
      obj.add("E");
      obj.add("C");
      obj.addLast("Z");
      obj.addFirst("A");
      obj.add(1, "A2");
      System.out.println("Original contents of obj: " + obj);

      // remove elements from the linked list
      obj.remove("F");
      obj.remove(2);
      System.out.println("Contents of obj after deletion: " + obj);
      
      // remove first and last elements
      obj.removeFirst();
      obj.removeLast();
      System.out.println("obj after deleting first and last: " + obj);

      // get and set a value
      Object val = obj.get(2);
      obj.set(2, (String) val + " Changed");
      System.out.println("obj after change: " + obj);
   }

	}
