package patellewellyn3.pkg2;
public class Chicken01 {
    public static void main(String[] args) {
    int totalEggs = 0;
    int chickenCount = 3;
    int eggsPerChicken = 5;
    String dayOfWeek = "Monday, ";
    String labelOne = "Farmer Brown's chickens number ";
    String labelTwo = "Farmer Brown's eggs number ";
    String frontEndLabel = "On ";
 //Monday Eggs
    // Egg Calculation
    totalEggs = chickenCount * eggsPerChicken;
        // Print Answer
    System.out.println(frontEndLabel + dayOfWeek + labelOne
            + chickenCount + labelTwo + totalEggs); 
// Tuesday Eggs
    dayOfWeek = "Tuesday, ";
    chickenCount++ ; 
    // Print Answer
    totalEggs = chickenCount * eggsPerChicken;
    System.out.println(frontEndLabel + dayOfWeek + labelOne
            + chickenCount + labelTwo + totalEggs);    
// Wednesday Eggs
    dayOfWeek = "Wednesday, ";
    chickenCount = chickenCount/2;
        //Print Answer
        totalEggs = chickenCount * eggsPerChicken;
        System.out.println(frontEndLabel + dayOfWeek + labelOne
            + chickenCount + labelTwo + totalEggs);
System.out.println(totalEggs); 
    }   
}