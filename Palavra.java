package pooProjeto;

import java.io.Serializable;

public class Palavra implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String newPalavra;
	private String gabarito;
	public String getNewPalavra() {
		return newPalavra;
	}
	public void setNewPalavra(String newPalavra) {
		this.newPalavra = newPalavra;
	}
	public String getGabarito() {
		return gabarito;
	}
	public void setGabarito(String gabarito) {
		this.gabarito = gabarito;
	}
	public String getId(){
		return this.newPalavra.toString();
	}
	public void setId(String id) {
	}
	
	
	
}
