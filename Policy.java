public class Policy
{
   private int policyNumber;
   private String providerName;
   private String holderFirstName;
   private String holderLastName;
   private int holderAge;
   private String holderSmokes;
   private double holderHeight;
   private double holderWeight;
   private double bmi = (holderWeight*703)/(holderHeight*holderHeight);
   
   public Policy() {
      policyNumber = 0;
      providerName = "";
      holderFirstName = "";
      holderLastName = "";
      holderAge = 0;
      holderSmokes = "";
      holderHeight = 0;
      holderWeight = 0;
   }
   public Policy(int number, String name,String fName, String lName, int age, String smoker, double height, double weight) {
      policyNumber = number;
      providerName = name;
      holderFirstName = fName;
      holderLastName = lName;
      holderAge = age;
      holderSmokes = smoker;
      holderHeight = height;
      holderWeight = weight;
   }
   
   public int getPolicyNumber(){
      return policyNumber;
   }   
   
   public String getHolderFirstName(){
      return holderFirstName;
   }   
   
   public String getProviderName(){
      return providerName;
   }   
   
   public String getHolderLastName(){
      return holderLastName;
   }   
   
   public int getHolderAge(){
      return holderAge;
   }   
   
   public String getHolderSmokes(){
      return holderSmokes;
   } 
   
   public double getHolderHeight(){
      return holderHeight;
   } 
   
   public double getHolderWeight(){
      return holderWeight;
   } 
   
   public double getBMI(){
      return (holderWeight*703)/(holderHeight*holderHeight);
   }
   
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

}