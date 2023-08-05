//  A. Flip Flop Sum

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int sum = 0;
            int n = sc.nextInt();
            int [] arr = new int[n];
            for(int i = 0;i<n;i++){
                int x = sc.nextInt();
                arr[i] = x;
                sum+=x;
            }
            int ans = 0;
            Boolean check1 = false, check2 = false;
            for(int i = 0;i<n-1;i++){
                if(arr[i]== -1 && arr[i+1]==-1){
                    ans = sum+4;
                    check1 = true;
                    break;
                }
            }
            for(int i = 0;i<n-1;i++){
                if(arr[i]+arr[i+1] == 0){
                    check2 = true;

                    break;
                }
            }

            if(check1 == true){
                System.out.println(sum+4);
            }
            else if(check2 == true){
                System.out.println(sum);
            }
            else System.out.println(sum-4);

        }
    }
}