import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
public class Project1_Brandon_Lai
{
   public static void main(String[] args) throws Exception
   {
      File file = new File("PolicyInformation.txt");
      Scanner scnr = new Scanner(file);
      ArrayList<Policy> policies = new ArrayList<>();
      int smokers = 0;
      int nonsmokers = 0;
      while (scnr.hasNextLine())
      {
         int number = scnr.nextInt();
         scnr.nextLine();
         String name = scnr.nextLine();
         String fName = scnr.nextLine();
         String lName = scnr.nextLine();
         int age = scnr.nextInt();
         scnr.nextLine();
         String smoker = scnr.nextLine();
         if (smoker.equals("smoker")) smokers++;
         else nonsmokers++;
         double height = scnr.nextDouble();
         double weight = scnr.nextDouble();
         
         Policy policy = new Policy(number,name,fName,lName,age,smoker,height,weight);
         
         System.out.println("Policy Number: " + policy.getPolicyNumber());
         System.out.println("Provider Name: " + policy.getProviderName());
         System.out.println("Policyholder’s First Name: " + policy.getHolderFirstName());
         System.out.println("Policyholder’s Last Name: " + policy.getHolderLastName());
         System.out.println("Policyholder’s Age: " + policy.getHolderAge());
         System.out.println("Policyholder’s Smoking Status: " + policy.getHolderSmokes());
         System.out.println("Policyholder’s Height: " + policy.getHolderHeight() + " inches");
         System.out.println("Policyholder’s Weight: " + policy.getHolderWeight()+ " pounds");
         System.out.printf("Policyholder’s BMI: %.2f", policy.getBMI());
         System.out.printf("\nPolicy Price: $%.2f", policy.getPrice());
         System.out.println("\n");
         
      }
      scnr.close();
      
      System.out.println("The number of policies with a smoker is: "+smokers);
      System.out.println("the number of policies with a non-smoker is: "+nonsmokers);
      
      
      
      
   }
}
