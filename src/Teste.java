class Teste
{
	public static void main (String args[])
	{
		
		String membros1 [] = {null, null};
		Tcc tcc1 = new Tcc ();
		Aluno aluno1 = new Aluno("Martin Fowler",
							"ADS",
							"Graduação",
							11223344,
							true,
							false,
							false,r
							-1,
							920.50,
							20.5,
							tcc1);
 
		
		String membros2 [] = {"Grady Booch",
							"Erich Gamma"};
		Tcc tcc2 = new Tcc ("Peter Coad",
							"Impacto da Refatoação",
							null,
							membros2);
				
		Aluno aluno2 = new Aluno("Kent Beck",
							"Computação Aplicada",
							"Mestrado",
							22334455,
							false,
							true,
							true,
							2019,
							2150.45,
							0,
							tcc2);
		System.out.println(aluno1.getDados());
		System.out.println(aluno2.getDados());
	}
}
