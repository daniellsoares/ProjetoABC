package pooProjeto;

public class RespostaExercicio extends Palavra{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Palavra palavra;
	private String resposta;
	private int acertos;
	
	public RespostaExercicio(Palavra palavra, String resposta){
		this.palavra = palavra;
		this.resposta = resposta;
	}
	public Palavra getPalavra() {
		return palavra;
	}
	public void setPalavra(Palavra palavra) {
		this.palavra = palavra;
	}
	public String getResposta() {
		return resposta;
	}
	public void setResposta(String resposta) {
		this.resposta = resposta;
	}
	public boolean correcao(String resposta){
		if(resposta.equalsIgnoreCase(getGabarito())){
			return true;
		}else{
			return false;
		}
		
	}
	public int getAcertos() {
		return acertos;
	}
	public void setAcertos(int acertos) {
		this.acertos = acertos;
	}

}
