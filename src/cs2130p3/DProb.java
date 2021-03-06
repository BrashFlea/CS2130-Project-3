// Discrete Probability Library
package cs2130p3;

import java.lang.Math;

public class DProb {
	
	public static double Permutation(long N, long X) {
	    double permutation = 0.0;
	    double n = 1.0;
	    double r = 1.0;
	    double nr = N - X;
		
	    for (int i = 0; i < N; i++) {
	        n =  n * (double) (N - i);
	    }
	    
       for (int i = 0; i < nr; i++) {
            r =  r * (double) (nr - i);
        }

	    permutation = Math.round((n/r));
    
	    return permutation;
	}
	
	public static double Combination(long N, long X) {
        double combination = 1.0;
        
        if( X == 0 || X == N) {
            return combination;
        }
        else if (X > (N-X)) {
           X = (N-X);
        }
        
        for(int i = 0; i < X; i++ ) {
            combination = combination * (N-i) / (i+1);
        }

        return combination;
	}
	
	public static double HyperGeometric(long Np, long Xp, long N, long X) {
	    /*Population Size = Np | Successes in population = Xp | Sample size = N | Successes in sample = X */
	    double result = 0.0;
	    double kCx = Combination(Xp,X);
	    double NkCnX = Combination((Np-Xp), (N-X));
	    double NCn = Combination(Np, N);
	    
	    result = (kCx * NkCnX) / NCn;
	    
	    return  result;
	}
	
	public static double Binomial(double P, long N, long X) {
	    /*Probability of success = P | Number of trials = N | Total successes = X */
	    double result = 0.0;
	    double nCr = Combination(N, X);
	    double q = 1 - P;
	    
	    result = nCr * Math.pow(P, X) * Math.pow(q, (N-X));
	    
		return result;
	}
	
	public static double Poisson(double Xmean, long X) {
	    double result = 0.0;
	    double e = 2.71828;
	    double XFact = 1.0;
	    
	    for(int i = 0; i < X; i++) {
	        XFact = XFact * (double) (X - i);
	    }
	    
	    result = Math.pow(Xmean, X) / (XFact * (Math.pow(e, Xmean)));
	    
		return result;
	}
	

} // end class
