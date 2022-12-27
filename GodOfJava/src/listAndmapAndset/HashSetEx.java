package listAndmapAndset;

import java.util.Iterator;
import java.util.HashSet;
import java.util.Set;

public class HashSetEx {

	public static void main(String[] args) {
		
		// �����͸� �ߺ� ������ �� ���� ������ �������� ����
		Set<String> set = new HashSet<String>();
		set.add("one"); // ������ ����(�߰�)
		set.add("two");
		set.add("three");
		set.add("one");
		set.add("two");
		set.add("4");
		set.add("5");
		set.add("six");

		System.out.println("����� ������ �� : " + set.size()); 

		// Iterator(�ݺ���) ���� �˻��� ���� �ݺ���
		Iterator<String> it = set.iterator();
		// hasNext() : �����Ͱ� ������ true ������ false
		while (it.hasNext()) { 
			System.out.println(it.next());
		}

		System.out.println("--------------------");
		// ������ ����
		set.remove("three"); 
		// ����� ������ �� ���
		System.out.println("����� ������ �� : " + set.size()); 
		// �ݺ��� �����(���� �ݺ������� next �޼���� �����͸� �� �����Ա� ������ ������� �ؾ���)
		it = set.iterator(); 

		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("--------------------");
	}

}


