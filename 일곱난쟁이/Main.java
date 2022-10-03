import java.util.*;

public class Main {
    static int sum = 0;
    public static void main(String[] args)
    {
        int[] arr = new int[9];
        int i=0,j=0;
        Scanner scanner = new Scanner(System.in);
        for(; i < 9 ; i++){
            arr[i]=scanner.nextInt();
            sum +=arr[i];
        }
        Arrays.sort(arr);
        
        boolean chk = false;
        for( i = 0; i < 9 ; i++){
            for( j=0 ; j < 9 ; j++)
            {
                if( (sum-arr[i]-arr[j]) == 100 ){
                    chk = true;
                    break;
                }
            }
            if(chk)break;
        }
        for(int k = 0; k<9;k++){
            if( k!= i && k != j)
            System.out.println(arr[k]);
        }
    }

   
}
