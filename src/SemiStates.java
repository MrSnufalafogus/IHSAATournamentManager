
public class SemiStates {
	
	String SemiStateID;
	String HostSchoolID;
	String TournamentID;
	String ParentStateID;
	
	//Defines a Semi-State
	public SemiStates(String semiStateID, String hostSchoolID, String tournamentID, String parentStateID) {
		
		SemiStateID = semiStateID;
		HostSchoolID = hostSchoolID;
		TournamentID = tournamentID;
		ParentStateID = parentStateID;
	}

	public String getSemiStateID() {
		return SemiStateID;
	}

	public void setSemiStateID(String semiStateID) {
		SemiStateID = semiStateID;
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

	public String getParentStateID() {
		return ParentStateID;
	}

	public void setParentStateID(String parentStateID) {
		ParentStateID = parentStateID;
	}	

}
