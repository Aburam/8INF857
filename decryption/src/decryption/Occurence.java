package decryption;

import java.util.ArrayList;

/**
 * 
 * @author Baptiste
 *	
 *	D�crit une r�p�tition d'un mot au sein d'une chaine de caract�re,
 *  la distance entre ces r�p�titions et ses diviseurs.
 */
public class Occurence {


	private String m_mot;
	private int m_distance;
	private ArrayList<Integer> m_facteurDistance = new ArrayList<Integer>();
	
	public Occurence (String mot, int distance){
		m_mot = mot;
		m_distance = distance;
		m_facteurDistance = calculateFacteurDistance();
	}

	private ArrayList<Integer> calculateFacteurDistance() {
		ArrayList<Integer> diviseur = new ArrayList<>();
		for (int i = 0 ; i<m_distance/2 ; i++){
			if(m_distance % i == 0){
				diviseur.add(i);
			}
		}
		diviseur.add(m_distance);
		return diviseur;
	}

	public String getMot() {
		return m_mot;
	}
	
	public int getDistance() {
		return m_distance;
	}
	
	public ArrayList<Integer> getFacteurDistance() {
		return m_facteurDistance;
	}

}