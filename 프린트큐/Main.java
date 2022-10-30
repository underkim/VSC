import java.io.*;
import java.util.*;
public class Main {
    public static void main(String [] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine()); //테스트 케이스
       
        for(int i = 0 ; i < n ; i++)
        {   ArrayList<Integer> qu = new ArrayList<>();
            String s[]=br.readLine().split(" "); //갯수와 현재 인덱스
            int index = Integer.parseInt(s[1]); //현재 인덱스의 정수화
            int cnt = 0; //몇번째로 큰수인가
            String s2[] = br.readLine().split(" "); //수들의 목록
            for( int j = 0 ; j<Integer.parseInt(s[0]);j++)           // 큐에 삽입
            {      qu.add(Integer.parseInt(s2[j]));
            }
            
            
            
            
            


            while(true)
            {
                int max = qu.get(index);
                for(int j = 0 ; j< qu.size();j++)
                {
                    if(max < qu.get(j))
                    {
                        max = qu.get(j);
                    }
                }

                while(qu.get(0)!=max)
                {
                    qu.add(qu.remove(0));
                    if(index ==0) index = qu.size()-1;
                    else index--;
                }
                if(index ==0) break;
                qu.remove(0);
                index --;
                cnt++;
                
            }
            

            bw.write(++cnt + "\n");
            bw.flush();
           
        }

    }
}
