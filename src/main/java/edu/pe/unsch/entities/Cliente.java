package edu.pe.unsch.entities;
// Generated 16/07/2019 11:31:21 PM by Hibernate Tools 5.1.10.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Cliente generated by hbm2java
 */
@Entity
@Table(name = "cliente", catalog = "ecommerceremate")
public class Cliente implements java.io.Serializable {

	private Integer id;
	private Localidad localidad;
	private String appaterno;
	private String apmaterno;
	private String nombre;
	private String telefono;
	private String sexo;
	private Date fechanacimiento;
	private Date fecharegistro;
	private Set<Revision> revisions = new HashSet<Revision>(0);
	private Set<Login> logins = new HashSet<Login>(0);

	public Cliente() {
	}

	public Cliente(Localidad localidad, String appaterno, String apmaterno, String nombre, String telefono, String sexo,
			Date fechanacimiento, Date fecharegistro, Set<Revision> revisions, Set<Login> logins) {
		this.localidad = localidad;
		this.appaterno = appaterno;
		this.apmaterno = apmaterno;
		this.nombre = nombre;
		this.telefono = telefono;
		this.sexo = sexo;
		this.fechanacimiento = fechanacimiento;
		this.fecharegistro = fecharegistro;
		this.revisions = revisions;
		this.logins = logins;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idlocalidad")
	public Localidad getLocalidad() {
		return this.localidad;
	}

	public void setLocalidad(Localidad localidad) {
		this.localidad = localidad;
	}

	@Column(name = "appaterno", length = 60)
	public String getAppaterno() {
		return this.appaterno;
	}

	public void setAppaterno(String appaterno) {
		this.appaterno = appaterno;
	}

	@Column(name = "apmaterno", length = 60)
	public String getApmaterno() {
		return this.apmaterno;
	}

	public void setApmaterno(String apmaterno) {
		this.apmaterno = apmaterno;
	}

	@Column(name = "nombre", length = 60)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "telefono", length = 20)
	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Column(name = "sexo", length = 20)
	public String getSexo() {
		return this.sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fechanacimiento", length = 10)
	public Date getFechanacimiento() {
		return this.fechanacimiento;
	}

	public void setFechanacimiento(Date fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fecharegistro", length = 19)
	public Date getFecharegistro() {
		return this.fecharegistro;
	}

	public void setFecharegistro(Date fecharegistro) {
		this.fecharegistro = fecharegistro;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cliente")
	public Set<Revision> getRevisions() {
		return this.revisions;
	}

	public void setRevisions(Set<Revision> revisions) {
		this.revisions = revisions;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cliente")
	public Set<Login> getLogins() {
		return this.logins;
	}

	public void setLogins(Set<Login> logins) {
		this.logins = logins;
	}

}
