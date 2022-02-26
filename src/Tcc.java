
public class Tcc {
	public String titulo, nome_orientador;
	public String nota_trabalho;
	public String membros_banca [] = new String [4];
	
	public Tcc(String titulo, 
			String nome_orientador,
			String nota_trabalho,
			String membros_banca[]) {
	this.titulo = titulo;
	this.nome_orientador = nome_orientador;
	this.nota_trabalho = nota_trabalho;
	this.membros_banca = membros_banca;
	}
	
	
	
	public Tcc() {
		
	}
}
