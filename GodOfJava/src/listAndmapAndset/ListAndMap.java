package listAndmapAndset;

import java.util.ArrayList;
import java.util.HashMap;

public final class ListAndMap {

	public static void main(String[] args) {
		// List�� �������� ���� �ߺ������Ͱ���
		// �޸��� ������� �迭 ��ü�� ������
		ArrayList<String> arrayList = new ArrayList<>();

		arrayList.add("0�� ������ �Դϴ�.");
		arrayList.add("1�� ������ �Դϴ�.");
		arrayList.add("2�� ������ �Դϴ�.");
		arrayList.add("3�� ������ �Դϴ�.");
		arrayList.add("4�� ������ �Դϴ�.");
		arrayList.add("5�� ������ �Դϴ�.");

		int index = 0;
		for (String templtem : arrayList) {
			System.out.println((index++) + "�� : " + templtem);
		}
		
		// Map�� key���� value���� �����Ѵ�
		// key���� �Է��ϸ� �ش��ϴ� value���� ȹ�� ���������� ��������ʰ� ������ key���� ����� �� ����
		HashMap<String,String> hashmap = new HashMap<>();
		hashmap.put("Key1", "Ű���� key1�� Value �Դϴ�.");
		hashmap.put("Key2", "Ű���� key2�� Value �Դϴ�.");
		hashmap.put("Key3", "Ű���� key3�� Value �Դϴ�.");
		hashmap.put("Key4", "Ű���� key4�� Value �Դϴ�.");
		hashmap.put("Key5", "Ű���� key5�� Value �Դϴ�.");
		
		System.out.println(hashmap.get("Key1"));
		System.out.println(hashmap.get("Key2"));
		System.out.println(hashmap.get("Key3"));
		System.out.println(hashmap.get("Key4"));
		System.out.println(hashmap.get("Key5"));
		
	}

}
