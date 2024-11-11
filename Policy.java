public class Policy
{
   private int policyNumber;
   private static int numObjects=0;

   
   public Policy() {
      policyNumber = 0;
      numObjects++;
   }
   public Policy(int number) {
      policyNumber = number;
      numObjects++
 
   }
   //@return policyNumber
   public int getPolicyNumber(){
      return policyNumber;
   }
   
   public static int getNumObjects(){
      return numbObjects;
   }
   
   public String toString(){
         System.out.println("Policy Number: " + getPolicyNumber());
         System.out.println("\n");
   }

}