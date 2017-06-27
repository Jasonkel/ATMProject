package Account;

import java.util.Date;
import javax.swing.JOptionPane;


public class DepositAccount extends Account{
    
    private static final double annualInterestRate = 1.2; 
    
    public DepositAccount(double balance,int iD,Date date) {
        super(balance, iD, date);
    }
    
    public double getannualInterestPayment(){
        return (super.getBalance()/100)*annualInterestRate;  
    }
    
    public double calculatedAnnualInterestPayment(){
        return super.getBalance()+getannualInterestPayment();
    }
    
    public void chargeAccount(){
        super.setBalance(super.getBalance() - getannualInterestPayment());
    }
    
    @Override
    public void withdraw(double amount) {
        
        if(amount > super.getBalance()){
            JOptionPane.showMessageDialog(null, "You dont have Enough in your Account");
        }
        else
            super.withdraw(amount);
    } 
    
}
