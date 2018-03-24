import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class TournamentDB {
	
	public static void main(String[] args) {
		
		TournamentDB db = new TournamentDB();
		db.getTournament();	
		
	}
	
	//Get Schools from persistent store
	public ArrayList<School> getSchools(){
		
		Connection connection = null;
		ResultSet resultSet = null;
		Statement statement = null;
		School s;
		ArrayList<School> schoolList = new ArrayList<School>();

		try {
			
			Class.forName("org.hsqldb.jdbcDriver");
			connection = DriverManager.getConnection("jdbc:hsqldb:file:TournamentDB", "SA", "");
			statement = connection.createStatement();
			resultSet = statement.executeQuery("SELECT * FROM Schools");			
			
			int i = 0;
			
			while (resultSet.next()) {
				
				s = new School(resultSet.getString("SchoolID"), resultSet.getString("SchoolName"), 
							   resultSet.getString("Address"),resultSet.getString("City"),resultSet.getString("StateCode"), 
							   resultSet.getString("ZIP"),resultSet.getString("CountyName"),resultSet.getString("Phone"), resultSet.getString("Fax"), 
							   resultSet.getInt("EnrollmentAmount"));
				
				
				schoolList.add(s);
				System.out.println(schoolList.get(i).getSchoolName());
				
				i++;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			
			try {
				resultSet.close();
				statement.close();
				connection.close();
				
			} catch (Exception e) {
				e.printStackTrace();
				
			}
		}
		return schoolList;
	}
	
	//Get School Sectionals from persistent store
	public ArrayList<SchoolSectionals> getSchoolSectionals(){
		
		Connection connection = null;
		ResultSet resultSet = null;
		Statement statement = null;
		SchoolSectionals ss;
		ArrayList<SchoolSectionals> schoolSectionalList = new ArrayList<SchoolSectionals>();

		try {
			
			Class.forName("org.hsqldb.jdbcDriver");
			connection = DriverManager.getConnection("jdbc:hsqldb:file:TournamentDB", "SA", "");
			statement = connection.createStatement();
			resultSet = statement.executeQuery("SELECT * FROM SchoolSectionals");			
			
			int i = 0;
			
			while (resultSet.next()) {
				
				ss = new SchoolSectionals(resultSet.getString("SectionalID"), resultSet.getString("SchoolID"));
				
				
				schoolSectionalList.add(ss);
				System.out.println(schoolSectionalList.get(i).getSchoolID());
				
				i++;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			
			try {
				resultSet.close();
				statement.close();
				connection.close();
				
			} catch (Exception e) {
				e.printStackTrace();
				
			}
		}
		return schoolSectionalList;
		
	}
	
	//Get Regionals from persistent store
	public ArrayList<Regionals> getRegionals(){
		
		Connection connection = null;
		ResultSet resultSet = null;
		Statement statement = null;
		Regionals r;
		ArrayList<Regionals> regionalList = new ArrayList<Regionals>();

		try {
			
			Class.forName("org.hsqldb.jdbcDriver");
			connection = DriverManager.getConnection("jdbc:hsqldb:file:TournamentDB", "SA", "");
			statement = connection.createStatement();
			resultSet = statement.executeQuery("SELECT * FROM Regionals");			
			
			int i = 0;
			
			while (resultSet.next()) {
				
				r = new Regionals(resultSet.getString("RegionalID"), resultSet.getString("HostSchoolID"), 
							   resultSet.getString("TournamentID"),resultSet.getString("ParentSemiStateID"));
				
				
				regionalList.add(r);
				System.out.println(regionalList.get(i).getHostSchool());
				
				i++;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			
			try {
				resultSet.close();
				statement.close();
				connection.close();
				
			} catch (Exception e) {
				e.printStackTrace();
				
			}
		}
		return regionalList;
	}
	
	//Get Semi-States from persistent store
	public ArrayList<SemiStates> getSemiStates(){
		
		Connection connection = null;
		ResultSet resultSet = null;
		Statement statement = null;
		SemiStates ss;
		ArrayList<SemiStates> semiStateList = new ArrayList<SemiStates>();

		try {
			
			Class.forName("org.hsqldb.jdbcDriver");
			connection = DriverManager.getConnection("jdbc:hsqldb:file:TournamentDB", "SA", "");
			statement = connection.createStatement();
			resultSet = statement.executeQuery("SELECT * FROM SemiStates");			
			
			int i = 0;
			
			while (resultSet.next()) {
				
				ss = new SemiStates(resultSet.getString("SemiStatesID"), resultSet.getString("HostSchoolID"), 
							   resultSet.getString("TournamentID"),resultSet.getString("ParentStateID"));
				
				
				semiStateList.add(ss);
				System.out.println(semiStateList.get(i).getHostSchoolID());
				
				i++;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			
			try {
				resultSet.close();
				statement.close();
				connection.close();
				
			} catch (Exception e) {
				e.printStackTrace();
				
			}
		}
		return semiStateList;
	}
	
	//Get States from persistent store
	public ArrayList<States> getStates(){
		
		Connection connection = null;
		ResultSet resultSet = null;
		Statement statement = null;
		States s;
		ArrayList<States> stateList = new ArrayList<States>();

		try {
			
			Class.forName("org.hsqldb.jdbcDriver");
			connection = DriverManager.getConnection("jdbc:hsqldb:file:TournamentDB", "SA", "");
			statement = connection.createStatement();
			resultSet = statement.executeQuery("SELECT * FROM States");			
			
			int i = 0;
			
			while (resultSet.next()) {
				
				s = new States(resultSet.getString("StateID"), resultSet.getString("HostSchoolID"), 
						resultSet.getString("TournamentID"));
				
				
				stateList.add(s);
				System.out.println(stateList.get(i).getHostSchoolID());
				
				i++;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			
			try {
				resultSet.close();
				statement.close();
				connection.close();
				
			} catch (Exception e) {
				e.printStackTrace();
				
			}
		}
		return stateList;
	}
	
	//Get Sectionals from persistent store
	public ArrayList<Sectionals> getSectionals(){
		
		Connection connection = null;
		ResultSet resultSet = null;
		Statement statement = null;
		Sectionals s;
		ArrayList<Sectionals> sectionalList = new ArrayList<Sectionals>();

		try {
			
			Class.forName("org.hsqldb.jdbcDriver");
			connection = DriverManager.getConnection("jdbc:hsqldb:file:TournamentDB", "SA", "");
			statement = connection.createStatement();
			resultSet = statement.executeQuery("SELECT * FROM Sectionals");			
			
			int i = 0;
			
			while (resultSet.next()) {
				
				s = new Sectionals(resultSet.getString("SectionalID"), resultSet.getString("HostSchoolID"), 
							   resultSet.getString("TournamentID"),resultSet.getString("ParentRegionalID"));
				
				
				sectionalList.add(s);
				System.out.println(sectionalList.get(i).getHostSchoolID());
				
				i++;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			
			try {
				resultSet.close();
				statement.close();
				connection.close();
				
			} catch (Exception e) {
				e.printStackTrace();
				
			}
		}
		return sectionalList;
	}
	
	//Get Tourament from persistent store
	public ArrayList<Tournament> getTournament(){
		
		Connection connection = null;
		ResultSet resultSet = null;
		Statement statement = null;
		Tournament t;
		ArrayList<Tournament> tournamentList = new ArrayList<Tournament>();

		try {
			
			Class.forName("org.hsqldb.jdbcDriver");
			connection = DriverManager.getConnection("jdbc:hsqldb:file:TournamentDB", "SA", "");
			statement = connection.createStatement();
			resultSet = statement.executeQuery("SELECT * FROM Tournaments");			
			
			int i = 0;
			
			while (resultSet.next()) {
				
				t = new Tournament(resultSet.getString("TournamentID"), resultSet.getString("TournamentName"));
				
				
				tournamentList.add(t);
				System.out.println(tournamentList.get(i).getTournamentName());
				
				i++;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			
			try {
				resultSet.close();
				statement.close();
				connection.close();
				
			} catch (Exception e) {
				e.printStackTrace();
				
			}
		}
		return tournamentList;
	}
}
