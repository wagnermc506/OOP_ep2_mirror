/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transporteinc;


public class CalculoOperacao {
    private double qtdeCombustivelOperacao;
    private double tempoEstimado;
    private boolean entregaNoTempo;
    private boolean suportaCarga;
    private boolean podeSerFeito;
    public PrecoServico preco;
    
    CalculoOperacao(String tipoDeCombustivel){
        preco = new PrecoServico(tipoDeCombustivel);
    }
    
    private void calculaQtdeCombustivel(double distancia, double carga, double rendimento, double perda){
        double rendimentoReal;
        rendimentoReal = rendimento - (carga * perda);
        this.qtdeCombustivelOperacao = distancia / rendimentoReal;
    }
    
    public double getTempoEstimado(){
        return this.tempoEstimado;
    }
    
    private void calculaTempo(double distancia, double velocidade){
        this.tempoEstimado = distancia/velocidade;
    }
    
    private void setEntregaNoTempo(){
        this.entregaNoTempo = this.tempoEstimado <= UserInput.getTempo();
    }
    
    private void setSuportaCarga(double cargaMax){
        suportaCarga = UserInput.getCarga() <= cargaMax;
        //System.out.println(suportaCarga);
    }
    
    public boolean getSuportaCarga(){
        return this.suportaCarga;
    }
    
    public boolean getEntregaNoTempo(){
        return this.entregaNoTempo;
    }
    
    private void setViabilidade(){
        this.podeSerFeito = this.entregaNoTempo && this.suportaCarga;
    }
    
    public void calculaAll(double rendimento, double perda, double velocidade, double cargaMax){
        calculaQtdeCombustivel(UserInput.getDistancia(), UserInput.getCarga(), rendimento, perda);
        calculaTempo(UserInput.getDistancia(), velocidade);
        setEntregaNoTempo();
        setSuportaCarga(cargaMax);
        setViabilidade();
        if(this.podeSerFeito){
            preco.CalcularFrete(qtdeCombustivelOperacao);
        }
    }
}

