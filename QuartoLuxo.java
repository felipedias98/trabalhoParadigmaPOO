/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paradigma;

/**
 *
 * @author DELL
 */
public class QuartoLuxo extends Quarto {
    public QuartoLuxo(String numeroDoQuarto,String tipo, double precoPorNoite, boolean disponibilidade){
        super(numeroDoQuarto, tipo, precoPorNoite, disponibilidade);
    }
    @Override
    public double calcularPreco(long quantidadeNoites){
        if(quantidadeNoites<0)
        {
            throw new IllegalArgumentException("O número de noites não pode ser negativo.");
        }
        else if(quantidadeNoites>3){
            return this.getPrecoPorNoite() * quantidadeNoites * 0.75; //desconto de 15%
        }
        else{
            return this.getPrecoPorNoite() * quantidadeNoites;
        }
    }
}
