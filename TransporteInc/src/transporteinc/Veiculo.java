/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transporteinc;

public class Veiculo {
    protected double rendimento;
    protected double perdaRendimento;
    protected double cargaMax;
    protected double velocidadeMedia;
    protected String tipoDeCombustivel;
    protected CalculoOperacao calculo;
    
    /*public Veiculo() {
        this.calculo = new CalculoOperacao(this.tipoDeCombustivel);
    }
    */
    protected void inicializarCalculos(){
        this.calculo = new CalculoOperacao(this.tipoDeCombustivel);
    }
    
    protected void calcularServico(){
        calculo.calculaAll(this.rendimento, this.perdaRendimento, this.velocidadeMedia);
    }
    
    /*public static void aumentarQtdeVeiculos(int qtdeMais){
        qtdeVeiculos += qtdeMais;
    }
    public static void diminuirQtdeVeiculos(int qtdeMenos){
        qtdeVeiculos -= qtdeMenos;
    }
    /*public void setTipoDeCombustivel(String tipo){
        this.tipoDeCombustivel = tipo;
    }*/
    /*public void setRendimento(double rendimento){
        this.rendimento = rendimento;
    }
    public void setCargaMax(double PesoMax){
        this.cargaMax = PesoMax;
    }
    public void setVelocidadeMedia(double velocidadeMedia){
        this.velocidadeMedia = velocidadeMedia;
    }
    public double getRendimento(){
        return rendimento;
    }
    public double getCargaMax(){
        return cargaMax;
    }
    public double getVelocidadeMedia(){
        return velocidadeMedia;
    }
    */
}
