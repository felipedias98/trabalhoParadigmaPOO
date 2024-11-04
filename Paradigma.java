/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paradigma;

/**
 *
 * @author DELL
 */
import java.time.LocalDate;
import java.time.Month;
public class Paradigma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LocalDate checkin = LocalDate.of(2023, 1, 1);
        LocalDate checkout = LocalDate.of(2023, 1, 4);
        Cliente c1 = new Cliente("Felipe","11783179430","felps@email.com");
        QuartoSimples q1 = new QuartoSimples("002","simples",20,true);
        Reserva reserva = new Reserva("001",c1,q1,checkin, checkout);
        
        System.out.println("O valor total da estadia foi: "+ reserva.valorEstadia());
    }
    
}
