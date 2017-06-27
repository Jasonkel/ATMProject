package Account;


import java.util.Date;


public abstract class Account implements IBalanceable, IDepositable, IWithdrawable{
    
    private double balance;
    private int ID;
    private Date date;

    public Account(double balance, int ID, Date date) {
        setBalance(balance);
        setID(ID);
        setDate(date);
    }
    
    /**
     * @return the ID
     */
    public int getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    /**
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public void deposit(double amount) {
       this.balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        this.balance -= amount;
    }
    
}
