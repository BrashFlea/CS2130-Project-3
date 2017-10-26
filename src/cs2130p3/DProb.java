package cs2130p3;

import java.lang.Math;

public class DProb {
	
	public static long Permutation(long N, long X) {
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
    
	    return (long) permutation;
	}
	
	public static long Combination(long N, long X) {
        double combination = 1.0;
        
        if( X == 0 || X == N) {
            return (long) combination;
        }
        else if (X > (N-X)) {
           X = (N-X);
        }
        
        for(int i = 0; i < X; i++ ) {
            combination = combination * (N-i) / (i+1);
        }

        return (long) combination;
	}
	
	public static long HyperGeometric(long Np, long Xp, long N, long X) {
	    
	    return 0;
	}
	
	public static long Binomial(double P, long N, long X) {
	    
		return 0;
	}
	
	public static long Poisson(double Xmean, long X) {
	    
		return 0;
	}

} // end class
