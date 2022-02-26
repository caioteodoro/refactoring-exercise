class Aluno{
	private String nome;
	private int cód_matrícula, ano_finalização;
	private boolean é_bolsista, curso_finalizado;
	private double desconto;
	private Curso curso = new Curso();
	public Tcc dados_tcc = new Tcc();
 
	public Aluno(String nome,
			String nome_curso, 
			String nível_curso,
			int cód_matrícula,
			boolean é_bolsista,
			boolean curso_finalizado,
			boolean tem_trabalho,
			int ano_finalização,
			double mensalidade_curso,
			double desconto,
			Tcc dados_tcc) {
		
	this.nome = nome;
	this.curso.nome_curso = nome_curso;
	this.curso.nível_curso = nível_curso;
	this.cód_matrícula = cód_matrícula;
	this.é_bolsista = é_bolsista;
	this.curso_finalizado = curso_finalizado;
	this.curso.tem_trabalho = tem_trabalho;
	this.ano_finalização = ano_finalização;
	this.curso.mensalidade_curso = mensalidade_curso;
	this.desconto = desconto;
	this.dados_tcc = dados_tcc;
			}
 
	public String getDadosAluno() {
		String resp = "Aluno: "+ this.nome +"\n";
		resp += "Curso: " + this.curso.nível_curso + " em " + this.curso.nome_curso +"\n";
		return resp;
	}
	
	public String getMensalidade()
	{
		String resp="";
		if (this.é_bolsista) 
		{
			resp += "Bolsista com desconto de: " + this.desconto + "%\n";
			this.curso.mensalidade_curso *= (1-this.desconto/100);
		}
		resp += "Mensalidade: R$ " + this.curso.mensalidade_curso + "\n";
		return resp;
	}
	
	public String getFinalizacaoDoCurso() {
		String resp = "";
		if (this.curso_finalizado) {
			resp += "Curso finalizado em "+ano_finalização + "\n";
			if (this.curso.tem_trabalho) {
				resp += "Título ";
				switch (curso.nível_curso) {
					case "Graduação": resp += "do TCC: "; break;
					case "Lato sensu": resp += "da monografia: "; break;
					case "Mestrado": resp += "da dissertação: "; break;
					case "Doutorado": resp += "da tese: "; break;
				}
			resp += dados_tcc.titulo + "\n";
			resp += "Orientador(a): Prof. " + dados_tcc.nome_orientador + "\n";
			
			if (this.curso.nível_curso.equals("Graduação")) {
				resp += "Nota: " + dados_tcc.nota_trabalho; 
				} else if (this.curso.nível_curso.equals("Mestrado") || this.curso.nível_curso.equals("Doutorado")) {
					resp += "Banca: " + dados_tcc.membros_banca[0] + " - " + dados_tcc.membros_banca[1]; 
					if (this.curso.nível_curso.equals("Doutorado")) {
						resp += dados_tcc.membros_banca[2] + " - " + dados_tcc.membros_banca[3];
					}
				}
			}
		}
		return resp;
	}
	
	public String getDados()
	{
		String resp = "";
		resp += this.getDadosAluno();
		resp += this.getMensalidade();
		resp += this.getFinalizacaoDoCurso();
		return resp;
	}	
}