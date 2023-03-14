package Assignment12;

import java.util.Arrays;
import java.util.Scanner;

public class Prob2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                count++;
            }
        }
        int dup1[] = Arrays.copyOfRange(arr,0,count);
        int dup2[] = Arrays.copyOfRange(arr,count,n);
        for(int i=0;i<count;i++){
            System.out.print(up1[i]+" "+dup2[i]+" ");
        }

        if(dup1.length<dup2.length){
            for(int i=count;i<dup2.length;i++){
                System.out.print(dup2[i]+" ");
            }
            System.out.println();
        }
        else{
            for(int i=count;i< dup1.length;i++){
                System.out.print(dup1[i]+" ");
            }
            System.out.println();
        }
    }
}
