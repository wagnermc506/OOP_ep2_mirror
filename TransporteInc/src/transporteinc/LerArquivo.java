/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transporteinc;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *
 * @author wagner
 */
public class LerArquivo {
    public DisponibilidadeAndLucro DL;
    private InputStream is;
    private InputStreamReader isr;
    private BufferedReader br;
    
    public LerArquivo() throws FileNotFoundException, IOException {
        this.DL = new DisponibilidadeAndLucro();
        this.is = new FileInputStream("src/transporteinc/DadosSalvos.txt");
        this.isr = new InputStreamReader(this.is);
        this.br = new BufferedReader(this.isr);
        lerLinhas();
    }
    
    private void lerLinhas() throws IOException{
        int count = 0;
        String s;
        do{
            s = br.readLine();
            if(count < 4){
                DL.setQtdeVeiculos(Integer.parseInt(s), count);
                System.out.println(DL.getQtdeVeiculos(count));
            }
            else if(count == 4){
                DL.setLucro(Integer.parseInt(s));
            }
            count++;
        }while(s != null);
    }
    public void fechar() throws IOException{
        br.close();
    }
}
