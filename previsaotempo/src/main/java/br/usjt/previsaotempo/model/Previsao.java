package br.usjt.previsaotempo.model;

import java.io.Serializable;
import javax.persistence.*;


@Entity
public class Previsao implements Serializable {
    private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Long id;
	private String diaSemana;
	private Double temperaturaMin;
	private Double temperaturaMax;
	private Double humidadeAr;
	private String descricao;
	private String dataHora;
	
	@OneToOne
	@JoinColumn(name ="id_do_meu_dia")
	private DiaSemana diaSem;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_da_minha_cidade")
	private Cidade cidade;
	
	
	public String getDataHora() {
		return dataHora;
	}
	public void setDataHora(String dataHora) {
		this.dataHora = dataHora;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDiaSemana() {
		return diaSemana;
	}
	public void setDiaSemana(String diaSemana) {
		this.diaSemana = diaSemana;
	}
	public Double getTemperaturaMin() {
		return temperaturaMin;
	}
	public void setTemperaturaMin(Double temperaturaMin) {
		this.temperaturaMin = temperaturaMin;
	}
	public Double getTemperaturaMax() {
		return temperaturaMax;
	}
	public void setTemperaturaMax(Double temperaturaMax) {
		this.temperaturaMax = temperaturaMax;
	}
	public Double getHumidadeAr() {
		return humidadeAr;
	}
	public void setHumidadeAr(Double humidadeAr) {
		this.humidadeAr = humidadeAr;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
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
		Previsao other = (Previsao) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Previsao [id=" + id + ", diaSemana=" + diaSemana + ", temperaturaMin=" + temperaturaMin
				+ ", temperaturaMax=" + temperaturaMax + ", humidadeAr=" + humidadeAr + ", descricao=" + descricao
				+ ", dataHora=" + dataHora + ", latitute="  + ", diaSem="
				+ diaSem + "]";
	}
	
	
}
