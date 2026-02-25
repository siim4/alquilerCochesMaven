package org.palomafp;

import java.util.Scanner;

import org.palomafp.modelo.AlquilerCochesDAO;
import org.palomafp.modelo.Reserva;

public class App {

    public static void main(String[] args) {

        AlquilerCochesDAO dao = new AlquilerCochesDAO();
        Scanner sc = new Scanner(System.in);
        int opcion;
        String codigo;
        
        do {

            System.out.println("MENUUU");
            System.out.println("0.Salir");
            System.out.println("1.Mostrar una reserva aleatoria");
            System.out.println("2.Mostrar reserva según el código");
            System.out.println("3.Mostrar todas las reservas");
            opcion = sc.nextInt();

            switch (opcion) {
                case 0:
                    System.out.println("Saliendooo");
                    break;
                case 1:

                    System.out.println(dao.getReservaRandom());

                    break;

                case 2:
                    System.out.println("Introduce tu codigo de reserva");
                    codigo = sc.next();
                  
                    System.out.println(dao.getReservabyId(codigo));
                  break;




            case 3: 
        
            for( Reserva r: dao.getAllReserva()){
                System.out.println(r);
                System.out.println();
            }
             break;

                default:
                    System.err.println("Has introducido una opcion que no existe");
                    break;
            }
        } while (opcion != 0);

        sc.close();
    }
}
