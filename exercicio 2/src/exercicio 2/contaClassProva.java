package prova;

public class contaClassProva {
	
	 String nomeTitular;
	 String agencia;
	 String dataAbertura;
	 int numero;
	 double saldo;
	 double retorno;
	
	 
	 public contaClassProva (String nome,String agencia, String dataAbertura,int numero, double saldo) {
	 
	 	this.nomeTitular=nome;
	 	this.agencia=agencia;
	 	this.dataAbertura=dataAbertura;
	 	this.numero=numero;
	 	this.saldo=saldo;
	 	
	 }
	 
	 public void saque() {System.out.println("Realizando operação de saque"); 
		 
	 }
	 public void deposito() {System.out.println("Realizando operação de deposito");
	 }

	 public void rendimento() {retorno = (saldo * 0.3 )/100; 
	 System.out.print("O seu dinheiro guardado rendeu R$" + retorno + " este mes"); 
	 
	 }

	 	public String NOME() {return nomeTitular = nomeTitular;
	 	}
	 	
	 	public String Agencia() {return agencia = agencia;
	 	}
	 	
	 	public int Numero() {return numero = numero;
	 	
	 	}
	 	
		public double Saldo() {return saldo= saldo;
		}
		
		
	
	 	

}	 
	 


