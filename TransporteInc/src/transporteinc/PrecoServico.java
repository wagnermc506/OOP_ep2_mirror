/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transporteinc;

public class PrecoServico {
    public static double margemDeLucro;
    private double precoCombustivelOperacao;
    private double precoCombustivel;
    private double lucro;
    private double total;
    
    PrecoServico(String tipo){
        setPrecoCombustivel(tipo);
    }
    
    public void CalcularPrecoServico(double qtdeCombustivel){
        this.precoCombustivelOperacao = qtdeCombustivel * precoCombustivel; 
    }
    
    public void CalcularLucro(){
        this.lucro = this.precoCombustivelOperacao * PrecoServico.margemDeLucro/100;
    }
    
    public void CalcularTotalServico(){
        this.total = this.lucro + this.precoCombustivelOperacao;
    }
    
    private void setPrecoCombustivel(String tipo){
        if(null != tipo)switch (tipo) {
            case "alcool":
                this.precoCombustivel = Combustivel.ALCOOL;
                break;
            case "gasolina":
                this.precoCombustivel = Combustivel.GASOLINA;
                break;
            case "diesel":
                this.precoCombustivel = Combustivel.DIESEL;
                break;
            default:
                break;
        }
    }
}
