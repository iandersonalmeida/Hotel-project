/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

/**
 *
 * @author ian
 */
import java.util.ArrayList;
import java.util.Scanner;
public class Hospede 
{
    protected int [] codHospede = new int[3];
    protected String nome;

  
    protected String cpf;
    protected String telefone;   
    int cont;
    ArrayList<Integer> codH = new ArrayList<Integer>();
    ArrayList<String> cpfs = new ArrayList<String>();
    ArrayList<String> nomes = new ArrayList<String>();
    ArrayList<String> telefones = new ArrayList<String>();
    Scanner  input = new Scanner(System.in);
    
    
    
   
    
   
   public void cadastraHospede()
    {
       int x, i = 0;
        System.out.print("NUMBER OF GUESTS TO BE INSERT: ");
        x = input.nextInt();
       
        for(i = 0; i < x; i++)
        {
           
            System.out.print("GUEST CODE: ");
             codHospede[i] = input.nextInt();   
             System.out.print("NAME: ");
             nome = input.next();  
             nomes.add(nome);
             System.out.print("CPF: ");
             cpf = input.next();
             cpfs.add(cpf);
             System.out.print("TELEPHONE: ");
             telefone = input.next();
             telefones.add(telefone);
             cont++;
             System.out.println("\nSUCCESSFULLY REGISTERED GUEST\n");
                  
        }
        
    }

    public void setCodHospede(int[] codHospede) {
        this.codHospede = codHospede;
    }
   
      
    public int[] getCodHospede() 
     {
        return codHospede;
     } 

       
   public void imprimeHospede()
      {
          for(int i = 0; i < cont; i++)
          {             
              String cpf = cpfs.get(i);
              String nome = nomes.get(i);
              String telefone = telefones.get(i);
              System.out.printf("NOME: %s\n",nome);
              System.out.printf("CPF: %s\n",cpf);
              System.out.printf("TELEFONE: %s\n",telefone);
          }

      }
       
     
}
