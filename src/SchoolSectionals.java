
public class SchoolSectionals {
	
	private String SectionalID;
	private String SchoolID;
	
	//Defines a School Sectional
	public SchoolSectionals(String sectionalID, String schoolID) {
		
		SectionalID = sectionalID;
		SchoolID = schoolID;
	}

	public String getSectionalID() {
		return SectionalID;
	}

	public void setSectionalID(String sectionalID) {
		SectionalID = sectionalID;
	}

	public String getSchoolID() {
		return SchoolID;
	}

	public void setSchoolID(String schoolID) {
		SchoolID = schoolID;
	}
}