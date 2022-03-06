package n1fase1;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// 1
		ArrayList<String> noms = new ArrayList<String>();
		noms.add("Andrea");
		noms.add("Ana");
		noms.add("Pep");
		noms.add("Ale");
		noms.add("Ollie");
		
		System.out.println(nomL(noms));
		
		// 2
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(3);
		nums.add(111);
		nums.add(26);
		nums.add(8);
		
		System.out.println(numP(nums));
		
		// 3
		System.out.println(stringO(noms));
		
		// 4
		System.out.println(string5L(noms));
		
		// 5
		ArrayList<String> mesos = new ArrayList<String>();
		mesos.add("Gener");
		mesos.add("Febrer");
		mesos.add("Març");
		mesos.add("Abril");
		mesos.add("Maig");
		mesos.add("Juny");
		mesos.add("Juliol");
		mesos.add("Agost");
		mesos.add("Setembre");
		mesos.add("Octubre");
		mesos.add("Novembre");
		mesos.add("Desembre");
		
		System.out.println();
		mesos.forEach(m -> System.out.println(m));
		
		// 6
		System.out.println();
		mesos.forEach(System.out::println);
	}

	
	// 4
	private static List<String> string5L(ArrayList<String> sL) {
		List<String> sList = new ArrayList<String>();
		
		sList = sL.stream()
			.filter(s -> s.length() > 5)
			.collect(Collectors.toList());
			
		return sList;
	}

	// 3
	private static List<String> stringO(ArrayList<String> oL) {
		List<String> oList = new ArrayList<String>();
		
		oList = oL.stream()
			.filter(o -> o.toLowerCase().contains("o"))
			.collect(Collectors.toList());
			
		return oList;
	}
	
	// 2
	private static String numP(ArrayList<Integer> nums) {
		String stringNum = "";
		
//		for (Integer in : nums) {
//			if(in % 2 == 0) {
//				stringNum += "e" + in;
//			}
//			else {
//				stringNum += "o" + in;
//			}
//			if(!in.equals(nums.get(nums.size() - 1)))
//				stringNum += ", ";
//		}
		
//		stringNum += nums.stream()
//				.filter(in -> in % 2 == 0)
//				.map(in -> "e" + in + ", ")
//				.collect(Collectors.toList());
//		
//		stringNum += nums.stream()
//				.filter(in -> in % 2 != 0)
//				.map(in -> "o" + in + ", ")
//				.collect(Collectors.toList());
		
		ArrayList<String> numsString = new ArrayList<String>();
		
		nums.forEach(in -> {
			String s = "";
			if(in % 2 == 0) {
				numsString.add("e" + in.toString());
			}
			else {
				numsString.add("o" + in.toString());
			}});
		
		stringNum = numsString.stream()
				.reduce((c1, c2)-> c1 + ", " + c2).get();
		
		return stringNum;
	}

	
	// 1
	private static List<String> nomL(ArrayList<String> noms) {
		List<String> nomsList = new ArrayList<String>();
		
//		noms.forEach(s -> {
//			if(s.charAt(0) == 'A' && s.length() == 3) {
//				nomsList.add(s);
//		}});
		
		nomsList = noms.stream()
				.filter(s -> s.charAt(0) == 'A' && s.length() == 3)
				.collect(Collectors.toList());
		
		return nomsList;
	}

}
