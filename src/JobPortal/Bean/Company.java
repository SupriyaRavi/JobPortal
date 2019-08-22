package JobPortal.Bean;

public class Company {

	private String Cname;
	private String Email;
	private String Password;
	private String Website;
	private String ContactPerson;
	private String ContactPersonNumber;
	public String getCname() {
		return Cname;
	}
	public void setCname(String cname) {
		Cname = cname;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getWebsite() {
		return Website;
	}
	public void setWebsite(String website) {
		Website = website;
	}
	public String getContactPerson() {
		return ContactPerson;
	}
	public void setContactPerson(String contactPerson) {
		ContactPerson = contactPerson;
	}
	public String getContactPersonNumber() {
		return ContactPersonNumber;
	}
	public void setContactPersonNumber(String contactPersonNumber) {
		ContactPersonNumber = contactPersonNumber;
	}
	@Override
	public String toString() {
		return "Company [Cname=" + Cname + ", Email=" + Email + ", Password=" + Password + ", Website=" + Website
				+ ", ContactPerson=" + ContactPerson + ", ContactPersonNumber=" + ContactPersonNumber + "]";
	}
	public Company(String cname, String email, String password, String website, String contactPerson,
			String contactPersonNumber) {
		
		Cname = cname;
		Email = email;
		Password = password;
		Website = website;
		ContactPerson = contactPerson;
		ContactPersonNumber = contactPersonNumber;
	}
	public Company() {
		
	}

}
