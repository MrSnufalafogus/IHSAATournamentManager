
public class Regionals {
	
	private String RegionalID;
	private String HostSchool;
	private String Tournament;
	private String ParetnSemiStateID;
	
	public Regionals(String regionalID, String hostSchool, String tournament, String paretnSemiStateID) {
		
		RegionalID = regionalID;
		HostSchool = hostSchool;
		Tournament = tournament;
		ParetnSemiStateID = paretnSemiStateID;
	}

	public String getRegionalID() {
		return RegionalID;
	}

	public void setRegionalID(String regionalID) {
		RegionalID = regionalID;
	}

	public String getHostSchool() {
		return HostSchool;
	}

	public void setHostSchool(String hostSchool) {
		HostSchool = hostSchool;
	}

	public String getTournament() {
		return Tournament;
	}

	public void setTournament(String tournament) {
		Tournament = tournament;
	}

	public String getParetnSemiStateID() {
		return ParetnSemiStateID;
	}

	public void setParetnSemiStateID(String paretnSemiStateID) {
		ParetnSemiStateID = paretnSemiStateID;
	}
	
		
	
}
