package testing;

public class anidado {

	public static void main(String[] args) {
		int temperatura = 17;
		if (temperatura > 15) {
			if (temperatura > 25) {
				System.out.println("la temperatura es de " + temperatura + " grados iremos a la playa");
			} else {
				System.out.println("la temperatura es de " + temperatura + " grados iremos a la montaña");
			}
		} else {
			System.out.println("la temperatura es de " + temperatura + " grados iremos a descansar");
		}

	}

}
