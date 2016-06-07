package pooProjeto;

import java.util.Map;

public interface SisExercicio {
	public void cadastroDePalavra(Palavra p) throws PalavraJaExisteException;
	
	public Map<String,Palavra> obterExercicios(int n) throws QntDePalavraInsulficientesException;
}
