import java.io.*;
public class Main{
public static void main(String[] args){
System.out.println("Name - Dhruv Barot");
System.out.println("Enrollment No - 250393107002");
FileWriter fw=null;
BufferedReader br=null;
try{
fw=new FileWriter("students.txt");
fw.write("101 Dhruv 85\n");
fw.write("102 Rahul 78\n");
fw.write("103 Amit 90\n");
fw.close();
br=new BufferedReader(new FileReader("students.txt"));
String line;
System.out.println("\nStudent Records:");
while((line=br.readLine())!=null){
System.out.println(line);
}
}catch(IOException e){
System.out.println("Error: "+e.getMessage());
}finally{
try{
if(fw!=null)fw.close();
if(br!=null)br.close();
}catch(IOException e){
System.out.println("Error closing file");
}
}
}
}