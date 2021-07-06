package prova;
import java.util.*;
public class programaProvaConta {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		int  opcoes;
		int valor = 0;
		
		
		contaClassProva conta01 = new contaClassProva("Julia Da Costa Santos","1566","03/07/21",33,500.00);
		
	
		
		System.out.println("Bem vindo ao banco "+ conta01.NOME()+ "\n Agencia: " + conta01.Agencia() + "\n Numero da conta: " + conta01.Numero());
		
		
		 
		System.out.println("Qual operação deseja realizar?" + "\n Digite 1 para consultar o saldo " + "\n Digite 2 para saque " + "\n Digite 3 para deposito" + "\n Digite 4 para rendimento do mês");
		
		opcoes = in.nextInt();
		
		
		if (opcoes == 1) {
			System.out.println("Seu saldo é de "+ conta01.Saldo());
		}
		else if (opcoes ==2) {System.out.println("Informe o valor do saque: " )  ;
		valor = in.nextInt(); 
		
		if (valor <= conta01.Saldo()) { conta01.saque();
		
		}
		else {
			System.out.println("Saldo insuficiente");
		}
		}
		
		else if (opcoes ==3) {System.out.println("Digite o valor do deposito ");
		valor = in.nextInt(); 
		
		conta01.deposito();
		}
		
		 else if (opcoes ==4 ) { conta01.rendimento();
		}
	
	}
		
}		
		
		
		
		
		
		
		
		
		
		
	
