//Written by Justin

import java.util.Observable;

public class Model extends Observable{
	
	
	// 2D array: a list of the lists of schools that participate in each sectional
	// sectionals[0] is the list of schools that participate in the first sectional
	private String[][] sectionals = {{"Calumet", "East Chicago Central", "Gary West Side", "Griffith", "Hammond", "Hammond Academy of Science & Technology", "Hammond Bishop Noll", "Hammond Clark", "Hammond Gavit", "Hammond Morton", "Highland, Lake Central", "Munster", "Whiting"}, 
									 {"21st Century Charter - Gary", "Andrean", "Crown Point", "Lighthouse CPA", "Gary Roosevelt", "Hanover Central", "Hebron", "Hobart", "Lowell", "Merrillville", "River Forest"}, 
									 {"Boone Grove", "Chesterton", "Lake Station Edison", "LaPorte", "Marquette Catholic", "Michigan City", "New Prairie", "Portage", "South Central (Union Mills)", "Valparaiso", "Washington Township", "Westville", "Wheele"}};
	
	// an array of the host school for each sectional
	// sectionalHost[0] is the host school for the first sectional
	private String[] sectionalHosts = {"Hammond Gavit", "Crown Point", "New Prairie"};
	
	
	
	public String[][] getSectionals() {
		return sectionals;
	}
	public String[] getSectionalHosts() {
		return sectionalHosts;
	}

	
	//Define accessors and modifiers
	//Any method that changes a data member must invoke
	//setChanged()
	//notifyObservers()
}
