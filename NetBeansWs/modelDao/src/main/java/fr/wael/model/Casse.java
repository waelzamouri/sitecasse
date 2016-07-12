package fr.wael.model;
import java.util.Set;
import java.util.HashSet;



/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
 
@javax.persistence.Entity 
public class Casse
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	@javax.persistence.Id  
	@javax.persistence.Column(nullable = false) 
	private long id_casse;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	 
	@javax.persistence.ManyToMany(mappedBy = "casse") 
	private Set<Demande> demande;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	 
	@javax.persistence.OneToMany(mappedBy = "casse") 
	private Set<Avis> avis;

	
        @javax.persistence.Column(nullable = true)
        private String nom;
        
        @javax.persistence.Column(nullable = true)
        private String adresse;
        
        

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public Casse(){
		super();
	}

	
}

