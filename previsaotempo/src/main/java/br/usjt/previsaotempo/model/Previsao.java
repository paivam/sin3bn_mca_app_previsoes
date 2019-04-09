package br.usjt.previsaotempo.model;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class Previsao implements Serializable {
    private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private long id;
	private String diaSemana;
	private Double temperaturaMin;
	private Double temperaturaMax;
	private Double humidadeAr;
	private String descricao;
	
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
	
	
}
