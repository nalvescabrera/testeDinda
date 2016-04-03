
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Dgite:");
        String nome = sc.next();
        
        Scanner s = new Scanner(System.in);
        System.out.println("Dgite:");
        String transacao = s.next();
        Arquivo a = new Arquivo ();
        a.LerArquivoConta(nome);
        a.LerArquivoTransacao(nome);
    }
}
