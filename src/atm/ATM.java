package atm;


import banco.conta.Conta;

public abstract class ATM {

    protected abstract void consultar();
    protected abstract void levantamento(double importancia);
    protected abstract void transferir(Conta contaDestino, double importancia);
    protected abstract void efectuarPagamento(String servico, double montante);
    protected abstract void efectuarCompra(String item, double montante);
    
}
