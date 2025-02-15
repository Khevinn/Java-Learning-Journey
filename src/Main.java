import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		String name = "Maria";
		
		int age = 31;
		double amount = 4000.0;
		double x = 10.35784;
		
		System.out.println(x);
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		Locale.setDefault(Locale.FRANCE);
		System.out.printf("%.4f%n", x);
		System.out.println("RESULT = " + x + " DISTANCE");
		System.out.printf("RESULT = %.2f distance%n", x);
		System.out.printf("%s have %d years and pay $ %.2f dolars%n", name, age, amount);
	}
}
