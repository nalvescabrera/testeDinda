
public class Transacao  {
    private int id_conta;
    private double valor;

    public Transacao(int id_conta, double valor) {
        this.id_conta = id_conta;
        this.valor = valor;
    }

    public  int getId_conta() {
        return this.id_conta;
    }

    public void setId_conta(int id_conta) {
        this.id_conta = id_conta;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
      public void Debito(Conta c,double valorTransacao){
        if(valorTransacao > c.getSaldo()){
          double multa = c.getSaldo() - 5;
          c.setSaldo(multa);
        }
        double atual=c.getSaldo()- valorTransacao;
        c.setSaldo(atual);
    }
    public void Deposito(Conta c,double valorTransacao){
        double atual=c.getSaldo() + valorTransacao;
        c.setSaldo(atual);
    }   
    public void Verifica(String transacao,Conta c){
        char sinalTransacao = transacao.charAt(0);
        double valorTransacao;
         if(sinalTransacao == '-'){
            valorTransacao = Double.parseDouble(transacao.substring(1));
            Debito(c, valorTransacao);
         } else {
            valorTransacao = Double.parseDouble(transacao);
            Deposito(c, valorTransacao); 
         }
    }
         
         
        
    }
            
            
}
