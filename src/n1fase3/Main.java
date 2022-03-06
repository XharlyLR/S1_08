package n1fase3;

public class Main {

	interface ReverseStr {
		public String reverse(String str);
	}
	
	public static void main(String[] args) {
		
		String string = "hola";
		
		ReverseStr r = str -> {
			String s = str.chars()
					   .mapToObj(c -> String.valueOf((char)c))
					   .reduce((c1, c2)-> c2.concat(c1)).get();
			return s;
		};
		System.out.println(r.reverse(string));
	}

//	private static String revStr(String str) {
//		String s = "";
//		
//		for (int i = str.length() - 1; i >= 0; i--) {
//			s += str.charAt(i);
//		}
//		
//		return s;
//	}

}
