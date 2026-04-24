class Main{
static double average(String[] values)throws NullPointerException,NumberFormatException{
double sum=0;
for(int i=0;i<values.length;i++){
if(values[i]==null)throw new NullPointerException("Null value found");
sum+=Double.parseDouble(values[i]);
}
return sum/values.length;
}
public static void main(String[] args){
System.out.println("Name - Dhruv Barot");
System.out.println("Enrollment No - 250393107002");
String[] valid={"10","20","30"};
String[] invalidNumber={"10","abc","30"};
String[] nullArray={"10",null,"30"};
try{
System.out.println("\nValid Average: "+average(valid));
}catch(Exception e){
System.out.println(e);
}finally{
System.out.println("Completed valid test");
}
try{
System.out.println("\nInvalid Number Average: "+average(invalidNumber));
}catch(NumberFormatException e){
System.out.println("NumberFormatException: "+e.getMessage());
}catch(Exception e){
System.out.println(e);
}finally{
System.out.println("Completed invalid number test");
}
try{
System.out.println("\nNull Average: "+average(nullArray));
}catch(NullPointerException e){
System.out.println("NullPointerException: "+e.getMessage());
}catch(Exception e){
System.out.println(e);
}finally{
System.out.println("Completed null test");
}
}
}