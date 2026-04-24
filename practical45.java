import java.io.*;
import java.util.Date;
public class Main{
public static void main(String[] args){
System.out.println("Name - Dhruv Barot");
System.out.println("Enrollment No - 250393107002");
if(args.length<2){
System.out.println("Usage: copy src dest | delete file | rename old new");
return;
}
File f=null;
try{
if(args[0].equalsIgnoreCase("copy")){
if(args.length<3){
System.out.println("Provide source and destination");
return;
}
File src=new File(args[1]);
File dest=new File(args[2]);
if(!src.exists()){
System.out.println("Source file not found");
return;
}
FileInputStream in=new FileInputStream(src);
FileOutputStream out=new FileOutputStream(dest);
int ch;
while((ch=in.read())!=-1)out.write(ch);
in.close();
out.close();
f=dest;
System.out.println("File copied");
}
else if(args[0].equalsIgnoreCase("delete")){
File file=new File(args[1]);
if(file.exists()&&file.delete()){
System.out.println("File deleted");
f=file;
}else{
System.out.println("Delete failed");
return;
}
}
else if(args[0].equalsIgnoreCase("rename")){
if(args.length<3){
System.out.println("Provide old and new name");
return;
}
File oldFile=new File(args[1]);
File newFile=new File(args[2]);
if(oldFile.exists()&&oldFile.renameTo(newFile)){
System.out.println("File renamed");
f=newFile;
}else{
System.out.println("Rename failed");
return;
}
}
if(f!=null){
System.out.println("File Name: "+f.getName());
System.out.println("Absolute Path: "+f.getAbsolutePath());
System.out.println("Size: "+f.length());
System.out.println("Readable: "+f.canRead());
System.out.println("Writable: "+f.canWrite());
System.out.println("Last Modified: "+new Date(f.lastModified()));
}
}catch(FileNotFoundException e){
System.out.println("File not found");
}catch(IOException e){
System.out.println("IO Error");
}catch(Exception e){
System.out.println("Error: "+e.getMessage());
}
}
}