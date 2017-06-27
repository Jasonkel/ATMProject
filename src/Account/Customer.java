

package Account;


public class Customer {
    
    private int custID;
    private String name;
    private String address;
    private String phone;
    
    CurrentAccount currentA;
    DepositAccount depositA;
    boolean current = false;
    boolean deposit = false;

    public Customer(int custID, CurrentAccount currentA, DepositAccount DepositA, String name, String address, String phone) {
        this.custID = custID;
        this.currentA = currentA;
        this.depositA = DepositA;
        this.name = name;
        this.address = address;
        this.phone = phone;
        current = true;
        deposit = true;
    }


    public Customer(int custID, CurrentAccount currentA, String name, String address, String phone) {
        this.custID = custID;
        this.currentA = currentA;
        this.name = name;
        this.address = address;
        this.phone = phone;
        current = true;
        
    }

    public Customer(int custID, DepositAccount DepositA, String name, String address, String phone) {
        this.custID = custID;
        this.depositA = DepositA;
        this.name = name;
        this.address = address;
        this.phone = phone;
        deposit = true;
    }

    /**
     * @return the custID
     */
    public int getCustID() {
        return custID;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    
    
    
    
    
}
