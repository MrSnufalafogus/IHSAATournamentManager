import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class TournamentDB {
	
	public static void main(String[] args) {
		
		TournamentDB db = new TournamentDB();
		db.getSchools();	
		
	}
	
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
}
