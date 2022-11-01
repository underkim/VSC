import java.util.*;
import java.io.*;
public class Main {
    
    static long bi(long start, long end,long arr[],int n)
    {
        int cnt =0; //자른 개수
            if(start>=end)return end;
        long mid = start + (end - start)/2;
        for(int i = 0 ; i < arr.length;i++)
            cnt+=arr[i]/mid;
            
            if(cnt>=n)return bi(mid+1,end,arr,n);  //작은로 나누었을때 
            else return bi(start,mid,arr,n); //큰로 나누었을때
            
        
        }

    public static void main(String [] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s [] = br.readLine().split(" ");

        int k = Integer.parseInt(s[0]);
        int n = Integer.parseInt(s[1]);
        long line[] = new long [k];  //
        long max =0; //이분탐색 시작 끝값
        for(int i = 0; i<k;i++)
        {
            line[i]=Integer.parseInt(br.readLine());
            if(max < line[i])max=line[i];
        }
        
        //이분탐색 하여 길이를 나누어 n개로 만들었을 때 경우의 수 
        long res = bi(0,max+1,line,n);

        bw.write(res-1 + "");
        bw.flush();
    }
    
   
}
