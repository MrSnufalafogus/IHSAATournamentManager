
public class Sectionals {
	
	private String SectionalID;
	private String HostSchoolID;
	private String TournamentID;
	private String ParentRegionalID;
	
	//Defines a Sectional
	public Sectionals(String sectionalID, String hostSchoolID, String tournamentID, String parentRegionalID) {

		SectionalID = sectionalID;
		HostSchoolID = hostSchoolID;
		TournamentID = tournamentID;
		ParentRegionalID = parentRegionalID;
	}

	public String getSectionalID() {
		return SectionalID;
	}

	public void setSectionalID(String sectionalID) {
		SectionalID = sectionalID;
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

	public String getParentRegionalID() {
		return ParentRegionalID;
	}

	public void setParentRegionalID(String parentRegionalID) {
		ParentRegionalID = parentRegionalID;
	}	

}
