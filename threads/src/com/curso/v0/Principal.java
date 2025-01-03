package com.curso.v0;

class Calculadora{
	
	public void run() {
		long current = 1L;
		long max = 20000L;
		long numPrimes = 0L;

		System.out.printf("Thread '%s': START\n", Thread.currentThread().getName());
		while (current <= max) {
			if (isPrime(current)) {
				System.out.println("Numero Primo: "+current);
				numPrimes++;
			}
			current++;
		}
		System.out.printf("Thread '%s': END. Number of Primes: %d\n", Thread.currentThread().getName(), numPrimes);
	}
	
	private boolean isPrime(long number) {
		if (number <= 2) {
			return true;
		}
		for (long i = 2; i < number; i++) {
			if ((number % i) == 0) {
				return false;
			}
		}
		return true;
	}
}

public class Principal {

	public static void main(String[] args) {
		System.out.println("INICIO DE PROGRAMA");
		Calculadora calc = new Calculadora();
		calc.run();
		System.out.println("FIN DE PROGRAMA");

	}

}
