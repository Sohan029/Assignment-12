package Assignment12;

import java.util.Scanner;


public class Prob3 {
    static void create(int arr[],int n){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
    }

    static int minplat(int arr[],int dep[],int n){
        int count=1;
        for(int i=1;i<n;i++){
            int flag1=0;int flag2=0;
            for(int j=0;j<i;j++){
                if(dep[j]<=arr[i]){
                    flag1++;
                }
                else{
                    flag2++;
                }
            }
            if(flag2>=flag1){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];
        int dep[] = new int[n];
        create(arr,n);
        create(dep,n);
        System.out.println(minplat(arr,dep,n));

    }
}
