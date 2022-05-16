package dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "fabricantes")
public class Fabricante {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private long codigo_fabricante;
	@Column(name = "nombre")
	private String nombre;
	
	public Fabricante() {

	}
	
	public Fabricante(long codigo_fabricante, String nombre) {
		this.codigo_fabricante = codigo_fabricante;
		this.nombre = nombre;
	}
	
	public long getCodigo_fabricante() {
		return codigo_fabricante;
	}
	
	public void setCodigo_fabricante(long codigo_fabricante) {
		this.codigo_fabricante = codigo_fabricante;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
