import java.util.*;
public class Main{
public static void main(String[] args){
System.out.println("Name - Dhruv Barot");
System.out.println("Enrollment No - 250393107002");
ArrayList<Integer> marks=new ArrayList<Integer>();
marks.add(75);
marks.add(88);
marks.add(92);
marks.add(67);
marks.add(81);
System.out.println("\nMarks:");
for(int m:marks){
System.out.println(m);
}
int max=Collections.max(marks);
int min=Collections.min(marks);
System.out.println("\nHighest: "+max);
System.out.println("Lowest: "+min);
}
}