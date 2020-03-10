package br.com.softblue.loucademia.domain.aluno;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ESTADO")
public class Estado implements Serializable{
	
	@Id
	@Column(name = "SIGLA", nullable = false, length = 2)
	private String Sigla;
	
	@Column(name ="NOME", nullable = false, length = 30)
	private String nome;
	
	public String getSigla() {
		return Sigla;
	}
	public void setSigla(String sigla) {
		Sigla = sigla;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return "Estado [Sigla=" + Sigla + ", nome=" + nome + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Sigla == null) ? 0 : Sigla.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estado other = (Estado) obj;
		if (Sigla == null) {
			if (other.Sigla != null)
				return false;
		} else if (!Sigla.equals(other.Sigla))
			return false;
		return true;
	}
	
	

}
