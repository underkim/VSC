import java.util.*;
// 요세푸스 문제는 다음과 같다.

// 1번부터 N번까지 N명의 사람이 원을 이루면서 앉아있고, 양의 정수 K(≤ N)가 주어진다. 
// 이제 순서대로 K번째 사람을 제거한다. 
// 한 사람이 제거되면 남은 사람들로 이루어진 원을 따라 이 과정을 계속해 나간다.
//  이 과정은 N명의 사람이 모두 제거될 때까지 계속된다. 
//  원에서 사람들이 제거되는 순서를 (N, K)-요세푸스 순열이라고 한다. 
//  예를 들어 (7, 3)-요세푸스 순열은 <3, 6, 2, 7, 5, 1, 4>이다.
// N과 K가 주어지면 (N, K)-요세푸스 순열을 구하는 프로그램을 작성하시오.

public class Main {
    
    public static void main(String [] args)
    {
        Scanner s = new Scanner(System.in);

        int n=s.nextInt();
        int k=s.nextInt();

        int index = k-1;
        int cnt = k;
        boolean chk[] = new boolean[n];
        int arr[] = new int [n];
        int i=0;
        while(true)
        {
            if(chk[index])cnt--;  //만약 이미 사용했으면 카운팅 --

            if(cnt == k)   // k만큼 이동했으면 그 위치를 표시후 저장후 카운팅 초기화
            {
                arr[i++] =index+1; // index가 0 시작이니까 1부터로 변경
                chk[index]= true;  // 확인 체크
                cnt = 0;            //카운팅 초기화
                
            }
            if(i==n)break;
            index = (index+1)%n;    //인덱스 1증가
            cnt++;                  //카운팅
            
        }
        System.out.print("<");
        for(i =0;i<n-1;i++)
        {
            System.out.print(arr[i]+", ");
        }
        System.out.print(arr[n-1]+">");
    }
}

// <3, 6, 2, 7, 5, 1, 4>