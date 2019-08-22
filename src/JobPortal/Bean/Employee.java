package JobPortal.Bean;

public class Employee {
	
	private String mail;
	private String fname;
	private String lname;
	private String mobilenum;
	private String username;
	private String password;
	private String gender;
	private String technicalskills;
	private String currentrole;
	private String company;
	private String experience;
	
	
	public String getEmail() {
		return mail;
	}
	public void setEmail(String mail) {
		this.mail = mail;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getMobilenum() {
		return mobilenum;
	}
	public void setMobilenum(String mobilenum) {
		this.mobilenum = mobilenum;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getTechnicalskills() {
		return technicalskills;
	}
	public void setTechnicalskills(String technicalskills) {
		this.technicalskills = technicalskills;
	}
	public String getCurrentrole() {
		return currentrole;
	}
	public void setCurrentrole(String currentrole) {
		this.currentrole = currentrole;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	@Override
	public String toString() {
		return "Employee [" + (mail != null ? "mail=" + mail + ", " : "")
				+ (fname != null ? "fname=" + fname + ", " : "") + (lname != null ? "lname=" + lname + ", " : "")
				+ (mobilenum != null ? "mobilenum=" + mobilenum + ", " : "")
				+ (username != null ? "username=" + username + ", " : "")
				+ (password != null ? "password=" + password + ", " : "")
				+ (gender != null ? "gender=" + gender + ", " : "")
				+ (technicalskills != null ? "technicalskills=" + technicalskills + ", " : "")
				+ (currentrole != null ? "currentrole=" + currentrole + ", " : "")
				+ (company != null ? "company=" + company + ", " : "") + "experience=" + experience + "]";
	}
	public Employee(String email, String fname, String lname, String mobilenum, String username, String password,
			String gender, String technicalskills, String currentrole, String company, String experience) {
		
		this.mail = mail;
		this.fname = fname;
		this.lname = lname;
		this.mobilenum = mobilenum;
		this.username = username;
		this.password = password;
		this.gender = gender;
		this.technicalskills = technicalskills;
		this.currentrole = currentrole;
		this.company = company;
		this.experience = experience;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	
}
