/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paradigma;

/**
 *
 * @author DELL
 */
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
public class Reserva {
    private String codigoReserva;
    private Cliente cliente;
    private Quarto quartoReservado;
    private LocalDate dataCheckIn;
    private LocalDate dataCheckOut;
    
    public Reserva(String codigoReserva, Cliente cliente, Quarto quartoReservado, LocalDate dataCheckIn, LocalDate dataCheckOut) {
        this.codigoReserva = codigoReserva;
        this.cliente = cliente;
        this.quartoReservado = quartoReservado;
        this.dataCheckIn = dataCheckIn;
        this.dataCheckOut = dataCheckOut;
    }

    public String getCodigoReserva() {
        return codigoReserva;
    }

    public void setCodigoReserva(String codigoReserva) {
        this.codigoReserva = codigoReserva;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Quarto getQuartoReservado() {
        return quartoReservado;
    }

    public void setQuartoReservado(Quarto quartoReservado) {
        this.quartoReservado = quartoReservado;
    }

    public LocalDate getDataCheckIn() {
        return dataCheckIn;
    }

    public void setDataCheckIn(LocalDate dataCheckIn) {
        this.dataCheckIn = dataCheckIn;
    }

    public LocalDate getDataCheckOut() {
        return dataCheckOut;
    }

    public void setDataCheckOut(LocalDate dataCheckOut) {
        this.dataCheckOut = dataCheckOut;
    }
    public double valorEstadia(){
      
        return quartoReservado.calcularPreco(ChronoUnit.DAYS.between(dataCheckIn, dataCheckOut));
    }
}
