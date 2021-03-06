package domain;

import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Residence {
	
	private long id;
	private double taille;
	private int nbrePiece;
	private Set<Device> devices;
	private Personne pers;
	
	public Residence(){
		//this.devices = new HashSet<>();
	}

	/**
	 * 
	 * @param taille
	 * @param nbrePiece
	 * @param chauffages
	 * @param equipElectronics
	 * @param personne
	 */
	public Residence(double taille, int nbrePiece, Personne personne) {
		super();
		this.taille = taille;
		this.nbrePiece = nbrePiece;
		this.pers = personne;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getTaille() {
		return taille;
	}

	public void setTaille(double taille) {
		this.taille = taille;
	}

	public int getNbrePiece() {
		return nbrePiece;
	}

	public void setNbrePiece(int nbrePiece) {
		this.nbrePiece = nbrePiece;
	}
	
	@Override
	public String toString() {
		return "Residence [taille=" + taille + ", nbrePiece=" + nbrePiece + "]";
	}
	
	@ManyToOne
	public Personne getPersonne() {
		return pers;
	}

	public void setPersonne(Personne personne) {
		this.pers = personne;
	}

	@OneToMany(mappedBy = "residence", cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
	public Set<Device> getDevices() {
		return devices;
	}

	public void setDevices(Set<Device> devices) {
		this.devices = devices;
	}

	public void addDevice(Device d) {
		devices.add(d);
	}
	
	

	
	
	

}
