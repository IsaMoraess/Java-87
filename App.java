/*Desenvolva um programa em Java chamado CaixaEletronico que simule a retirada de dinheiro
de uma conta bancária. O programa deve inicializar o saldo da conta como R$ 25,00
e o valor solicitado como R$ 17,00. 
Em seguida, o programa deve verificar se o valor solicitado 
é menor que o saldo disponível na conta. Caso seja, o programa deve subtrair o
valor solicitado do saldo e imprimir o novo saldo. Caso contrário, 
deve imprimir uma mensagem informando que não há saldo suficiente na conta.*/
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Seu Saldo é de R$25,00");
        double saldo = 25.0;

        System.out.println("O valor solicitado é de R$17,00");
        double valorSolicitado = 17.0;

        //controle de fluxo simples
        if(valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;
            System.out.println("Seu novo saldo é de R$" + saldo);
        } else {
            System.out.println("Saldo insuficiente. Não é possível realizar a operação.");
        }
    }
}
