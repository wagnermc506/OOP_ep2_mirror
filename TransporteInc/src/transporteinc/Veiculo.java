/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transporteinc;

public class Veiculo {
    private static int qtdeVeiculos;
    protected double rendimento;
    protected double perdaRendimento;
    protected double cargaMax;
    protected double velocidadeMedia;
    CalculoOperacao calculo;
    
    public Veiculo() {
        this.calculo = new CalculoOperacao();
        this.calculo.CalculaRendimentoReal(rendimento, perdaRendimento, cargaMax);
    }
    public static void aumentarQtdeVeiculos(int qtdeMais){
        qtdeVeiculos += qtdeMais;
    }
    public static void diminuirQtdeVeiculos(int qtdeMenos){
        qtdeVeiculos -= qtdeMenos;
    }
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
