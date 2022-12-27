package listAndmapAndset;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class MapEx {

	public static void main(String[] args) {
		HashMap<Integer,String> map = new HashMap<Integer,String>(){{//초기값 지정
		    put(1,"사과");
		    put(2,"바나나");
		    put(3,"포도");
		}};
		
		//전체 출력 : {1=사과, 2=바나나, 3=포도}		
		System.out.println(map); 
		//key값 1의 value얻기 : 사과
		System.out.println(map.get(1));
				
		//entrySet() 활용
		for (Entry<Integer, String> entry : map.entrySet()) {
		    System.out.println("[Key]:" + entry.getKey() + " [Value]:" + entry.getValue());
		}
		
		//KeySet() 활용
		for(Integer i : map.keySet()){ //저장된 key값 확인
		    System.out.println("[Key]:" + i + " [Value]:" + map.get(i));
		}
		
		// Iterator 사용
		Iterator<Integer> keys = map.keySet().iterator();
		while(keys.hasNext()){
		    int key = keys.next();
		    System.out.println("[Key]:" + key + " [Value]:" +  map.get(key));
		}

	}

}
