package pooProjeto;

import java.util.Map;

public class SisExercicioMemory implements SisExercicio {
	private GerenteDePalavras wordsManager;
	
	public SisExercicioMemory() throws Exception{
		this.wordsManager = new GerenteDePalavras();
	}
	
	public void cadastroDePalavra(String novaPalavra) throws PalavraJaExisteException{
		wordsManager.cadastroDePalavra(novaPalavra);
	}
	public void cadastroDePalavra(Palavra p)throws PalavraJaExisteException{
		wordsManager.cadastroDePalavra(p);

	}

	@Override
	public Map<String, Palavra> obterExercicios(int n) throws QntDePalavraInsulficientesException {
		// TODO Auto-generated method stub
		return null;
	}

}
