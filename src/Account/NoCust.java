/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Account;

/**
 *
 * @author Jason
 */
public class NoCust extends Exception{

    public NoCust(int custNum) {
        super("This Customer is not in the database ID: "+custNum);
    }
    
    
    
}
