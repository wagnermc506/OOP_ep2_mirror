/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transporteinc;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;


/**
 *
 * @author wagner
 */
public class SalvarArquivo {
    private OutputStream os;
    private OutputStreamWriter osw;
    private BufferedWriter bw;
    
    public SalvarArquivo() throws FileNotFoundException{
        os = new FileOutputStream("src/transporteinc/DadosSalvos.txt", false);
        osw = new OutputStreamWriter(os);
        bw = new BufferedWriter(osw);
    }
    
    public void salvarDados(String carreta, String van, String carro, String moto, String lucro) throws IOException{
        bw.write(carreta);
        bw.newLine();
        bw.write(van);
        bw.newLine();
        bw.write(carro);
        bw.newLine();
        bw.write(moto);
        bw.newLine();
        bw.write(lucro);
    }
    
    public void close() throws IOException{
        bw.close();
    }
    
}
