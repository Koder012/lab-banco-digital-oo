package atm;
import banco.conta.*;
import banco.cliente.*;
public interface IATM {
    void consultar(Conta conta);
    void levantar(Conta conta, double valor);
    void imprimirExtratoBancario(Cliente cliente);
    void transferir(Cliente clienteDistinatario, double valor);
    

}
