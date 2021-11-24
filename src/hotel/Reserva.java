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
public class Reserva 
{
    protected int[] cod_Reserva;
    protected String data;
    ArrayList<String> reservas = new ArrayList<String>();
    ArrayList<String> datas = new ArrayList<String>();
    Scanner input = new Scanner(System.in);
    int cont;
    
    
    
     public int cadastraReserva()
    {
        int x;
        int[] cod_Reserva;
        cod_Reserva = new int[10];
        System.out.print("NUMBER OF RESERVATIONS: ");
        x = input.nextInt();
        for(int i = 0; i < x; i++)
        {
        System.out.print("RESERVATION CODE: ");
        cod_Reserva[i] = input.nextInt();
        this.cod_Reserva = cod_Reserva;
        System.out.print("DATE: ");
        data = input.next();
        datas.add(data);
        cont++;
        }
        return cont;
    }
     
       public void verificaReserva(int[] codHospede)
    {

        for(int i = 0; i < cont; i++)
        {
            if(cod_Reserva[i] == codHospede[i])
            
            System.out.println("SUCCESSFUL RESERVATION");            
            else
           System.out.println("RESERVA NÃO REALIZADA");
        }
    }
       
         public void imprimeReserva()
    {
        for(int i = 0; i < cont; i++)
        {
        String data = datas.get(i);
         System.out.printf("\nRESERVATION CODE: %d",cod_Reserva);
         System.out.printf("\nDATE: %s \n",data);
        }
    }

       
}
