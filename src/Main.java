import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		int[] origin=new int[n];//원본 배열
		int[] sorted=new int[n];//정렬할 배열
		HashMap<Integer, Integer> rankingMap=new HashMap<Integer,Integer>(); //중복을 없애고 rank
		
		for(int i=0; i<n; i++) {
			sorted[i]=origin[i]=Integer.parseInt(st.nextToken());
		}
		Arrays.sort(sorted);
		
		int rank=0;
		//정렬된 배열을 순회하면서 map에 넣어준다
		for(int v:sorted) {
			if(!rankingMap.containsKey(v)) { //원소가 중복되지 않을때만
				rankingMap.put(v, rank); //키(중복불가), 값
				rank++; //map에 넣고 나면 다음 순위를 가리킬 수 있도록 1을 더해줌
			}
		}
		StringBuilder sb=new StringBuilder();
		for(int key:origin) {
			int ranking=rankingMap.get(key); //원본배열원소(key) 에 대한 value(순위)를 가지고온다
			sb.append(ranking).append(' ');
		}
		System.out.println(sb);
		
	}

}

/*
 * 어려웠던 부분: 
 * 문제 해결: 
 * 
 */
