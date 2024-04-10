package Prog_01;

import java.util.Arrays;
import java.util.Scanner;

import static java.util.Collections.sort;

public class Program_01 {
    public static void main(String [] args) {
       /* Scanner sc = new Scanner(System.in);
        int Arr[][] =new int[4][3];
        System.out.println("Enter element :");
        for(int i=0;i<4;i++){
            for(int k =0;k<3;k++) {

                Arr[i][k] = sc.nextInt();

            }}
        for(int i=0;i<4;i++){

        for(int j = 0;j<3;j++) {
            System.out.print(Arr[i][j]+"\t");
        }
        System.out.println();
        }
    }
}
*/
        int Arr[][] = new int[][]{{2,4,5,45},{3,4,5,2},{33,15,9,8}};
        System.out.println(Arr);
        System.out.println(Arr[0][1]);
        System.out.println(Arr[0]);
        System.out.println(Arrays.toString(Arr[1]));
        Arrays.sort(Arr[2]);
        System.out.println(Arrays.toString(Arr[2]));

        for(int element[] : Arr){
            for(int ele : element){
                System.out.print(ele+"\t");
            }
            System.out.println();
        }
    }}