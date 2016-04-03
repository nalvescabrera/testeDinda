
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;



public class Arquivo {

    public ArrayList<Conta> LerArquivoConta(String ler)  {

        BufferedReader br = null;
        String line = "";
        String espaco = ",";
        ArrayList <Conta> lConta = new ArrayList();
        
        try {
            br = new BufferedReader(new FileReader(ler));
            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] documento = line.split(espaco);
                
                System.out.println("Id" + documento[0]
                        + " saldo" + documento[1]);
                int id_conta = Integer.parseInt(documento[0]);
                double saldo = Double.parseDouble(documento[1]);
                Conta c =new Conta(id_conta, saldo);
                lConta.add(c);
                
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return lConta;

    }
    
    public ArrayList<Transacao> LerArquivoTransacao(String ler){
        
        BufferedReader br = null;
        String line = "";
        String espaco = ",";
        ArrayList <Transacao> lTransacao = new ArrayList();
        
        try {
            br = new BufferedReader(new FileReader(ler));
            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] documento = line.split(espaco);
                
                System.out.println("Id" + documento[0]
                        + " valor" + documento[1]);
                int id_conta = Integer.parseInt(documento[0]);
                double valor = Double.parseDouble(documento[1]);
                Transacao t =new Transacao(id_conta, valor);
                lTransacao.add(t);
                
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return lTransacao;
    }
        
      
    
            
}
        
        
        
        
        
        
        
        
        
    }
    
}
