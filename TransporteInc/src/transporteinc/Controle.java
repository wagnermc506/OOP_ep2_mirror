/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transporteinc;

import java.awt.Color;
import java.text.DecimalFormat;

/**
 *
 * @author wagner
 */
public class Controle {
    public static Carreta carreta = new Carreta();              //case(0)
    public static Van van = new Van();                          //case(1)
    public static Carro carroAlcool = new Carro("Alcool");      //case(2)
    public static Carro carroGasolina = new Carro("Gasolina");  //case(3)
    public static Moto motoAlcool = new Moto("Alcool");         //case(4)
    public static Moto motoGasolina = new Moto("Gasolina");     //case(5)
    private static int count = 0;
    private static final DecimalFormat df = new DecimalFormat("0.00");
    
    public static void fazerCalculos(){
        carreta.calcularServico();
        van.calcularServico();
        carroAlcool.calcularServico();
        carroGasolina.calcularServico();
        motoAlcool.calcularServico();
        motoGasolina.calcularServico();
    }
    
    private static double setMenorCusto(int i, Veiculo a, double menor){
        if(i == 0){
            return a.calculo.preco.getCusto();
        }
        return menor;
    }
    
    private static double setMenorTempo(int i, Veiculo a, double menor){
        if(i == 0){
            return a.calculo.getTempoEstimado();
        }
        return menor;
    }
    
    private static double setMelhorCB(int i, Veiculo a, double menor){
        if(i == 0){
            return a.calculo.getCustoBeneficio();
        }
        return menor;
    }
    
    public static String getMenorCusto(){
        double list[] = {0, 0, 0, 0, 0, 0};
        String listS[] = {"", "", "", "", "", ""};
        int i = 0;
        double menor = -1;
        if(carreta.calculo.isViavel()){
            list[i] = carreta.calculo.preco.getCusto();
            menor = setMenorCusto(i, carreta, menor);
            listS[i] = "Carreta";
            i++;
        }
        if(van.calculo.isViavel()){
            list[i] = van.calculo.preco.getCusto();
            menor = setMenorCusto(i, van, menor);
            listS[i] = "Van";
            i++;
        }
        if(carroAlcool.calculo.isViavel()){
            list[i] = carroAlcool.calculo.preco.getCusto();
            menor = setMenorCusto(i, carroAlcool, menor);
            listS[i] = "CarroAlcool";
            i++;
        }
        if(carroGasolina.calculo.isViavel()){
            list[i] = carroGasolina.calculo.preco.getCusto();
            menor = setMenorCusto(i, carroGasolina, menor);
            listS[i] = "CarroGasolina";
            i++;
        }
        if(motoAlcool.calculo.isViavel()){
            list[i] = motoAlcool.calculo.preco.getCusto();
            menor = setMenorCusto(i, motoAlcool, menor);
            listS[i] = "MotoAlcool";
            i++;
        }
        if(motoGasolina.calculo.isViavel()){
            list[i] = motoGasolina.calculo.preco.getCusto();
            menor = setMenorCusto(i, motoGasolina, menor);
            listS[i] = "MotoGasolina";
            i++;
        }
        
        int n = 0;
        if (menor == -1){
            return "Nenhum";
        }
        else{
            for(int j = 0; j < i; j++){
                if(menor > list[j]){
                    menor = list[j];
                    n = j;
                }
            }
        }
        String Veiculo = listS[n];
        switch(Veiculo){
            case("Carreta"):
                return "Carreta";
            case("Van"):
                return "Van";
            case("CarroAlcool"):
                return "Carro(Alcool)";
            case("CarroGasolina"):
                return "Carro(Gasolina)";
            case("MotoAlcool"):
                return "Moto(Alcool)";
            case("MotoGasolina"):
                return "Moto(Gasolina)";
        }
        return null;
    }
    
    public static String getMenorTempo(){
        double list[] = {0, 0, 0, 0, 0, 0};
        String listS[] = {"", "", "", "", "", ""};
        int i = 0;
        double menor = -1;
        if(carreta.calculo.isViavel()){
            list[i] = carreta.calculo.getTempoEstimado();
            menor = setMenorTempo(i, carreta, menor);
            listS[i] = "Carreta";
            i++;
        }
        if(van.calculo.isViavel()){
            list[i] = van.calculo.getTempoEstimado();
            menor = setMenorTempo(i, van, menor);
            listS[i] = "Van";
            i++;
        }
        if(carroAlcool.calculo.isViavel()){
            list[i] = carroAlcool.calculo.getTempoEstimado();
            menor = setMenorTempo(i, carroAlcool, menor);
            listS[i] = "CarroAlcool";
            i++;
        }
        if(carroGasolina.calculo.isViavel()){
            list[i] = carroGasolina.calculo.getTempoEstimado();
            menor = setMenorTempo(i, carroGasolina, menor);
            listS[i] = "CarroGasolina";
            i++;
        }
        if(motoAlcool.calculo.isViavel()){
            list[i] = motoAlcool.calculo.getTempoEstimado();
            menor = setMenorTempo(i, motoAlcool, menor);
            listS[i] = "MotoAlcool";
            i++;
        }
        if(motoGasolina.calculo.isViavel()){
            list[i] = motoGasolina.calculo.getTempoEstimado();
            menor = setMenorTempo(i, motoGasolina, menor);
            listS[i] = "MotoGasolina";
            i++;
        }
        
        int n = 0;
        if (menor == -1){
            return "Nenhum";
        }
        else{
            for(int j = 0; j < i; j++){
                if(menor > list[j]){
                    menor = list[j];
                    n = j;
                }
            }
        }
        String Veiculo = listS[n];
        switch(Veiculo){
            case("Carreta"):
                return "Carreta";
            case("Van"):
                return "Van";
            case("CarroAlcool"):
                return "Carro(Alcool)";
            case("CarroGasolina"):
                return "Carro(Gasolina)";
            case("MotoAlcool"):
                return "Moto(Alcool)";
            case("MotoGasolina"):
                return "Moto(Gasolina)";
        }
        return null;
    }
    
    public static String getMelhorCB(){
        double list[] = {0, 0, 0, 0, 0, 0};
        String listS[] = {"", "", "", "", "", ""};
        int i = 0;
        double menor = -1;
        if(carreta.calculo.isViavel()){
            list[i] = carreta.calculo.getCustoBeneficio();
            menor = setMelhorCB(i, carreta, menor);
            listS[i] = "Carreta";
            i++;
        }
        if(van.calculo.isViavel()){
            list[i] = van.calculo.getCustoBeneficio();
            menor = setMelhorCB(i, van, menor);
            listS[i] = "Van";
            i++;
        }
        if(carroAlcool.calculo.isViavel()){
            list[i] = carroAlcool.calculo.getCustoBeneficio();
            menor = setMelhorCB(i, carroAlcool, menor);
            listS[i] = "CarroAlcool";
            i++;
        }
        if(carroGasolina.calculo.isViavel()){
            list[i] = carroGasolina.calculo.getCustoBeneficio();
            menor = setMelhorCB(i, carroGasolina, menor);
            listS[i] = "CarroGasolina";
            i++;
        }
        if(motoAlcool.calculo.isViavel()){
            list[i] = motoAlcool.calculo.getCustoBeneficio();
            menor = setMelhorCB(i, motoAlcool, menor);
            listS[i] = "MotoAlcool";
            i++;
        }
        if(motoGasolina.calculo.isViavel()){
            list[i] = motoGasolina.calculo.getCustoBeneficio();
            menor = setMelhorCB(i, motoGasolina, menor);
            listS[i] = "MotoGasolina";
            i++;
        }
        
        int n = 0;
        if (menor == -1){
            return "Nenhum";
        }
        else{
            for(int j = 0; j < i; j++){
                if(menor > list[j]){
                    menor = list[j];
                    n = j;
                }
            }
        }
        String Veiculo = listS[n];
        switch(Veiculo){
            case("Carreta"):
                return "Carreta";
            case("Van"):
                return "Van";
            case("CarroAlcool"):
                return "Carro(Alcool)";
            case("CarroGasolina"):
                return "Carro(Gasolina)";
            case("MotoAlcool"):
                return "Moto(Alcool)";
            case("MotoGasolina"):
                return "Moto(Gasolina)";
        }
        return null;
    }
  
    public static void exibePreco(javax.swing.JLabel custo, javax.swing.JLabel lucro, javax.swing.JLabel preco){
        switch(count){
        case(0):
            custo.setText(String.valueOf(df.format(carreta.calculo.preco.getCusto())));
            lucro.setText(String.valueOf(df.format(carreta.calculo.preco.getLucro())));
            preco.setText(String.valueOf(df.format(carreta.calculo.preco.getTotal())));
            count++;
            break;
        case(1):
            custo.setText(String.valueOf(df.format(van.calculo.preco.getCusto())));
            lucro.setText(String.valueOf(df.format(van.calculo.preco.getLucro())));
            preco.setText(String.valueOf(df.format(van.calculo.preco.getTotal())));
            count++;
            break;
        case(2):
            custo.setText(String.valueOf(df.format(carroAlcool.calculo.preco.getCusto())));
            lucro.setText(String.valueOf(df.format(carroAlcool.calculo.preco.getLucro())));
            preco.setText(String.valueOf(df.format(carroAlcool.calculo.preco.getTotal())));
            count++;
            break;
        case(3):
            custo.setText(String.valueOf(df.format(carroGasolina.calculo.preco.getCusto())));
            lucro.setText(String.valueOf(df.format(carroGasolina.calculo.preco.getLucro())));
            preco.setText(String.valueOf(df.format(carroGasolina.calculo.preco.getTotal())));
            count++;
            break;
        case(4):
            custo.setText(String.valueOf(df.format(motoAlcool.calculo.preco.getCusto())));
            lucro.setText(String.valueOf(df.format(motoAlcool.calculo.preco.getLucro())));
            preco.setText(String.valueOf(df.format(motoAlcool.calculo.preco.getTotal())));
            count++;
            break;
        case(5):
            custo.setText(String.valueOf(df.format(motoGasolina.calculo.preco.getCusto())));
            lucro.setText(String.valueOf(df.format(motoGasolina.calculo.preco.getLucro())));
            preco.setText(String.valueOf(df.format(motoGasolina.calculo.preco.getTotal())));
            count = 0;
            break;
        }
    }
    
    public static void takeTime(javax.swing.JLabel tempoEstimado){
        switch (count){
        case(0):
            tempoEstimado.setText(String.valueOf(df.format(carreta.calculo.getTempoEstimado())));
            break;
        case(1):
            tempoEstimado.setText(String.valueOf(df.format(van.calculo.getTempoEstimado())));
            break;
        case(2):
            tempoEstimado.setText(String.valueOf(df.format(carroAlcool.calculo.getTempoEstimado())));
            break;
        case(3):
            tempoEstimado.setText(String.valueOf(df.format(carroGasolina.calculo.getTempoEstimado())));
            break;
        case(4):
            tempoEstimado.setText(String.valueOf(df.format(motoAlcool.calculo.getTempoEstimado())));
            break;
        case(5):
            tempoEstimado.setText(String.valueOf(df.format(motoGasolina.calculo.getTempoEstimado())));
            break;
        }
    }
    
    public static void verificaTudo(javax.swing.JLabel veiculo, javax.swing.JLabel tempo, javax.swing.JButton button){
        switch (count){
            case(0):
                if(Controle.carreta.calculo.getSuportaCarga()){
                    veiculo.setText("Sim");
                    veiculo.setForeground(Color.decode("#004208"));
                }
                else{
                    veiculo.setText("Não");
                    veiculo.setForeground(Color.decode("#E00021"));
                }
                if(Controle.carreta.calculo.getEntregaNoTempo()){
                    tempo.setText("Sim");
                    tempo.setForeground(Color.decode("#004208"));
                }
                else{
                    tempo.setText("Não");
                    tempo.setForeground(Color.decode("#E00021"));
                }
                if(Controle.carreta.calculo.isViavel()){
                    button.setEnabled(true);
                }
                else{
                    button.setEnabled(false);
                }
                break;
            case(1):
                if(Controle.van.calculo.getSuportaCarga()){
                    veiculo.setText("Sim");
                    veiculo.setForeground(Color.decode("#004208"));
                }
                else{
                    veiculo.setText("Não");
                    veiculo.setForeground(Color.decode("#E00021"));
                }
                if(Controle.van.calculo.getEntregaNoTempo()){
                    tempo.setText("Sim");
                    tempo.setForeground(Color.decode("#004208"));
                }
                else{
                    tempo.setText("Não");
                    tempo.setForeground(Color.decode("#E00021"));
                }
                if(Controle.van.calculo.isViavel()){
                    button.setEnabled(true);
                }
                else{
                    button.setEnabled(false);
                }
                break;
            case(2):
                if(Controle.carroAlcool.calculo.getSuportaCarga()){
                    veiculo.setText("Sim");
                    veiculo.setForeground(Color.decode("#004208"));
                }
                else{
                    veiculo.setText("Não");
                    veiculo.setForeground(Color.decode("#E00021"));
                }
                if(Controle.carroAlcool.calculo.getEntregaNoTempo()){
                    tempo.setText("Sim");
                    tempo.setForeground(Color.decode("#004208"));
                }
                else{
                    tempo.setText("Não");
                    tempo.setForeground(Color.decode("#E00021"));
                }
                if(Controle.carroAlcool.calculo.isViavel()){
                    button.setEnabled(true);
                }
                else{
                    button.setEnabled(false);
                }
                break;
            case(3):
                if(Controle.carroGasolina.calculo.getSuportaCarga()){
                    veiculo.setText("Sim");
                    veiculo.setForeground(Color.decode("#004208"));
                }
                else{
                    veiculo.setText("Não");
                    veiculo.setForeground(Color.decode("#E00021"));
                }
                if(Controle.carroGasolina.calculo.getEntregaNoTempo()){
                    tempo.setText("Sim");
                    tempo.setForeground(Color.decode("#004208"));
                }
                else{
                    tempo.setText("Não");
                    tempo.setForeground(Color.decode("#E00021"));
                }
                if(Controle.carroGasolina.calculo.isViavel()){
                    button.setEnabled(true);
                }
                else{
                    button.setEnabled(false);
                }
                break;
            case(4):
                if(Controle.motoAlcool.calculo.getSuportaCarga()){
                    veiculo.setText("Sim");
                    veiculo.setForeground(Color.decode("#004208"));
                }
                else{
                    veiculo.setText("Não");
                    veiculo.setForeground(Color.decode("#E00021"));
                }
                if(Controle.motoAlcool.calculo.getEntregaNoTempo()){
                    tempo.setText("Sim");
                    tempo.setForeground(Color.decode("#004208"));
                }
                else{
                    tempo.setText("Não");
                    tempo.setForeground(Color.decode("#E00021"));
                }
                if(Controle.motoAlcool.calculo.isViavel()){
                    button.setEnabled(true);
                }
                else{
                    button.setEnabled(false);
                }
                break;
            case(5):
                if(Controle.motoGasolina.calculo.getSuportaCarga()){
                    veiculo.setText("Sim");
                    veiculo.setForeground(Color.decode("#004208"));
                }
                else{
                    veiculo.setText("Não");
                    veiculo.setForeground(Color.decode("#E00021"));
                }
                if(Controle.motoGasolina.calculo.getEntregaNoTempo()){
                    tempo.setText("Sim");
                    tempo.setForeground(Color.decode("#004208"));
                }
                else{
                    tempo.setText("Não");
                    tempo.setForeground(Color.decode("#E00021"));
                }
                if(Controle.motoGasolina.calculo.isViavel()){
                    button.setEnabled(true);
                }
                else{
                    button.setEnabled(false);
                }
                break;
        }
    }
}
