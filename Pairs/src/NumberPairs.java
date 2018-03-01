
public class NumberPairs {

	public static void main(String[] args) {

		int TwinPrimeNumber = 0;
		
		for(int i=1; i<=100; i++){
			for(int j=1; j<=100; j++){
				if(isPrime(i) && isPrime(j) && (i-2 == j)){
					TwinPrimeNumber++;
			}
		
		}

		public static int isPrime(int number){
			if (number <2) return false;
			if (number == 2) return true;
			if (number % 2 == 0) return false;
			for(int i = 3; i * i <= num; 1+= 2){
				System.out.println(i);
				if(number % i ==0) return false;}
			return true
			}
		}

	}

}
