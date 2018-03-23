
public class Tournament {
	
	String TournamentID;
	String TournamentName;
	
	public Tournament(String tournamentID, String tournamentName) {
		
		TournamentID = tournamentID;
		TournamentName = tournamentName;
	}
	
	
	public String getTournamentID() {
		return TournamentID;
	}
	public void setTournamentID(String tournamentID) {
		TournamentID = tournamentID;
	}
	public String getTournamentName() {
		return TournamentName;
	}
	public void setTournamentName(String tournamentName) {
		TournamentName = tournamentName;
	}
	
	
	
}
