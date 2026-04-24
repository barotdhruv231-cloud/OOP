import java.io.*;
public class Main{
public static void main(String[] args){
System.out.println("Name - Dhruv Barot");
System.out.println("Enrollment No - 250393107002");
BufferedReader br=null;
int lines=0,words=0,chars=0;
try{
br=new BufferedReader(new FileReader("data.txt"));
String line;
while((line=br.readLine())!=null){
lines++;
String trimmed=line.trim();
if(trimmed.length()>0){
String[] w=trimmed.split("\\s+");
words+=w.length;
}
chars+=line.replaceAll("\\s","").length();
}
System.out.println("Lines: "+lines);
System.out.println("Words: "+words);
System.out.println("Characters: "+chars);
}catch(FileNotFoundException e){
System.out.println("File not found");
}catch(IOException e){
System.out.println("IO Error");
}finally{
try{
if(br!=null)br.close();
}catch(IOException e){
System.out.println("Error closing file");
}
}
}
}