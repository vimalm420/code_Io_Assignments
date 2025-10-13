package weeklyAssignments.week6.question5.bestApproach;

import java.util.Scanner;

public class SeperateNegativesAndPositives{
    public static int[] seperateNegative(int arr[]){

        int result[]=new int[arr.length];
        int LastNegIndex=-1;

        for(int i =0;i<arr.length;i++){
            if(arr[i]<0){
                result[++LastNegIndex]=arr[i];
            }
        }
        for(int i =0;i<arr.length;i++){
            if(arr[i]>=0){
                result[++LastNegIndex]=arr[i];
            }
        }
        return result;

    }

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        int size=10;

        int arr[]=new int[size];

        System.out.print("Enter Array Of Elements Size 10 :");
        for(int i=0;i<arr.length;i++)
            arr[i]=scanner.nextInt();

        arr= seperateNegative(arr);

        for(int i:arr)
            System.out.print(i+" ");
    }
}
