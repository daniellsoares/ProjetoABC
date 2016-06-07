package br.ufpb.projeto.persistencia;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import pooProjeto.Palavra;

public class GerenteDeArquivos {
	private static final String ARQUIVO_DEFAULT = null;
	private String nomeArquivo;

	public GerenteDeArquivos(){
		this.nomeArquivo = ARQUIVO_DEFAULT;
	}
	
	public void gravaPalavras(Collection <Palavra> palavras) throws IOException{
		ObjectOutputStream out = null;
		try{
			out = new ObjectOutputStream(new FileOutputStream(nomeArquivo));
			out.writeObject(palavras);
		}finally{
			if(out!= null){
				out.close();
			}
		}
	}
	
	public Collection <Palavra>  lePalavras() throws Exception{
		ObjectInputStream in = null;
		try{
			in = new ObjectInputStream(new FileInputStream(nomeArquivo));
			return (Collection<Palavra>) in.readObject();
		}finally{
			if(in!= null){
				in.close();
			}
		}
		
	}
}


