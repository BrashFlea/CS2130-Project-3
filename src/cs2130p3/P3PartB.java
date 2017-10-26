package cs2130p3;

import cs2130p3.DProb;
import java.text.DecimalFormat;

public class P3PartB {
    private static DecimalFormat df4 = new DecimalFormat(".####");
    private static double Q2CResult = DProb.HyperGeometric(50, 9, 4, 0) * DProb.HyperGeometric(30, 4, 4, 0);
    private static double Q3BResult = DProb.HyperGeometric(71, 5, 10, 1) + DProb.HyperGeometric(71, 5, 10, 0);
    private static double Q4BResults = DProb.Binomial(0.069, 30, 2) + DProb.Binomial(0.069, 30, 1) + DProb.Binomial(0.069, 30, 0);
    private static double Q5BBinomialResult = DProb.Binomial(0.026, 125, 3) + DProb.Binomial(0.026, 125, 2) + DProb.Binomial(0.026, 125, 1) + DProb.Binomial(0.026, 125, 0);

    public static void main(String[] args) {
        System.out.println("CS2130 Project 3 Part B");
        addLine();
        
        /**
         * A department contains 33 employees. 
         * The manager is going to randomly draw 4 employees and give each one a prize.
         */
        System.out.println("Question 1 part a:");
        System.out.println("Permutation of 33 choose 4 = " + DProb.Permutation(33, 4));
        System.out.println("Question 1 part b:");
        System.out.println("Combination of 33 choose 4 = " + DProb.Combination(33, 4));
        addLine();
        
        /**
         * Suppose that the CS Dept at Happy Valley State College has two computer labs. 
         * Lab-A contains 50 PC's and Lab-B contains 30 PC's. 
         * Nine of the Lab-A PC's and 4 of the Lab-B PC's have been infected with spyware. 
         * A sample of PC's will be inspected to check for spyware.
         */
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
        
        /**
         * A munitions warehouse contains 71 bombs, of which 5 are defective. 
         * A sample of 10 bombs will be drawn and tested.
         */
        System.out.println("Question 3 part a:");
        System.out.println("Hypergeometric probability that exactly 2 defective bombs will be chosen = " 
        + df4.format(DProb.HyperGeometric(71, 5, 10, 2)));
        System.out.println("Question 3 part b:");
        System.out.println("Hypergeometric probability that less than 2 defective bombs will be chosen = " 
        + df4.format(Q3BResult));
        addLine();
        
        /**
         * Suppose that the same munitions warehouse contains a very large number of hand grenades, of which 6.9% are defective. 
         * A sample of 30 grenades will be drawn and tested.
         */
        System.out.println("Question 4 part a:");
        System.out.println("Binomial probability that the sample will contain exactly 3 defective grenades = " 
        + df4.format(DProb.Binomial(0.069, 30, 3)));
        System.out.println("Question 4 part b:");
        System.out.println("Binomial probability that the sample will contain less than 3 defective grenades = " 
        + df4.format(Q4BResults));
        addLine();
        
        /**
         * Suppose that the munitions warehouse has just received a large shipment of a new, higher-quality hand grenade. \
         * Suppose that only 2.6% of the grenades in the shipment are defective. 
         * A sample of 125 grenades will be drawn and tested.
         */
        System.out.println("Question 5 part a:");
        System.out.println("Binomial probability that the sample will contain exactly 4 defective grenades = " 
        + df4.format(DProb.Binomial(0.026, 125, 4)));
        System.out.println("Question 5 part b:");
        System.out.println("Binomial probability that the sample will contain less than 4 defective grenades = " 
        + df4.format(Q5BBinomialResult));


        

        
       
    }
    
    public static void addLine() {
        System.out.println("-----------------------");
    }

}
