package cs2130p3;

import cs2130p3.DProb;
import java.text.DecimalFormat;

public class P3PartB {
    private static DecimalFormat df4 = new DecimalFormat(".####");
    private static double Q2CResult = DProb.HyperGeometric(50, 9, 4, 0) * DProb.HyperGeometric(30, 4, 4, 0);

    public static void main(String[] args) {
        System.out.println("CS2130 Project 3 Part B");
        addLine();
        System.out.println("Question 1 part a:");
        System.out.println("Permutation of 33 choose 4 = " + DProb.Permutation(33, 4));
        System.out.println("Question 1 part b:");
        System.out.println("Combination of 33 choose 4 = " + DProb.Combination(33, 4));
        addLine();
        
        System.out.println("Question 2 part a:");
        System.out.println("Hypergeometric probability that 0 infected computers will be chosen from Lab A = " 
        + df4.format(DProb.HyperGeometric(50, 9, 8, 0)));
        System.out.println("Question 2 part b:");
        System.out.println("Hypergeometric probability that 0 infected computers will be chosen from Lab B = " 
        + df4.format(DProb.HyperGeometric(30, 4, 8, 0)));
        System.out.println("Question 2 part c:");
        System.out.println("Hypergeometric probability that 0 infected computers will be chosen from Lab A + Lab B using two seperate samples = " 
        + df4.format(Q2CResult));
        System.out.println("Question 2 part d:");
        System.out.println("Hypergeometric probability that 0 infected computers will be chosen from Lab A + Lab B using one combined sample = " 
        + df4.format(DProb.HyperGeometric(80, 13, 8, 0)));
        addLine();
        

        
        

       
    }
    
    public static void addLine() {
        System.out.println("-----------------------");
    }

}
