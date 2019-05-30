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
    public static Carreta carreta = new Carreta();
    public static Van van = new Van();
    public static Carro carroAlcool = new Carro("Alcool");
    public static Carro carroGasolina = new Carro("Gasolina");
    public static Moto motoAlcool = new Moto("Alcool");
    public static Moto motoGasolina = new Moto("Gasolina");
    
    public static void fazerCalculos(){
        carreta.calcularServico();
        van.calcularServico();
        carroAlcool.calcularServico();
        carroGasolina.calcularServico();
        motoAlcool.calcularServico();
        motoGasolina.calcularServico();
    }
}
