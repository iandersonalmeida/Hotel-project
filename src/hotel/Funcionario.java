/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

/**
 *
 * @author ian
 */
public abstract class Funcionario implements Autenticavel
{
    int senha;
    //protected int [] v = new int[3];
  
   public void setSenha(int senha) {
        this.senha = senha;
    }

    public int getSenha() {
        return senha;
    }
    
    
}

