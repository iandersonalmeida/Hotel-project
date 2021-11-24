/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

/**
 *
 * @author ian
 */

public class Sistema 
{


    public int login(Autenticavel f)
    {
        int senha = 7;
        boolean correta = f.autentica(senha);

    if(correta)
    {
        System.out.println("LOGIN DONE");
        return 1;
    }
    else
        System.out.println("INCORRECT PASSWORD!");
        return 0;
    }
    
    
    
    
}

