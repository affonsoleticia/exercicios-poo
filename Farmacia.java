package PooAtividades;

public class Farmacia {

/*Modificadores de acesso com seus respectivos Atributos da classe funcionario*/
	
	private String remedio;
	private String tarja;
	private int id;
	private String validade;
	private String laboratorio;
	
	
/*Aplicação de método construtor(com o proprio nome da classe) com seus parâmetros((instancia, cria objetos das classes); essa x coisa recebe x coisa*/	
	
	public Farmacia(String remedio, String tarja, int id, String validade, String laboratorio) {
		this.remedio = remedio;
		this.tarja = tarja;
		this.id = id;
		this.validade = validade;
		this.laboratorio = laboratorio;
	}
	
/*Método Visualiza*/	

	public void visualiza() {
		System.out.println("O nome do remédio é:" + getRemedio());
		System.out.println("A tarja é:" + getTarja());
		System.out.println("O id do remédio é:" + getId());
		System.out.println("A validade do remédio é:" + getValidade());
		System.out.println("Remédio produzido por laboratório:" + getLaboratorio());
	}
	
/* Métodos Getters e Setters da classe Funcionario*/
	
	public String getRemedio() {
		return remedio;
	}
	
	public void setRemedio(String remedio) {
		this.remedio = remedio;
	}
	
	public String getTarja() {
		return tarja;
	}
	
	public void setTarja(String tarja) {
		this.tarja = tarja;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getValidade() {
		return validade;
	}
	
	public void setValidade(String validade) {
		this.validade = validade;
	}
	
	public String getLaboratorio() {
		return laboratorio;
	}
	
	public void setLaboratorio(String laboratorio) {
		this.laboratorio = laboratorio;
	}
}
