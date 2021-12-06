package ma.ac.emi.ginfo.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Budget {
	@Id
	private String intitule;
	
	@OneToMany
	private List<Imputation> imputations = new ArrayList<Imputation>();
	
	public String getIntitule() {
		return intitule;
	}
	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}
	public List<Imputation> getImputations() {
		return imputations;
	}
	public void setImputations(List<Imputation> imputations) {
		this.imputations = imputations;
	}
	public Budget(String intitule, List<Imputation> imputations) {
		super();
		this.intitule = intitule;
		this.imputations = imputations;
	}
	public Budget() {
		super();
	}
	

}
