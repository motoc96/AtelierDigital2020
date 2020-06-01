package lab8.bank;

public class TransactionThread extends Thread{
    private BankAccount from;
    private BankAccount to;
    private int amount;
    private String name;

    public TransactionThread(BankAccount from, BankAccount to, int amount, String name) {
        this.from = from;
        this.to = to;
        this.amount = amount;
        this.name = name;
    }

    @Override
    public void run() {
        transfer();
    }

    private  void transfer(){
        synchronized (from){
            from.Withdraw(amount);
            synchronized (to){
                to.Deposit(amount);
            }
        }
    }
}
