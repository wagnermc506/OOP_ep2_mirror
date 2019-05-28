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
public class Carro extends Veiculo{
    private static int qtdeCarros;
    
    Carro(String TipoDeCombustivel){
        if("Alcool".equals(TipoDeCombustivel)){
            this.rendimento = 12;
            this.perdaRendimento = 0.0231;
            this.cargaMax = 360;
            this.velocidadeMedia = 100;
        }
        else if("Gasolina".equals(TipoDeCombustivel)){
            this.rendimento = 14;
            this.perdaRendimento = 0.025;
            this.cargaMax = 360;
            this.velocidadeMedia = 100;
        }
    }
}
