import java.util.*;
public class M11724 {

		
	
		
		
										
		static int cnt = 0;
		
		

		

		public static void main(String[] args) {

			Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		boolean arr [] []= new boolean[n][n];
		
		
		boolean chk [] = new boolean [n];
		for(int i = 0 ; i < m;i++) {
			int x = scanner.nextInt()-1;
			int y= scanner.nextInt()-1;
			arr[x][y] = true;								
												
		}

		for(int i=0;i<n;i++)
		{



		}

		}
	
	
	static void bfs(boolean[] chk, int x,int y,boolean arr[][]){
			
			
			for( int i = 0 ; i<chk.length;i++)
			if (!chk[x] && arr[x][y] )
			{	chk[x] = true;
				bfs(chk,x,y,arr);
			}	
			}
}
