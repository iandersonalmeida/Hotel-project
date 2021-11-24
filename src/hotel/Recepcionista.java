/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

/**
 *
 * @author ian
 */
public class Recepcionista extends Funcionario implements Autenticavel 
{
      
    public boolean autentica(int senha)
    {
        if(this.senha != senha)
        {
             return false;
        }
        return true;
    }
}
