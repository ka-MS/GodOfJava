package god33.lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CalculateLamda {

	public static void main(String[] args) {
		// �Ʒ��� ���� ���� �� ������ �������̽� ���¸� ���𰡴�
		Calculate cal = (a,b) -> a+b;
		
		System.out.println(cal.operation(1, 2));
		
		//predicate �������̽� ���
		Predicate<String> aa = (a) -> a.length()>5;
		System.out.println(aa.test("ssssss"));
		
		//default �޼ҵ带 ��� ������������� �𸣰���..
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
