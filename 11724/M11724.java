import java.util.*;
public class M11724 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		
		boolean arr [] []= new boolean[n][n];
		
		for(int i = 0 ; i < m;i++) {
			int x = scanner.nextInt()-1;
			int y= scanner.nextInt()-1;
			arr[x][y] = true;								//  ex)    	1  		2 	 3 
															//		 1 true	false  false
															//		 2 false true  false
		}													// 		 3 false false true
		
		
		for(int i = 0 ; i < n ; i++) 
		{
			
			for(int j = 0;j <n;	j++) 
			{
		
			System.out.print(arr[i][j]+"  ");
			} 
			System.out.println();
		}
		
		
	/*	
		깊이 우선 탐색을 이용 하여 chk 포인트를 올리면서 chk 포인트가 모두 다올라갔는지 확인 후 
		전역 chk와
		지역 chk  필요 할것으로 예상 
		
		탐색을 하면서 지나간 곳 마다 확인한후 
		구성요소 증가 시킨후 	전역 으로 옮기고 전역이 다 확인되었는지 확인후 확인이 안되었으면 그중 최소 값으로 확인
		만약 지역 체크가 아예 안됐으면 구성요소 그대로 하고 전역에 체크
		
	*/
		}
}
