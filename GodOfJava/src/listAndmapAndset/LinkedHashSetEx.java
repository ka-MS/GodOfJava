package listAndmapAndset;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetEx {
	public static void main(String[] args) {
		//중복된 데이터를 저장할 수 없고 입력된 순서대로 데이터를 관리함
		Set<String> set = new LinkedHashSet<String>();
		set.add("1");
		set.add("1");
		set.add("two");
		set.add("3");
		set.add("4");
		set.add("five");

		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("--------------------------");

		LinkedHashSet<Integer> lh = new LinkedHashSet<Integer>();
		lh.add(1);
		lh.add(1);
		lh.add(4);
		lh.add(2);
		lh.add(3);
		Iterator<Integer> it2 = lh.iterator();

		while (it2.hasNext()) {
			System.out.println(it2.next());
		}
		
		// linkedhashset을 통한 문자열의 중복 제거 
		String my_string = "people";
		
		String[] answers = my_string.split("");
        Set<String> set2 = new LinkedHashSet<String>(Arrays.asList(answers));
        System.out.println(set2);
	}
}
