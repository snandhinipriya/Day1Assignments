package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num = 13;
boolean bPrime = true;


for (int i = 2; i < num; i++) {
	if (num % i == 0) {
		System.out.println("It is not a prime number");
	bPrime = false;
	break;
}
}

	if(bPrime == true) {
		System.out.println("It is a prime number");
		}
		}
}


