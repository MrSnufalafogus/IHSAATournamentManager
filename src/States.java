
public class States {
	
	String StateID;
	String HostSchoolID;
	String TournamentID;
	
	
	public States(String stateID, String hostSchoolID, String tournamentID) {
		
		StateID = stateID;
		HostSchoolID = hostSchoolID;
		TournamentID = tournamentID;
	}


	public String getStateID() {
		return StateID;
	}


	public void setStateID(String stateID) {
		StateID = stateID;
	}


	public String getHostSchoolID() {
		return HostSchoolID;
	}


	public void setHostSchoolID(String hostSchoolID) {
		HostSchoolID = hostSchoolID;
	}


	public String getTournamentID() {
		return TournamentID;
	}


	public void setTournamentID(String tournamentID) {
		TournamentID = tournamentID;
	}
	
	
	
	

}
