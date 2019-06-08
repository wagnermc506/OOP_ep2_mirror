/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transporteinc;

public class PrecoServico {
    private double precoCombustivelOperacao;
    private double precoCombustivel;
    private double lucro;
    private double total;
    
    PrecoServico(String tipo){
        setPrecoCombustivel(tipo);
    }
    
    public double getCusto(){
        return this.precoCombustivelOperacao;
    }
    
    public double getLucro(){
        return this.lucro;
    }
    
    public double getTotal(){
        return this.total;
    }
    
    private void CalcularPercurso(double qtdeCombustivel){
        this.precoCombustivelOperacao = qtdeCombustivel * precoCombustivel; 
    }
    
    private void CalcularLucro(){
        this.lucro = this.precoCombustivelOperacao * UserInput.getMargem()/100;
    }
    
    private void CalcularTotalServico(){
        this.total = this.lucro + this.precoCombustivelOperacao;
    }
    
    public void CalcularFrete(double qtdeCombustivel){
        this.CalcularPercurso(qtdeCombustivel);
        this.CalcularLucro();
        this.CalcularTotalServico();
    }
    
    private void setPrecoCombustivel(String tipo){
        if(null != tipo)switch (tipo) {
            case "Alcool":
                this.precoCombustivel = Combustivel.ALCOOL;
                break;
            case "Gasolina":
                this.precoCombustivel = Combustivel.GASOLINA;
                break;
            case "Diesel":
                this.precoCombustivel = Combustivel.DIESEL;
                break;
            default:
                break;
        }
    }
}
