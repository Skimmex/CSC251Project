public class PolicyHolder
{
   private String providerName;
   private String holderFirstName;
   private String holderLastName;
   private int holderAge;
   private String holderSmokes;
   private double holderHeight;
   private double holderWeight;
   private double bmi = (holderWeight*703)/(holderHeight*holderHeight);
   
   public Policy() {
      providerName = "";
      holderFirstName = "";
      holderLastName = "";
      holderAge = 0;
      holderSmokes = "";
      holderHeight = 0;
      holderWeight = 0;
   }
   public Policy(String name,String fName, String lName, int age, String smoker, double height, double weight) {
      providerName = name;
      holderFirstName = fName;
      holderLastName = lName;
      holderAge = age;
      holderSmokes = smoker;
      holderHeight = height;
      holderWeight = weight;
   }

   //@return holderFirstName
   public String getHolderFirstName(){
      return holderFirstName;
   }   
   //@return providerName
   public String getProviderName(){
      return providerName;
   }   
   //@return holderLastName
   public String getHolderLastName(){
      return holderLastName;
   }   
   //@return holderAge
   public int getHolderAge(){
      return holderAge;
   }   
   //@return holderSmokes
   public String getHolderSmokes(){
      return holderSmokes;
   } 
   //@return holderHeight
   public double getHolderHeight(){
      return holderHeight;
   } 
   //@return holderWeight
   public double getHolderWeight(){
      return holderWeight;
   } 
   //@return BMi derived from holder's weight and height
   public double getBMI(){
      return (holderWeight*703)/(holderHeight*holderHeight);
   }
   //@return price of policy based on smoking and bmi conditions 
   public double getPrice(){
      int baseFee = 600;
      if (holderAge > 50){
         baseFee+=75;
      }
      if (holderSmokes.equals("smoker")){
         baseFee+=100;
      }
      if (bmi>35){
         baseFee+=(bmi-35)*20;
      }
      return baseFee;
   }
   
   public string toString(){
         System.out.println("Provider Name: " + getProviderName());
         System.out.println("Policyholder’s First Name: " + getHolderFirstName());
         System.out.println("Policyholder’s Last Name: " + getHolderLastName());
         System.out.println("Policyholder’s Age: " + getHolderAge());
         System.out.println("Policyholder’s Smoking Status: " + getHolderSmokes());
         System.out.println("Policyholder’s Height: " + getHolderHeight() + " inches");
         System.out.println("Policyholder’s Weight: " + getHolderWeight()+ " pounds");
         System.out.printf("Policyholder’s BMI: %.2f", getBMI());
         System.out.printf("\nPolicy Price: $%.2f", getPrice());
         System.out.println("\n");
   }

}