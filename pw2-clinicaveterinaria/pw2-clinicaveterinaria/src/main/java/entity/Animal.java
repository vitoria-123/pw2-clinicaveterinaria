package entity;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;

import org.hibernate.annotations.FilterJoinTable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

//@PW2_CLINICAVETERINARIA
public class Animal {
	@PrimaryKeyJoinColumn(name="IDANIMAL")
	private int idanimal;
    @JoinColumn(name="NOME_ANIMAL")
	private String nome_animal;
	@JoinColumn(name="TIPO")
	private String tipo;
	@JoinColumn(name="RACA_ANIMAL")
	private String raca_animal;
	@JoinColumn(name="PESO")
	private float peso;
	@ManyToOne
	@JoinColumn(name="DONO")
	private int dono;
}
