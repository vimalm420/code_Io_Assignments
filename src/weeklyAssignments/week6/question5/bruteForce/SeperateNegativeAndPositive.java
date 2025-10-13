package weeklyAssignments.week6.question5.bruteForce;
import java.util.Scanner;

public class SeperateNegativeAndPositive {

    private static int[] seperateNegative(int arr[]){
        int lastNegativeInteger=-1;
        int temp;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){

                lastNegativeInteger++;
                temp=arr[i];

                for(int j=i;j>lastNegativeInteger;j--)
                    arr[j]=arr[j-1];

                arr[lastNegativeInteger]=temp;
            }
        }
        return arr;
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
