class A{
public int pubVar;
protected int protVar;
private int privVar;
A(int a,int b,int c){
pubVar=a;
protVar=b;
privVar=c;
}
}
class B extends A{
B(int a,int b,int c){
super(a,b,c);
}
void display(){
System.out.println("Public: "+pubVar);
System.out.println("Protected: "+protVar);
}
}
class C{
void display(){
A obj=new A(10,20,30);
System.out.println("Public: "+obj.pubVar);
}
}
public class Main{
public static void main(String[] args){
System.out.println("Name - Dhruv Barot");
System.out.println("Enrollment No - 250393107002");
B b=new B(1,2,3);
C c=new C();
System.out.println("\nFrom B:");
b.display();
System.out.println("\nFrom C:");
c.display();
}
}