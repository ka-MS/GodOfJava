package listAndmapAndset;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetEx {
	public static void main(String[] args) {
		//�ߺ��� �����͸� ������ �� ���� �Էµ� ������� �����͸� ������
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
		
		// linkedhashset�� ���� ���ڿ��� �ߺ� ���� 
		String my_string = "people";
		
		String[] answers = my_string.split("");
        Set<String> set2 = new LinkedHashSet<String>(Arrays.asList(answers));
        System.out.println(set2);
	}
}
