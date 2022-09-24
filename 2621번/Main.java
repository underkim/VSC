
/*
        카드 5장이 모두 같은 색이면서 숫자가 연속적일 때, 점수는 가장 높은 숫자에 900을 더한다.
        예를 들어, 카드가 Y4, Y3, Y2, Y5, Y6 일 때 점수는 906(=6+900)점이다.
        
        카드 5장 중 4장의 숫자가 같을 때 점수는 같은 숫자에 800을 더한다.
        예를 들어, 카드가 B3, R3, B7, Y3, G3 일 때 점수는 803(=3+800)점이다.
        
        카드 5장 중 3장의 숫자가 같고 나머지 2장도 숫자가 같을 때 점수는 3장이 같은 숫자에 10을 곱하고
        2장이 같은 숫자를 더한 다음 700을 더한다. 
        예를 들어, 카드가 R5, Y5, G7, B5, Y7 일 때 점수는 757(=5x10+7+700)점이다.
        
        5장의 카드 색깔이 모두 같을 때 점수는 가장 높은 숫자에 600을 더한다.
        예를 들어, 카드가 Y3, Y4, Y8, Y6, Y7 일 때 점수는 608(=8+600)점이다.
        
        카드 5장의 숫자가 연속적일 때 점수는 가장 높은 숫자에 500을 더한다. 
        예를 들어 R7, R8, G9, Y6, B5 일 때 점수는 509(=9+500)점이다.
        
        카드 5장 중 3장의 숫자가 같을 때 점수는 같은 숫자에 400을 더한다. 
        예를 들어 R7, Y7, R2, G7, R5 일 때 점수는 407(=7+400)점이다.
        
        카드 5장 중 2장의 숫자가 같고 또 다른 2장의 숫자가 같을 때 점수는 같은 숫자 중 큰 숫자에 10을 곱하고 
        같은 숫자 중 작은 숫자를 더한 다음 300을 더한다.
        예를 들어, R5, Y5, Y4, G9, B4 일 때 점수는 354(=5X10+4+300)점이다.
        
        카드 5장 중 2장의 숫자가 같을 때 점수는 같은 숫자에 200을 더한다. 
        예를 들어, R5, Y2, B5, B3, G4 일 때 점수는 205(=5+200)점이다.
        
        위의 어떤 경우에도 해당하지 않을 때 점수는 가장 큰 숫자에 100을 더한다.
        예를 들어, R1, R2, B4, B8, Y5 일 때 점수는 108(=8+100)점이다.
 */

import java.util.*;
public class Main {


        
     public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        String [] shape = new String[5]; //문양배열
        int [] number = new int[5];  //숫자배열



        int r=0,g=0,b=0,y=0; //색의 갯수
        int[]cnt = new int[10];
        int shape_max=0,number_max=0,number_min=5; //최소 최대 구하기 (갯수)
        int max_number=0; // 최대 숫자값
        for(int i = 0 ; i < 5 ; i++){  // 문양과 숫자 입력 및 개수 분류 와 최소 최대
                shape[i] = scanner.next();
                number[i] = scanner.nextInt();
                cnt[number[i]]++;
                if(number_max<cnt[number[i]])
                {       
                         max_number = number[i];
                         number_max = cnt[number[i]];
                }
                else if(cnt[number[i]]!=0&&number_max==cnt[number[i]])
                       max_number=(max_number<number[i])?number[i]:max_number;

                
                switch(shape[i]){
                        case "B":
                                b++;
                        
                                if(shape_max < b )shape_max = b;
                                break;
                        
                        case "Y":
                                y++;
                               
                                if(shape_max < y )shape_max = y;
                                break;
                        case "R":
                                r++;
                                
                                if(shape_max <r )shape_max = r;
                                break;
                        case "G":
                                g++;
                               
                                if(shape_max < g )shape_max = g;
                                break;
                }

        }
        boolean isContiue = false;
        
        if(number_min ==1 && number_max ==1)
        for(int i = 1 ; i< 6 ; i++) //연속적인수 인지 확인
        {
                if(cnt[i]==cnt[i+1] && 
                 cnt[i+1]==cnt[i+2] && 
                 cnt[i+2]==cnt[i+3] && 
                 cnt[i+3]==cnt[i+4] &&
                 cnt [i+4]==1
                 )isContiue=true;
                
        }
        boolean twice = false;  
        int ck =0;//두번 검증 도구
        int[] twice_number = new int [2]; // 숫자 저장
        for(int a :cnt){
                if(a==2){
                        twice_number[ck]=cnt[a];
                        ck++;
                        
                        }
        }
        if(ck == 2 ) twice=true; // 2인 숫자가 두개일때 

        int res ;
        // max_number= 가장큰수;
        int same_max=0;
        int same_min=0;
        for(int i = 0 ; i < 5 ; i++){
                if(number_min>cnt[number[i]] && cnt[number[i]]!=0)number_min = cnt[number[i]];
        }
        for(int i =1;i<10;i++)
        {                       //숫자가 같을때 수
                if(number_max==cnt[i]){
                        same_max = i;
                }
                if(number_min==cnt[i]){
                        same_min = i;
                }
               
        }
       
        if(shape_max==5 &&isContiue) //모양이 같고 연속적인 숫자일때 가장 높은 숫자에 900을 더한다.
        {
                res = 900+ max_number ;
        }
        else if (number_max == 4) //숫자가 4개가 같을 때 같은 숫자에 800을 더한다.
        {
                res = 800 + same_max;
        }
        else if(number_max == 3 && number_min==2) // 숫자 3개가 같고 나머지 2개가 같을때 점수는 3장이 같은 숫자에 10을 곱하고
                                                        //2장이 같은 숫자를 더한 다음 700을 더한다. 
        {
                res = same_max*10 +same_min + 700;
        }
        else if(shape_max == 5)//모양이 5개가 같을때 점수는 가장 높은 숫자에 600을 더한다.
        {
                res = max_number + 600;
        }
        else if(isContiue)//숫자가 연속적일때 가장 높은 숫자에 500을 더한다. 
        {
                res = max_number +500;
        }
        else if(number_max == 3)//3장의 숫자가 같을때 점수는 같은 숫자에 400을 더한다. 
        {
               res =  max_number + 400;
        }
        else if(number_max==2) //
        {
                if(twice) // 2장의 숫자가 같고 또 다른 2장의 숫자가 같을 때 점수는 같은 숫자 중 큰 숫자에 10을 곱하고 
                                //같은 숫자 중 작은 숫자를 더한 다음 300을 더한다.
                {
                       res =  twice_number[1]*10 + twice_number[0]+300;
                }
                else//2장의 숫자가 같을 때 점수는 같은 숫자에 200을 더한다.  
                {
                        res = max_number + 200;
                }

        }
        else // 아무것도 아닐 때 가장 큰 숫자에 100을 더한다.
        {       
                res = max_number +100;
        }

        System.out.println(res);

}
    }