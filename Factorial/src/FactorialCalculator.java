
public class FactorialCalculator {

	public static void main(String[] args) {
		
		int factorial;
		
		for(int i=1; i<=10; i++){
			factorial=0;
			factorial= calculateFactorial(i);
			System.out.println(i+ " faktorialisa: " +factorial);
		}

	}
	
	public static int calculateFactorial(int limit)
	{
		int eredmeny=1;
		for(int i=1; i<= limit; i++){
			
			eredmeny= eredmeny*i;
		}
		
		return eredmeny;
	}

}
