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
public class DisponibilidadeAndLucro {
    private int QuantidadeDeVeiculos[] = {0, 0, 0, 0};
    private int lucropercent;
    
    public void setQtdeVeiculos(int qtde, int n){
        this.QuantidadeDeVeiculos[n] = qtde;
    }
    
    public int getQtdeVeiculos(int n){
        return this.QuantidadeDeVeiculos[n];
    }
    
    public void setLucro(int lucro){
        this.lucropercent = lucro;
    }
    
    public int getLucro(){
        return this.lucropercent;
    }
}
