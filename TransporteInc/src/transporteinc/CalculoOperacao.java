/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transporteinc;

public class CalculoOperacao {
    private double rendimentoReal;
    private double qtdeCombustivelOperacao;
    private double tempoEstimado;
    private String tipo;
    PrecoServico preco = new PrecoServico(this.tipo);
    
    public void calculaRendimentoReal(double distancia, double rendimento, double perda, double carga){
        this.rendimentoReal = rendimento - (carga * perda);
        this.qtdeCombustivelOperacao = distancia / this.rendimentoReal;
    }
    
    public void calculaVelocidade(double distancia, double velocidade){
        this.tempoEstimado = distancia/velocidade; 
    }
    
    
}

