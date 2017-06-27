package Account;

import java.util.Date;
import javax.swing.JOptionPane;


public class CurrentAccount extends Account{

 private static final double monthlFee = 1.00;
 private double overDraft = 100;

    public CurrentAccount(double balance,int iD,Date date) {
        super(balance, iD, date);
    }
    
    /**
     * @return the monthlFee
     */
    public double getMonthlFee() {
        return monthlFee;
    }

    /**
     * @return the overDraft
     */
    public double getOverDraft() {
        return overDraft;
    }

    /**
     * @param overDraft the overDraft to set
     */
    public void setOverDraft(double overDraft) {
        this.overDraft = overDraft;
    }
    
    public void chargeAccount(){
        super.setBalance(super.getBalance() - getMonthlFee());
    }
    
    @Override
    public void withdraw(double amount) {
        
        if(amount > (super.getBalance()+getOverDraft())){
            JOptionPane.showMessageDialog(null, "You dont have Enough in your Account");
        }
        else
            super.withdraw(amount);
    } 
    
}
