import java.util.*;
class Main{
static <T extends Comparable<T>> void sortList(List<T> list){
Collections.sort(list);
}
public static void main(String[] args){
System.out.println("Name - Dhruv Barot");
System.out.println("Enrollment No - 250393107002");
ArrayList<Integer> numbers=new ArrayList<Integer>();
numbers.add(50);
numbers.add(20);
numbers.add(40);
numbers.add(10);
System.out.println("\nNumbers Before Sorting:");
System.out.println(numbers);
sortList(numbers);
System.out.println("Numbers After Sorting:");
System.out.println(numbers);
ArrayList<String> names=new ArrayList<String>();
names.add("Dhruv");
names.add("Rahul");
names.add("Amit");
names.add("Karan");
System.out.println("\nNames Before Sorting:");
System.out.println(names);
sortList(names);
System.out.println("Names After Sorting:");
System.out.println(names);
}
}