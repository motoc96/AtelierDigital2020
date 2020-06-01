package lab8.bank;

public class BankAccount {
    private int debit;
    private String name;

    public BankAccount(int debit, String name){
        this.debit=debit;
        this.name=name;
    }

    public void Withdraw(int amount){
        longDatabaseCall();
        debit = debit-amount;
    }

    public void Deposit (int amount){
        longDatabaseCall();
        debit = debit + amount;
    }

    private void longDatabaseCall(){
        try{
            Thread.sleep(100);
        } catch(Exception e){
            e.printStackTrace();
        }
    }

    public int getDebit() {
        return debit;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "debit=" + debit +
                ", name='" + name + '\'' +
                '}';
    }
}
