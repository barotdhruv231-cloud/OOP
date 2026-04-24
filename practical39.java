class Printer{
int num=1;
synchronized void printRange(int start,int end){
try{
while(num<start)wait();
for(int i=start;i<=end;i++){
System.out.println(i);
num++;
}
notifyAll();
}catch(Exception e){}
}
}
class T1 extends Thread{
Printer p;
T1(Printer p){this.p=p;}
public void run(){
p.printRange(1,100);
}
}
class T2 extends Thread{
Printer p;
T2(Printer p){this.p=p;}
public void run(){
p.printRange(101,200);
}
}
class T3 extends Thread{
Printer p;
T3(Printer p){this.p=p;}
public void run(){
p.printRange(201,300);
}
}
public class Main{
public static void main(String[] args){
System.out.println("Name - Dhruv Barot");
System.out.println("Enrollment No - 250393107002");
Printer p=new Printer();
T1 t1=new T1(p);
T2 t2=new T2(p);
T3 t3=new T3(p);
t1.start();
t2.start();
t3.start();
}
}