class Thread1 extends Thread{
public void run(){
try{
for(int i=1;i<=10;i++){
System.out.println(i);
Thread.sleep(1000);
}
}catch(Exception e){}
}
}
class Thread2 extends Thread{
public void run(){
try{
for(int i=11;i<=20;i++){
System.out.println(i);
Thread.sleep(500);
}
}catch(Exception e){}
}
}
public class Main{
public static void main(String[] args){
System.out.println("Name - Dhruv Barot");
System.out.println("Enrollment No - 250393107002");
Thread1 t1=new Thread1();
Thread2 t2=new Thread2();
t1.start();
t2.start();
}
}