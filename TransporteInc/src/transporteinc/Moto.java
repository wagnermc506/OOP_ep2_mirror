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
public class Moto extends Veiculo{
    private static int qtdeMotos;
    
    Moto(String TipoDeCombustivel){
        if("Alcool".equals(TipoDeCombustivel)){
            this.rendimento = 43;
            this.perdaRendimento = 0.4;
            this.cargaMax = 50;
            this.velocidadeMedia = 110;
        }
        else if("Gasolina".equals(TipoDeCombustivel)){
            this.rendimento = 50;
            this.perdaRendimento = 0.3;
            this.cargaMax = 50;
            this.velocidadeMedia = 110;
        }
    }
}
