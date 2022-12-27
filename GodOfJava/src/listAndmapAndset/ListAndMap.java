package listAndmapAndset;

import java.util.ArrayList;
import java.util.HashMap;

public final class ListAndMap {

	public static void main(String[] args) {
		// List는 수집순서 있음 중복데이터가능
		// 메모리의 빈공간에 배열 자체를 저장함
		ArrayList<String> arrayList = new ArrayList<>();

		arrayList.add("0번 아이템 입니다.");
		arrayList.add("1번 아이템 입니다.");
		arrayList.add("2번 아이템 입니다.");
		arrayList.add("3번 아이템 입니다.");
		arrayList.add("4번 아이템 입니다.");
		arrayList.add("5번 아이템 입니다.");

		int index = 0;
		for (String templtem : arrayList) {
			System.out.println((index++) + "번 : " + templtem);
		}
		
		// Map은 key값과 value값을 저장한다
		// key값을 입력하면 해당하는 value값을 획득 수집순서를 기억하지않고 동일한 key값을 사용할 수 없음
		HashMap<String,String> hashmap = new HashMap<>();
		hashmap.put("Key1", "키값이 key1인 Value 입니다.");
		hashmap.put("Key2", "키값이 key2인 Value 입니다.");
		hashmap.put("Key3", "키값이 key3인 Value 입니다.");
		hashmap.put("Key4", "키값이 key4인 Value 입니다.");
		hashmap.put("Key5", "키값이 key5인 Value 입니다.");
		
		System.out.println(hashmap.get("Key1"));
		System.out.println(hashmap.get("Key2"));
		System.out.println(hashmap.get("Key3"));
		System.out.println(hashmap.get("Key4"));
		System.out.println(hashmap.get("Key5"));
		
	}

}
