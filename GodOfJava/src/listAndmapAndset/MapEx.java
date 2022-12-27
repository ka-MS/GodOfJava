package listAndmapAndset;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class MapEx {

	public static void main(String[] args) {
		HashMap<Integer,String> map = new HashMap<Integer,String>(){{//�ʱⰪ ����
		    put(1,"���");
		    put(2,"�ٳ���");
		    put(3,"����");
		}};
		
		//��ü ��� : {1=���, 2=�ٳ���, 3=����}		
		System.out.println(map); 
		//key�� 1�� value��� : ���
		System.out.println(map.get(1));
				
		//entrySet() Ȱ��
		for (Entry<Integer, String> entry : map.entrySet()) {
		    System.out.println("[Key]:" + entry.getKey() + " [Value]:" + entry.getValue());
		}
		
		//KeySet() Ȱ��
		for(Integer i : map.keySet()){ //����� key�� Ȯ��
		    System.out.println("[Key]:" + i + " [Value]:" + map.get(i));
		}
		
		// Iterator ���
		Iterator<Integer> keys = map.keySet().iterator();
		while(keys.hasNext()){
		    int key = keys.next();
		    System.out.println("[Key]:" + key + " [Value]:" +  map.get(key));
		}

	}

}
