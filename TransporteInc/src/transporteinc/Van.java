/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transporteinc;

public class Van extends Veiculo{
    private static int qtdeVan;
    
    Van(){
        this.rendimento = 10;
        this.perdaRendimento = 0.001;
        this.cargaMax = 3500;
        this.velocidadeMedia = 80;
    }
}
