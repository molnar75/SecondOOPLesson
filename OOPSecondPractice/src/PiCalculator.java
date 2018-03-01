
public class PiCalculator {

	public static void main(String[] args) {
		
		//Wallis formula
		double pi=2;
		for(double i=1; i<= 10000; i++){
			
			double left=(2*i)/(2*i-1);
			double right=(2*i)/(2*i+1);
			
			pi = pi*left*right;
		}
		System.out.println("Az eredmeny Wallis formulaval: " + pi);

		//Leibniz formula
		double pisecond = 0;
		double n=1;
		
		for(int i=0; i<= 10000; i++){
				if((i%2)==0){
					pisecond = pisecond+(1/n);
					
				} else{
					
					pisecond = pisecond-(1/n);
				}
				n = n+2;
			
		}
		System.out.println("Az eredmeny Leibniz formulaval: " + pisecond*4);
	}

}
