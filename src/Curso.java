class Curso{
	public String nome_curso, nível_curso;
	public double mensalidade_curso;
	public boolean tem_trabalho;
 
	public Curso(String nome_curso, 
				String nível_curso,
				double mensalidade_curso,
				boolean tem_trabalho) {
		this.nome_curso = nome_curso;
		this.nível_curso = nível_curso;
		this.mensalidade_curso = mensalidade_curso;
		this.tem_trabalho = tem_trabalho;
				}
	
	public Curso() {
	}
	
}