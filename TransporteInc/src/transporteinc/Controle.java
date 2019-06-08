/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transporteinc;

/**
 *
 * @author wagner
 */
public class Controle {
    public static Carreta carreta = new Carreta();              //case(1)
    public static Van van = new Van();                          //case(2)
    public static Carro carroAlcool = new Carro("Alcool");      //case(3)
    public static Carro carroGasolina = new Carro("Gasolina");  //case(4)
    public static Moto motoAlcool = new Moto("Alcool");         //case(5)
    public static Moto motoGasolina = new Moto("Gasolina");     //case(6)
    private static int count = 0;
    
    public static void fazerCalculos(){
        carreta.calcularServico();
        van.calcularServico();
        carroAlcool.calcularServico();
        carroGasolina.calcularServico();
        motoAlcool.calcularServico();
        motoGasolina.calcularServico();
    }
    
    public static void takeTime(javax.swing.JLabel tempoEstimado){
        switch (count){
        case(0):
            tempoEstimado.setText(String.valueOf(carreta.calculo.getTempoEstimado()));
            count++;
            break;
        case(1):
            tempoEstimado.setText(String.valueOf(van.calculo.getTempoEstimado()));
            count++;
            break;
        case(2):
            tempoEstimado.setText(String.valueOf(carroAlcool.calculo.getTempoEstimado()));
            count++;
            break;
        case(3):
            tempoEstimado.setText(String.valueOf(carroGasolina.calculo.getTempoEstimado()));
            count++;
            break;
        case(4):
            tempoEstimado.setText(String.valueOf(motoAlcool.calculo.getTempoEstimado()));
            count++;
            break;
        case(5):
            tempoEstimado.setText(String.valueOf(motoGasolina.calculo.getTempoEstimado()));
            count = 0;
            break;
        }
    }
    
    public static void verificaTudo(javax.swing.JLabel veiculo, javax.swing.JLabel tempo){
        switch (count){
            case(0):
                if(Controle.carreta.calculo.getSuportaCarga()){
                    veiculo.setText("Sim");
                }
                else{
                    veiculo.setText("Não");
                }
                if(Controle.carreta.calculo.getEntregaNoTempo()){
                    tempo.setText("Sim");
                }
                else{
                    tempo.setText("Não");
                }
                break;
            case(1):
                if(Controle.van.calculo.getSuportaCarga()){
                    veiculo.setText("Sim");
                }
                else{
                    veiculo.setText("Não");
                }
                if(Controle.van.calculo.getEntregaNoTempo()){
                    tempo.setText("Sim");
                }
                else{
                    tempo.setText("Não");
                }
                break;
            case(2):
                if(Controle.carroAlcool.calculo.getSuportaCarga()){
                    veiculo.setText("Sim");
                }
                else{
                    veiculo.setText("Não");
                }
                if(Controle.carroAlcool.calculo.getEntregaNoTempo()){
                    tempo.setText("Sim");
                }
                else{
                    tempo.setText("Não");
                }
                break;
            case(3):
                if(Controle.carroGasolina.calculo.getSuportaCarga()){
                    veiculo.setText("Sim");
                }
                else{
                    veiculo.setText("Não");
                }
                if(Controle.carroGasolina.calculo.getEntregaNoTempo()){
                    tempo.setText("Sim");
                }
                else{
                    tempo.setText("Não");
                }
                break;
            case(4):
                if(Controle.motoAlcool.calculo.getSuportaCarga()){
                    veiculo.setText("Sim");
                }
                else{
                    veiculo.setText("Não");
                }
                if(Controle.motoAlcool.calculo.getEntregaNoTempo()){
                    tempo.setText("Sim");
                }
                else{
                    tempo.setText("Não");
                }
                break;
            case(5):
                if(Controle.motoGasolina.calculo.getSuportaCarga()){
                    veiculo.setText("Sim");
                }
                else{
                    veiculo.setText("Não");
                }
                if(Controle.motoGasolina.calculo.getEntregaNoTempo()){
                    tempo.setText("Sim");
                }
                else{
                    tempo.setText("Não");
                }
                break;
        }
    }
}
