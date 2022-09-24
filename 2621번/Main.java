
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
        int shape_max=0,shape_min=5,number_max=0,number_min=5; //최소 최대 구하기
        
        for(int i = 0 ; i < 5 ; i++){  // 문양과 숫자 입력 및 개수 분류 와 최소 최대
                shape[i] = scanner.next();
                number[i] = scanner.nextInt();
                cnt[number[i]]++;
                if(number_max<number[i]) number_max = number[i];
                if(number_min>number[i] && number[i]!=0)number_min = number[i];
                switch(shape[i]){
                        case "B":
                                b++;
                                if(0<b && shape_min>b) shape_min = b;
                                if(shape_max < b )shape_max = b;
                                break;
                        
                        case "Y":
                                y++;
                                if(0<y && shape_min>y) shape_min = y;
                                if(shape_max < y )shape_max = y;
                                break;
                        case "R":
                                r++;
                                if(0<r && shape_min>r) shape_min = r;
                                if(shape_max <r )shape_max = r;
                                break;
                        case "G":
                                g++;
                                if(0<g && shape_min>g) shape_min = g;
                                if(shape_max < g )shape_max = g;
                                break;
                }

        }
        
     
        



}
    }