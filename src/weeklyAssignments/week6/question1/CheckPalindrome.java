package weeklyAssignments.week6.question1;
import java.util.Scanner;

public class CheckPalindrome {
    static final int SIZE=5;

    public static boolean isPalindrome(int array[]){
        int l=0;
        int r=array.length-1;
        while(l<r){
            if(array[l]==array[r]){
                l++;
                r--;
            }
            else
                return false;
        }
        return true;
    }
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        int arr[]=new int[SIZE];
        for(int i=0;i<arr.length;i++)
            arr[i]=scanner.nextInt();

        System.out.println( isPalindrome(arr));
    }
}
