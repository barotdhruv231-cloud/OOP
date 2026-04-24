import java.util.*;
class Main{
static <T> boolean searchElement(LinkedList<T> list,T element){
return list.contains(element);
}
public static void main(String[] args){
System.out.println("Name - Dhruv Barot");
System.out.println("Enrollment No - 250393107002");
LinkedList<Integer> rolls=new LinkedList<Integer>();
rolls.add(101);
rolls.add(102);
rolls.add(103);
System.out.println("\nSearch 102 in rolls: "+searchElement(rolls,102));
System.out.println("Search 105 in rolls: "+searchElement(rolls,105));
LinkedList<String> names=new LinkedList<String>();
names.add("Dhruv");
names.add("Rahul");
names.add("Amit");
System.out.println("\nSearch Rahul in names: "+searchElement(names,"Rahul"));
System.out.println("Search Karan in names: "+searchElement(names,"Karan"));
}
}