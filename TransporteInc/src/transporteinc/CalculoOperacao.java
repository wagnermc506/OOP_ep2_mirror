/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transporteinc;

public class CalculoOperacao {
    private double rendimentoReal;
    private double qtdeCombustivelOperacao;
    //PrecoServico preco = new PrecoServico();
    
    public void CalculaRendimentoReal(double km, double rendimento, double perda, double carga){
        this.rendimentoReal = rendimento - (carga * perda);
        this.qtdeCombustivelOperacao = km / this.rendimentoReal;
    }
}
