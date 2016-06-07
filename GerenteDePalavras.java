package pooProjeto;

import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import br.ufpb.projeto.persistencia.GerenteDeArquivos;
import br.ufpb.projeto.persistencia.SisExercicioException;

public class GerenteDePalavras {
	private Map<String, Palavra> palavras;
	private GerenteDeArquivos gerenteArq;

	public GerenteDePalavras(){
		this.gerenteArq = new GerenteDeArquivos();
		this.palavras = new HashMap<String,Palavra>();
		try{
			Collection<Palavra> palavrasRecuperadas = gerenteArq.lePalavras();
			for(Palavra p: palavrasRecuperadas){
				this.palavras.put(p.getId(), p);
			}
		}catch(IOException e){
			System.err.println("Não foi possivel recuperar arquivo das palavras");
		}catch(Exception e1){
			System.err.println("Não foi possivel recuperar arquivo das palavras e não deu erro de entrada e saida.");
		}
	}
	
	public void cadastroDePalavra(String novaPalavra) throws PalavraJaExisteException{
		Palavra p = new Palavra ();
		this.cadastroDePalavra(p);
	}

	public void cadastroDePalavra(Palavra p) throws PalavraJaExisteException{
		Palavra pala = this.palavras.get(p.getId());
		if(pala != null){
			throw new PalavraJaExisteException("JÃ¡ existe medicamento com este nome:" + p.getNewPalavra());
		} else {
			this.palavras.put(p.getId(), p);
		}
		
	}
	public Map<String,Palavra> obterExercicios(int n) throws QntDePalavraInsulficientesException{
		if(n < palavras.size()){
			return this.palavras;
		}else{
			for(Palavra p: this.obterExercicios(n)){
				return this.palavras;

			}
		throw new QntDePalavraInsulficientesException("A quantidade de exercicios é insuficiente!");
		}
	}
	
	public void salvarDados() throws SisExercicioException{
		try{
			this.gerenteArq.gravaPalavras(palavras.values());
		}catch(IOException e){
			throw new SisExercicioException("Não foi possivel salvar os dados das palavras");
		}
		}
}
