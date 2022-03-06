package n1fase2;

public class Main {
	
	interface Pi {
		public double getPiValue(Double x);
	}

	public static void main(String[] args) {
		Pi p = (x) -> x;
		System.out.println(p.getPiValue(3.1415d));
	}

}
