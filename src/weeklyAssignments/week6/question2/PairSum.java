package weeklyAssignments.week6.question2;
import java.util.Scanner;

public class PairSum {

    public static void printPairSum(int array[],int k){
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length;j++){
                if(i!=j){
                    if(k-array[i]==array[j])
                        System.out.print("("+array[i]+", "+array[j]+") ");
                }
            }
        }
    }
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        int k=scanner.nextInt();

        int size=10;
        int array[]=new int[size];
        for(int i=0;i<array.length;i++)
            array[i]=scanner.nextInt();

        printPairSum(array,k);
    }
}
