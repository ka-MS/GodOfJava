package god33.lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CalculateLamda {

	public static void main(String[] args) {
		// 아래와 같은 람다 식 구성은 인터페이스 형태만 선언가능
		Calculate cal = (a,b) -> a+b;
		
		System.out.println(cal.operation(1, 2));
		
		//predicate 인터페이스 사용
		Predicate<String> aa = (a) -> a.length()>5;
		System.out.println(aa.test("ssssss"));
		
		//default 메소드를 사용 무슨기능인지는 모르겠음..
		System.out.println(aa.or(aa));
		
		int[] ddd = {1,2,3};
		String[] sList = {"g","a","f","d"};
		List<int[]> arr = new ArrayList<>();
		List<String> word = new ArrayList<String>();
		arr = Arrays.asList(ddd);
		word = Arrays.asList(sList);
		System.out.println(word);
//		arr = Arrays.stream(ddd).collect(Collectors.toList());
	}

}
