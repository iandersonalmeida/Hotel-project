/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

/**
 *
 * @author ian
 */
import java.util.Scanner;
public class Servico 
{
    protected int[] codServico;
    protected String [] nomeServico;
    protected double [] valorServico;
    int cont;
    double valorTotalServico[];
    
   Scanner input = new Scanner(System.in);
   
   public void cadastraServico()
    {
        int x;
        int []cod_Servico;
        String[] nome_Servico;
        double [] valor_Servico;
        cod_Servico = new int[10];
        nome_Servico = new String[10];
        valor_Servico = new double[10];
        double[] valorTodosServicos;
        valorTodosServicos = new double[20];

        System.out.print("NUMBER OF SERVICES: ");
        x = input.nextInt();
        for(int i = 0; i < x; i++)
        {
        System.out.print("SERVICE CODE: ");
        cod_Servico[i] = input.nextInt();
        this.codServico = cod_Servico;
        System.out.print("SERVICE NAME: ");
        nome_Servico[i] = input.next();
        this.nomeServico = nome_Servico;
        System.out.print("VALUE OF SERVICE: ");
        valor_Servico[i] = input.nextDouble();
        this.valorServico = valor_Servico;
        valorTodosServicos[i] = valorTodosServicos[i] + valor_Servico[i];
        valorTotalServico = valorTodosServicos;
        cont++;
  
        }

    }
   
   public void imprimeServico()
    {
     for(int i = 0; i < cont; i++)
     {
          System.out.printf("SERVICE NAME: %s\n", nomeServico[i]);
          System.out.printf("SERVICE NAME: %s\n", valorServico[i]);
          System.out.printf("TOTAL VALUE OF SERVICES PAYABLE: %.2f\n", valorTotalServico[i]);

     }
    }
}
