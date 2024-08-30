# Dio-projecto-banco-digital

Autor:

- [josue.dosidian](https://github.com/Koder012)
- e-mainl: <josue.dosididan@gmail.com> 

## projecto 

O projecto mostra a estrutura modificada a partir do projecto proposto pela dio. Como parte da extensão do projecto, apenas fiz uma anlise estrutural do projecto adicionando um ATM ao programa.


## Objectivo 
O Objectivo é de modelar algumas funcionalidades de um ATM. Modelando as operações:
- `levantamento(double montante)`
- `consultarSaldo()`
- `transferir(Conta contaDestino, double importancia)`
- `efectuarPagamento(String servico, double preco)`
- `efectuarCompra(String item, double preco)`

A operações citadas acima representam algumas das funcionalidades do projecto final.


## Diagrama de classes



## Diagrama de classes



```mermaid
    classDiagram
    class Banco{
      - nome : char
      - codigo:char
      + adicionarConta() :void;
      + consultarSaldo(Conta conta) : double;
      + transferir(Conta conta, double importancia);
      + adicionarCliente():void;
      + eliminarConta():void;
    }

  class Conta{
      - AGENCIA_PADRAO : int
	    - SEQUENCIAL : int
	    - agencia : int
	    - numero :int
	    - double saldo : double
	    - cliente : Cliente

    + sacar(double valor) void;
    + depositar(double valor) void;
    + transferir(double valor, IConta contaDestino) void;
    + getAgencia() int;
    + getNumero() int;
    + getSaldo() double;
    # void imprimirInfosComuns() void;
  }

  class Cliente {

	  - nome : String
    - contas : List<Conta>
	  + addConta(Conta conta) void

}

class ATM {

    # consultar()void;
    # levantamento(double importancia) void;
    # transferir(Conta contaDestino, double importancia)void;
    # efectuarPagamento(String servico, double montante)void;
    # efectuarCompra(String item, double montante)void;
}

Banco --> Cliente
Banco --> Conta
ATM --> Banco
Cliente --> Conta
```
