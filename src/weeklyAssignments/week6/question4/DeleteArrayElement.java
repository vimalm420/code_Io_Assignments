package weeklyAssignments.week6.question4;
import java.util.Scanner;

public class DeleteArrayElement {

    public static int[] deleteAtPos(int arr[], int position){
        for(int i=position;i<arr.length;i++)
            arr[i-1]=arr[i];
        int temp[]=new int[arr.length-1];
        for(int i=0;i<arr.length-1;i++)
            temp[i]=arr[i];
        return temp;
    }

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        int size=10;

        int arr[]=new int[size];

        System.out.print("Enter Elements Of An Array Of size 10 :");
        for(int i=0;i<arr.length;i++)
            arr[i]=scanner.nextInt();

        System.out.print("Enter Position To Delete :");
        int position= scanner.nextInt();

        arr=deleteAtPos(arr,position);
        for(int i:arr)
            System.out.print(i+" ");
    }
}
