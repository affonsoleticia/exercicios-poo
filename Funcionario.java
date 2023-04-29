package PooAtividades;

public class Funcionario {
	
/*Modificadores de acesso com seus respectivos Atributos da classe funcionario*/
	
	private String nome;
	private int funcional;
	private String coordenacao;
	private String cargo;
	private String email;
	
/*Aplicação de método construtor(com o proprio nome da classe) com seus parâmetros((instancia, cria objetos das classes); essa x coisa recebe x coisa*/
	
	public Funcionario(String nome, int funcional, String coordenacao, String cargo, String email) {
			this.nome = nome;
			this.funcional = funcional;
			this.coordenacao = coordenacao;
			this.cargo = cargo;
			this.email = email;
	}
	
	
/* Método Visualizar*/
	
	public void visualiza() {
		System.out.println("O nome do funcionário é:" + getNome());
		System.out.println("A funcional do funcionário é:" + getFuncional());
		System.out.println("O funcionário pertence a coordeção:" + getCoordenacao());
		System.out.println("O cargo do funcionário é:" + getCargo());
		System.out.println("O email do funcionário é:" + getEmail());
	}

	
/* Métodos Getters e Setters da classe Funcionario*/
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getFuncional() {
		return funcional;
	}
	
	public void setFuncional(int funcional) {
		this.funcional = funcional;
	}
	
	public String getCoordenacao() {
		return coordenacao;
	}
	
	public void setCoordenacao(String coordenacao) {
		this.coordenacao = coordenacao;
	}
	
	public String getCargo() {
		return cargo;
	}
	
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
}
