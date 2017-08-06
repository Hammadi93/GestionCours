package sispay.gcours.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

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
public class Cours implements Serializable {

	/**
	 * Serial version UID
	 */
	private static final long serialVersionUID = -168241841076026816L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID_COURS")
	private String idCours;

	@Column(name = "LIBELLE_COURS")
	private String libelleCours;

	@ManyToMany(mappedBy = "cours")
	private List<Etudiant> etudiants;

}
