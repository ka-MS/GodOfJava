package listAndmapAndset;

import java.util.Iterator;
import java.util.HashSet;
import java.util.Set;

public class HashSetEx {

	public static void main(String[] args) {
		
		// 데이터를 중복 저장할 수 없고 순서를 보장하지 않음
		Set<String> set = new HashSet<String>();
		set.add("one"); // 데이터 저장(추가)
		set.add("two");
		set.add("three");
		set.add("one");
		set.add("two");
		set.add("4");
		set.add("5");
		set.add("six");

		System.out.println("저장된 데이터 수 : " + set.size()); 

		// Iterator(반복자) 생성 검색을 위한 반복자
		Iterator<String> it = set.iterator();
		// hasNext() : 데이터가 있으면 true 없으면 false
		while (it.hasNext()) { 
			System.out.println(it.next());
		}

		System.out.println("--------------------");
		// 데이터 제거
		set.remove("three"); 
		// 저장된 데이터 수 출력
		System.out.println("저장된 데이터 수 : " + set.size()); 
		// 반복자 재생성(위의 반복문에서 next 메서드로 데이터를 다 가져왔기 때문에 재생성을 해야함)
		it = set.iterator(); 

		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("--------------------");
	}

}


