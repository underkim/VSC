import java.util.*;

// 지민이는 자신의 저택에서 MN개의 단위 정사각형으로 나누어져 있는 M×N 크기의 보드를 찾았다.
//  어떤 정사각형은 검은색으로 칠해져 있고, 나머지는 흰색으로 칠해져 있다.
//  지민이는 이 보드를 잘라서 8×8 크기의 체스판으로 만들려고 한다.

// 체스판은 검은색과 흰색이 번갈아서 칠해져 있어야 한다.
//  구체적으로, 각 칸이 검은색과 흰색 중 하나로 색칠되어 있고, 변을 공유하는 두 개의 사각형은 다른 색으로 칠해져 있어야 한다. 
//  따라서 이 정의를 따르면 체스판을 색칠하는 경우는 두 가지뿐이다. 하나는 맨 왼쪽 위 칸이 흰색인 경우, 하나는 검은색인 경우이다.

// 보드가 체스판처럼 칠해져 있다는 보장이 없어서, 지민이는 8×8 크기의 체스판으로 잘라낸 후에 몇 개의 정사각형을 다시 칠해야겠다고 생각했다. 
// 당연히 8*8 크기는 아무데서나 골라도 된다. 
// 지민이가 다시 칠해야 하는 정사각형의 최소 개수를 구하는 프로그램을 작성하시오.

public class Main {
    
    public static void main(String[] args){
    Scanner s = new Scanner(System.in);

    int n = s.nextInt();
    int m = s.nextInt();
        s.nextLine();
    char[][] str= new char[n][m];
    
    
    
    for(int i = 0 ;  i <n ; i++)
        str[i]=s.nextLine().toCharArray();
    
    int min=chk(str,0,0);
            
    for(int i=0;i+8<=n;i++)
    {
        for(int j =0; j+8<=m;j++)
        {
            
            int tmp = chk(str,i,j);
            if(tmp<min) min = tmp;
        }
    }
    System.out.println(min);
    
}

    static int chk (char[][] str,int i,int j)
    {
        int odd=(i+j)%2;   // 첫번째 배열이 홀수 인지 짝수 인지 체킹 
        
        int B_change=0;
        int W_change=0;
        for(int k = i ; k<i+8;k++)
    {
        for(int h=j;h<j+8;h++)
        {
            if( (k+h)%2 == odd && 'B' != str[k][h]) B_change++;  //B 여야 할때 
            if( (k+h)%2 != odd && 'B' == str[k][h]) B_change++;   //W여야 할때
            if( (k+h)%2 == odd && 'W' != str[k][h]) W_change++;  //W여야할때
            if( (k+h)%2 != odd && 'W' == str[k][h]) W_change++; //B여야할때
             
            
        }
    }
        return (W_change>B_change?B_change:W_change);
    
    }

    
}
