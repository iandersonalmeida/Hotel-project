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
public class Quarto 
{
    
    ArrayList<String> codigos = new ArrayList<String>();
    Scanner input = new Scanner(System.in);
    protected int [] codQuarto = new int[3];
    protected double preco[];
    protected int qtd_Pessoas[];
    int cont;
    
    int quarto1 = codQuarto[0];
    int quarto2 = codQuarto[1];
    int quarto3 = codQuarto[2];
    
     public void cadastraQuarto()
    {
        int x;
        int[] cod_Quarto;
        cod_Quarto = new int[10];
        int[] qtd_Pessoas;
        qtd_Pessoas = new int[10];
        int[] qtd_Banheiros;
        qtd_Banheiros = new int[10];
        double[] preco;
        preco = new double[10];
        System.out.print("NUMBER OF BEDROOMS: ");
        x = input.nextInt();
        for(int i = 0; i < x; i++)
        {
          System.out.print("ROOM CODE: ");
          cod_Quarto[i] = input.nextInt();
          this.codQuarto = cod_Quarto;
         // codigos.add(cod_Quarto);
          System.out.print("AMOUNT OF PEOPLE: ");
          qtd_Pessoas[i] = input.nextInt();
          this.qtd_Pessoas = qtd_Pessoas;
          System.out.print("VALUE: ");
          preco[i] = input.nextDouble();
          this.preco = preco;
          cont++;
        }
    }
     
     
     public void verificaDisponibilidade(int[] codHospede)
    {
     

        for(int i = 0; i < cont; i++)
        {  
            quarto1 = codQuarto[0];
            quarto2 = codQuarto[1];
            quarto3 = codQuarto[2];
           // System.out.println(codHospede[i]);
            if(codQuarto[i] == codHospede[i])
            {
                           
               System.out.printf("\nBEDROOM1 %d BUSY: ", quarto1);
               System.out.printf("\nBEDROOM2 %d BUSY: ", quarto2);
               System.out.printf("\nBEDROOM3 %d BUSY: ", quarto3);
               
            }
            else
                System.out.println("NO EMPTY ROOMS");
        }
    }  
     
          
     public void imprimeQuarto()
    {
      
        for(int i = 0; i < cont; i++)
        {
            System.out.printf("ROOM NUMBER: %d\n",codQuarto[i]);
            System.out.printf("NUMBER OF PEOPLE: %d\n",qtd_Pessoas[i]);

        }
    }
    
}
