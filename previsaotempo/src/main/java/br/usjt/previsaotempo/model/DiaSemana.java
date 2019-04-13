package br.usjt.previsaotempo.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_dia_semana")
public class DiaSemana implements Serializable {
     
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Long id;
	private String nomeDiaSem;
	
	@OneToOne(mappedBy ="diaSem")
	private Previsao previsao;
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeDiaSem() {
		return nomeDiaSem;
	}

	public void setNomeDiaSem(String nomeDiaSem) {
		this.nomeDiaSem = nomeDiaSem;
	}

	public Previsao getPrevisao() {
		return previsao;
	}

	public void setPrevisao(Previsao previsao) {
		this.previsao = previsao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		DiaSemana other = (DiaSemana) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "DiaSemana [id=" + id + ", nomeDiaSem=" + nomeDiaSem + "]";
	}

	
}
