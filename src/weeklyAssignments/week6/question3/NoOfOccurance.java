package weeklyAssignments.week6.question3;
import java.util.Scanner;

public class NoOfOccurance {

    public static int countOccurance(int arr[],int k){
        int count=0;
        for(int i:arr)
            if(i==k)
                count++;
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int size=10;

        int k=scanner.nextInt();

        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++)
            arr[i]= scanner.nextInt();

        System.out.println(countOccurance(arr,k));
    }
}
