package pooProjeto;

public class AssociacaoDeImagem extends Palavra{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String imagem;
	private String som;
	public AssociacaoDeImagem(String newPalavra,String gabarito, String imagem, String som){
		this.setImagem(imagem);
		this.setSom(som);
	}
	public AssociacaoDeImagem(){
		this("","","","");
	}
	public String getImagem() {
		return imagem;
	}
	public void setImagem(String imagem) {
		this.imagem = imagem;
	}
	public String getSom() {
		return som;
	}
	public void setSom(String som) {
		this.som = som;
	}
	
	

}
