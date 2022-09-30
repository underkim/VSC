import java.util.*;
public class M2606 {
    static int dfscount;

		public static void main(String[] args) {

			Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		boolean arr [] []= new boolean[n][n];
		boolean chk [] = new boolean [n];
		
		for(int i = 0 ; i < m;i++) {
			int x = scanner.nextInt()-1;
			int y= scanner.nextInt()-1;
			arr[x][y] = arr[y][x] = true;								
												
		}
		
		int cnt = 0;
		for(int i=0;i<n;i++)
		{ 	
			if(!chk[i]){
			dfs(arr,i,chk);
			cnt++;
		}

		}
		System.out.println(cnt);
    }
		
		
	
	public static void dfs (boolean [][] arr , int x , boolean[] chk)
	{
		chk[x]=true;
		for(int i = 0 ; i < chk.length;i++)
		{
			if(!chk[i]&&arr[x][i])
			{	
				dfs(arr,i,chk);
				
			}
		}
	}
    
}
