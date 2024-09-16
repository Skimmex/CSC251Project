public class MyFirstProgram
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
      int age = scnr.nextLine();
      System.out.println("Please enter the Policyholder’s Smoking Status (smoker/non-smoker): ");
      String smoker = scnr.nextLine();
      System.out.println("Please enter the Policyholder’s Height (in inches): ");
      double height = scnr.nextInt();
      System.out.println("Please enter the Policyholder’s Weight (in pounds): ");
      double weight = scnr.nextInt();
      
      Policy pol = new Policy(number,name,fname,lname,age,smoker,height,weight);
      
      
   }
}
