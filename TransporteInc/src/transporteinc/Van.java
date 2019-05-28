/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transporteinc;

public class Van extends Veiculo{
    private static int qtdeVan;
    
    Van(){
        this.rendimento = 8;
        this.perdaRendimento = 0.0002;
        this.cargaMax = 30000;
        this.velocidadeMedia = 60;
        this.tipoDeCombustivel = "Diesel";
    }
}
