/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transporteinc;

public class CalculoOperacao {
    private double qtdeCombustivelOperacao;
    private double tempoEstimado;
    PrecoServico preco;
    
    CalculoOperacao(String tipoDeCombustivel){
        preco = new PrecoServico(tipoDeCombustivel);
    }
    
    private void calculaQtdeCombustivel(double distancia, double carga, double rendimento, double perda){
        double rendimentoReal;
        rendimentoReal = rendimento - (carga * perda);
        this.qtdeCombustivelOperacao = distancia / rendimentoReal;
    }
    
    private void calculaVelocidade(double distancia, double velocidade){
        this.tempoEstimado = distancia/velocidade; 
    }
    
    public void calculaAll(double rendimento, double perda, double velocidade){
        calculaQtdeCombustivel(UserInput.getDistancia(), UserInput.getCarga(), rendimento, perda);
        calculaVelocidade(UserInput.getDistancia(), velocidade);
        preco.CalcularFrete(qtdeCombustivelOperacao);
                
    }
}

