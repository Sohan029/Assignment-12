package Assignment12;

import java.util.Scanner;

public class Prob1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ans=-1;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    ans=i;
                    break;
                }
            }
            if(ans!=-1){
                break;
            }
        }
        if(ans<0){
            System.out.println("-1");
        }
        else{
            System.out.println(ans+1);
        }
    }
}
