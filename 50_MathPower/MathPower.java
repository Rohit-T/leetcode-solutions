class MathPower{
	//Iterative
	public double myPow(double x, int n) {
        double overflow = 1.0;
        double result;

        if(n == 0) return 1.0;

        if(n < 0){
        	if(n == Integer.MIN_VALUE){
        		n = -n + 1;
        		overflow = 1/x;
        	}
        	n = -n;
        	x = 1/x;
        }

        result = x;
        for(int i = n; i >= 2; i=i/2){
        	if(i % 2 != 0) {
        		overflow = overflow * result;
        		i = i - 1;
        	}
        	result = result * result;
        }

        return result * overflow;
    }

    //Recursive
    public double myPower(double x, int n){
    	if(n == 0) return 1.0;

    	if(n < 0){
    		return (1/x) * myPower(1/x, -(n + 1));
    	}

    	if(n % 2 == 0){
    		return myPower(x * x, n/2);
    	}else {
    		return x * myPower(x * x, (n-1)/2);
    	}
    }
}