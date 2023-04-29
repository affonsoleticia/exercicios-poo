package PooAtividades;

public class FarmaciaTeste {

	public static void main(String[] args) {
		
/* instanciando 2 objetos da classe Funcionario e usando o método visualiza para ver as infos*/	
		
		Farmacia produto1 = new Farmacia("Nimesulida","vermelha",566556,"730 dias","Cimed");
			produto1.visualiza();

		Farmacia produto2 = new Farmacia("Rivotril","preta",441232,"900 dias","Roche");	
			produto2.visualiza();
			
/*Método set para alterar os dados do objeto f1*/	
			
	//		produto2.setId(555969);
	//		produto2.setLaboratorio("Medley");
	//			produto2.visualiza(); 			
			
	}
}	
