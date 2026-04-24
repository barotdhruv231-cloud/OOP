import java.io.*;
public class Main{
public static void main(String[] args){
System.out.println("Name - Dhruv Barot");
System.out.println("Enrollment No - 250393107002");
if(args.length<1){
System.out.println("Please provide file name");
return;
}
int chars=0,words=0,lines=0;
try{
BufferedReader br=new BufferedReader(new FileReader(args[0]));
String line;
while((line=br.readLine())!=null){
lines++;
chars+=line.length();
String[] w=line.trim().split("\\s+");
if(line.trim().length()>0)words+=w.length;
}
br.close();
System.out.println("Characters: "+chars);
System.out.println("Words: "+words);
System.out.println("Lines: "+lines);
}catch(Exception e){
System.out.println("Error: "+e.getMessage());
}
}
}