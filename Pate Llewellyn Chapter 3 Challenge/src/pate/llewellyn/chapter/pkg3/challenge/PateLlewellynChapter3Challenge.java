package pate.llewellyn.chapter.pkg3.challenge;
import javax.swing.JOptionPane;
public class PateLlewellynChapter3Challenge {
        public static void main(String[] args) {
    String fName = JOptionPane.showInputDialog("What is your first name?:");
    String lName = JOptionPane.showInputDialog("What is you last name?:");
    String Age = JOptionPane.showInputDialog("How old are you?:");
    Integer.parseInt(Age);
    int cYear = 2020;
    int Year = (cYear - Integer.parseInt(Age));
    System.out.println(fName);
    System.out.println(lName);
    System.out.println(Year);
}
    }