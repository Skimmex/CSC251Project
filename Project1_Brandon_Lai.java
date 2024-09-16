import java.util.Scanner;
public class Project1_Brandon_Lai
{
   public static void main(String[] args)
   {
      Scanner scnr = new Scanner(System.in);
      
      System.out.println("Please enter the Policy Number: ");
      int number = scnr.nextInt();
      scnr.nextLine();
      System.out.println("Please enter the Provider Name: ");
      String name = scnr.nextLine();
      System.out.println("Please enter the Policyholder’s First Name: ");
      String fName = scnr.nextLine();
      System.out.println("Please enter the Policyholder’s Last Name: ");
      String lName = scnr.nextLine();
      System.out.println("Please enter the Policyholder’s Age: ");
      int age = scnr.nextInt();
      scnr.nextLine();
      System.out.println("Please enter the Policyholder’s Smoking Status (smoker/non-smoker): ");
      String smoker = scnr.nextLine();
      System.out.println("Please enter the Policyholder’s Height (in inches): ");
      double height = scnr.nextDouble();
      System.out.println("Please enter the Policyholder’s Weight (in pounds): ");
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
      System.out.println("Policyholder’s BMI: " + policy.getBMI());
      System.out.println("Policy Price: $%.2d" + policy.getPrice());
      
      
      
   }
}
