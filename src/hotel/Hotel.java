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
public class Hotel 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        
        Sistema s = new Sistema();
        Recepcionista re = new Recepcionista();
        Hospede h = new Hospede();
        Quarto q = new Quarto();
        Servico se = new Servico();
        Reserva r = new Reserva();
        System.out.print("ENTER PASSWORD FOR LOGIN:\n");
        int senha = in.nextInt();
        re.setSenha(senha);
        re.autentica(senha);
       int acesso =  s.login(re);
        int op = -1;
        while(op != 0)
        {
          
            if(acesso == 0 )
            {             
                break;
            }
            else
            {
                 
               System.out.print("\nENTER 1 TO REGISTER GUEST\n"
                       +"ENTER 2 TO REGISTER RESERVATION\n"
                       +"ENTER 3 TO REGISTER THE ROOM\n"
                       +"ENTER 4 TO REGISTER SERVICES\n"
                       +"ENTER 5 TO LIST GUEST DATA\n"
                       +"ENTER 6 TO CHECK AVAILABLE ROOM\n"
                       +"ENTER 7 TO LIST GUEST ACCOUNT\n"
                       +"ENTER 8 TO EXIT\n");
            
               op = in.nextInt();
                
               switch(op)
               {
                   case 1:  
                       h.cadastraHospede();                      
                       break;                       
                       
                   case 2: 
                       r.cadastraReserva();
                      break;                                           
                       
                   case 3:
                       q.cadastraQuarto();
                       break;
                       
                   case 4:
                        se.cadastraServico();
                       break;                      
                       
                   case 5:
                      System.out.println("GUEST DATA: \n");
                       h.imprimeHospede();
                       q.imprimeQuarto();
                       se.imprimeServico();
                       break;
                      
                   case 6:
                       int[] codH;
                         codH = new int[10];
                         System.out.println("CHECK FULL ROOMS");
                         for(int i = 0; i < h.nomes.size(); i++)
                         {
                             codH[i] = h.codHospede[i];
                             h.setCodHospede(codH);
                             System.out.println("CHECKING...");
                            //System.out.printf("%d\n",codH[i]);
                             q.verificaDisponibilidade(codH);
                         }
                        break;
                       
                   case 7:
                       System.out.println("GUEST ACCOUNT");
                         for(int i = 0; i < h.nomes.size(); i++)
                         {
                             double[] vServicos;
                             vServicos = new double[10];
                             vServicos[i] = se.valorTotalServico[i];
                              double[] vQuarto;
                             vQuarto = new double[10];
                             vQuarto[i] = q.preco[i];

                             String nome = h.nomes.get(i);
                             double [] contaHospede;
                             contaHospede = new double[20];
                             System.out.printf("NAME: %s\n",nome);
                             contaHospede[i] = vQuarto[i]+ vServicos[i];
                             System.out.printf("AMOUNT PAID:%.2f\n", contaHospede[i]);
                        }
                             break;                
                       
                   case 8:
                       op = 0;
                       break;
               }
            }
        }
      
        
    
    }
    
 
    
    
}

