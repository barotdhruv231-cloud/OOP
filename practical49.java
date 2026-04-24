import java.util.*;
class Box<T>{
ArrayList<T> items=new ArrayList<T>();
void addItem(T item){
items.add(item);
}
void display(){
for(T i:items)System.out.println(i);
}
}
public class Main{
public static void main(String[] args){
System.out.println("Name - Dhruv Barot");
System.out.println("Enrollment No - 250393107002");
Box<String> names=new Box<String>();
names.addItem("Dhruv");
names.addItem("Rahul");
names.addItem("Amit");
System.out.println("\nNames:");
names.display();
Box<Integer> rolls=new Box<Integer>();
rolls.addItem(101);
rolls.addItem(102);
rolls.addItem(103);
System.out.println("\nRoll Numbers:");
rolls.display();
}
}