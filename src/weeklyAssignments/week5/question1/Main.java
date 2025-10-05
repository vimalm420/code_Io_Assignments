package weeklyAssignments.week5.question1;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        BankAccount user1=new BankAccount(1000);
        BankAccount user2=new BankAccount(1000);

        Thread t1=new Thread(user1);
        Thread t2=new Thread(user2);

        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        }
        catch(InterruptedException e){

        }

        user1.getBalance();
        user2.getBalance();
    }
}
