import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        String nome; 
        String agencia;
        double saldo;
        int conta;

        System.out.println("Por favor, digite o número da Agência !");
        agencia = sc.nextLine();

        if(agencia.length() == 4 ){

        System.out.println("Digite o seu nome:");
        nome = sc.nextLine();

        System.out.println("Digite o número da conta:");
        conta = sc.nextInt();

        if(String.valueOf(conta).length() == 5){
        System.out.println("Digite o seu saldo:");
        saldo = sc.nextDouble();
        sc.close();    

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é "
        + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque");    
        }else{
            System.out.println("O número da conta deve ser composto por 5 caracteres");
        }
    } else{
        System.out.println("O agência da conta deve ser composto por 4 caracteres");
    }

    }
}
