import java.util.*;
class Main{
public static void main(String[] args){
System.out.println("Name - Dhruv Barot");
System.out.println("Enrollment No - 250393107002");
Scanner sc=new Scanner(System.in);
System.out.print("Enter sentence: ");
String input=sc.nextLine();
String[] words=input.split("\\s+");
HashMap<String,Integer> map=new HashMap<String,Integer>();
for(String w:words){
if(map.containsKey(w))map.put(w,map.get(w)+1);
else map.put(w,1);
}
System.out.println();
for(String key:map.keySet()){
System.out.println(key+" -> "+map.get(key));
}
sc.close();
}
}