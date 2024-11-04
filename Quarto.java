/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paradigma;

/**
 *
 * @author DELL
 */
public class Quarto {
    private String numeroDoQuarto;
    private String tipo;
    private double precoPorNoite;
    private boolean disponibilidade;
    
    public Quarto(String numeroDoQuarto, String tipo, double precoPorNoite, boolean disponibilidade) {
        this.numeroDoQuarto = numeroDoQuarto;
        this.tipo = tipo;
        this.precoPorNoite = precoPorNoite;
        this.disponibilidade = disponibilidade;
    }
    public String getNumeroDoQuarto() {
        return numeroDoQuarto;
    }

    

    public void setNumeroDoQuarto(String numeroDoQuarto) {
        this.numeroDoQuarto = numeroDoQuarto;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecoPorNoite() {
        return precoPorNoite;
    }

    public void setPrecoPorNoite(double precoPorNoite) {
        this.precoPorNoite = precoPorNoite;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }
    public double calcularPreco(long quantidadeNoites){
        if(quantidadeNoites<0 || this.disponibilidade == false){
            throw new IllegalArgumentException("O número de noites não pode ser negativo ou o quarto nao está disponível.");
        }
        else{return this.precoPorNoite * quantidadeNoites;}
    }
}
