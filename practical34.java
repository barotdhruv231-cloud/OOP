class VotingApp{
void checkEligibility(int age){
if(age<18)throw new IllegalArgumentException("Age must be 18 or above to vote");
System.out.println("Eligible to vote");
}
}
public class Main{
public static void main(String[] args){
System.out.println("Name - Dhruv Barot");
System.out.println("Enrollment No - 250393107002");
VotingApp v=new VotingApp();
int[] ages={16,18,20};
for(int i=0;i<ages.length;i++){
try{
System.out.println("\nChecking age: "+ages[i]);
v.checkEligibility(ages[i]);
}catch(IllegalArgumentException e){
System.out.println(e.getMessage());
}finally{
System.out.println("Validation process completed");
}
}
}
}