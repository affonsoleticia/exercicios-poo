package PooAtividades;

public class FuncionarioTeste {

	public static void main(String[] args) {

/* instanciando 2 objetos da classe Funcionario e usando o método visualiza para ver as infos*/		
		
		Funcionario f1 = new Funcionario("Leticia",987352700,"Engenharia de Analytics II","Analista Engenheiro de Analytics","leticia-empresa@gmail.com");
			f1.visualiza();
		
		Funcionario f2 = new Funcionario("Giovanna",96755643,"Operações"," Analista de Operações","giovanna-empresa@gmail.com");
			f2.visualiza();
			
/*Método set para alterar os dados do objeto f1*/	
//		f1.setFuncional(987352752);
//		f1.setCargo("Analista Engenheiro de Dados");
//			f1.visualiza(); 
			
	}
}

