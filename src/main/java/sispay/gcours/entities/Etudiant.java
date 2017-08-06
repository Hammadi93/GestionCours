package sispay.gcours.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.JoinColumn;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author hammadi le 6 août 2017
 */

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Etudiant implements Serializable {

	/**
	 * Serial version UID
	 */
	private static final long serialVersionUID = -1982480763983112005L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID_ETUDIANT")
	private Integer idEtudiant;

	@Column(name = "NOM_ETUDIANT")
	private String nomEtudiant;

	@Column(name = "PRENOM_ETUDIANT")
	private String prenomEtudiant;

	@Column(name = "ADRESSE")
	private String adresse;

	@Column(name = "DATE_NAISSANCE")
	private Date dateNaissance;

	@ManyToMany
	@JoinTable(name = "ETUDIANT_COURS", joinColumns = @JoinColumn(name = "ID_ETUDIANT", referencedColumnName = "ID_ETUDIANT"), inverseJoinColumns = @JoinColumn(name = "ID_COURS", referencedColumnName = "ID_COURS"))
	private List<Cours> cours;

}
