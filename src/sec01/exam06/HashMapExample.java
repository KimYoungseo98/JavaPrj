package sec01.exam06;
import java.util.*;
public class HashMapExample {

	public static void main(String[] args) {
		Map<String, Integer> map=new HashMap<>();
		
		map.put("부승관", 97);
		map.put("최한솔", 98);
		map.put("부승관", 98); //키가 같기 때문에 제일 마지막에 저장한 값으로 대체
		map.put("이 찬", 99);
		System.out.println("총 entry 수: "+map.size());
		
		System.out.println("\t부승관 : "+map.get("부승관")); //키로 값 검색
		System.out.println();
		
		Set<String> keySet=map.keySet(); //key set얻기
		Iterator<String> keyIterator=keySet.iterator(); //반복해서 키를 얻고 값을 map에서 얻어냄
		while(keyIterator.hasNext()) {
			String key=keyIterator.next();
			Integer value=map.get(key);
			System.out.println("\t"+key+" : "+value);
		}
		System.out.println();
		
		map.remove("이 찬"); //키로 map.entry를 제거
		System.out.println("총 entry 수: "+map.size());
		
		Set<Map.Entry<String, Integer>> entrySet=map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator=entrySet.iterator();
		
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry=entryIterator.next();
			String key=entry.getKey();
			Integer value=entry.getValue();
			System.out.println("\t"+key+" : "+value);
		}
		System.out.println();
		
		map.clear();
		System.out.println("총 entry 수: "+map.size());

	}

}
