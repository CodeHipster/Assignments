import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SmithNumberImpl {

	/**
	 * Generates an Set<Integer> of Smith numbers
	 * 
	 * @param upperBound
	 */
	public Set<Integer> generateSmithNumberList(Integer upperBound) {
		Set<Integer> smithNumbers = new HashSet<Integer>();
		for (int i = 11; i < upperBound; i++) {
			if (isSmithNumber(i)) {
				smithNumbers.add(i);
			}
		}

		return smithNumbers;
	}

	/**
	 * Generates a list forming the complete Prime factorization of the number
	 * that is provided as a parameter
	 * 
	 * For example 12 in prime factorization is 2 * 2 * 3. The List to return
	 * would be List(2,2,3).
	 * 
	 * 
	 * @param number
	 */
	public List<Integer> primeFactors(int number) {
		List<Integer> factors = new ArrayList<Integer>();
		/*
		 * Implement your algorithm for generating a list of containing all
		 * Primefactors of a number underneath here
		 */

		return findFactor(factors, number);
	}

	//divide by first prime
	//check modulus
	//if 0
	// check if division == 1 (we done)
	// take remainder and divide by first prime
	//else
	// repeat with next prime
	private List<Integer> findFactor(List<Integer> factors, int number){
		PrimeSupplier primeSupplier = new PrimeSupplier();
		while(number % primeSupplier.next() != 0);
		factors.add(primeSupplier.getCursor());
		if(primeSupplier.getCursor() == number){
			// we done
			return factors;
		}else{
			return findFactor(factors, number / primeSupplier.getCursor());
		}
	}

	/**
	 * Determines if the given number is a smithNumber
	 * 
	 * @param number
	 * @return
	 */
	public boolean isSmithNumber(int number) {

		/*
		 * Complete the algorithm for determining if the given number is a
		 * SmithNumber underneath here. You can use isPrimeNumber and primefactors. 
		 * 
		 */
		//Only composite non prime numbers
		if(number < 10 || isPrimeNumber(number)) return false;

		List<Integer> factors = primeFactors(number);
		int factorMultiplied = 1;
		for(int i = 0; i< factors.size(); i++){
			factorMultiplied *= factors.get(i);
		}

		if(factorMultiplied == number) return true;
		else return false;
	}

	/**
	 * Java method to check if an integer number is prime or not.
	 * 
	 * @return true if number is prime, else false
	 */
	public static  boolean isPrimeNumber(int number) {
		/*
		 * Complete the algorithm for determining if the given number is a Prime
		 * number underneath here.
		 */
		return new PrimeSupplier().isPrime(number);
	}
}
