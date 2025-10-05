package weeklyAssignments.week5.question1;

public class BankAccount implements Runnable{
    private int balance;
    public void run() {
        for(int i=1;i<=5;i++)
            deposit(100);
        for(int i=1;i<=5;i++)
            try {
                withdraw(100);
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
    }
    BankAccount(int balance){
        this.balance=balance;
    }

    private synchronized void deposit(int amount){
        balance+=amount;
    }
    private synchronized void withdraw(int amount) throws Exception {
        if(amount>balance||amount<0)
            throw new InsufficientBalanceException("Insufficient Balance");
        balance-=amount;
    }
    public void getBalance(){
        System.out.println(balance);
    }
}
