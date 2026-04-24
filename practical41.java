class SumThread extends Thread{
int start,end;
long sum=0;
SumThread(int s,int e){
start=s;
end=e;
}
public void run(){
for(int i=start;i<=end;i++){
sum+=i;
}
}
long getSum(){
return sum;
}
}
public class Main{
public static void main(String[] args){
System.out.println("Name - Dhruv Barot");
System.out.println("Enrollment No - 250393107002");
SumThread t1=new SumThread(1,1000);
SumThread t2=new SumThread(1001,2000);
t1.start();
t2.start();
try{
t1.join();
t2.join();
}catch(Exception e){}
long total=t1.getSum()+t2.getSum();
System.out.println("Final Sum: "+total);
}
}