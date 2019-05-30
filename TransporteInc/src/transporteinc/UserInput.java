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
public class UserInput {
    private static double margemDeLucro;
    private static double distancia;
    private static double tempo;
    private static double carga;
    
    public static void setall(double distancia, double tempo, double carga){
        UserInput.distancia = distancia;
        UserInput.tempo = tempo;
        UserInput.carga = carga;
    }
    
    public static void setMargem(double margem){
        UserInput.margemDeLucro = margem;
    }
    
    public static double getMargem(){
        return UserInput.margemDeLucro;
    }
    
     public static double getDistancia(){
        return UserInput.distancia;
    }
    
    public static double getTempo(){
        return UserInput.tempo;
    }
    
    public static double getCarga(){
        return UserInput.carga;
    }
}
