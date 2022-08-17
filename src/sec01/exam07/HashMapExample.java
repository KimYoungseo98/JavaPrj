package sec01.exam07;
import java.util.*;
public class HashMapExample {

	public static void main(String[] args) {
		Map<Student, Integer> map=new HashMap<>();
		
		map.put(new Student(1,"최승철"), 95);
		map.put(new Student(1,"최승철"), 95);
		
		System.out.println("총 entry 수: "+map.size());

	}

}
