package JobPortal.Bean;

public class Jobs {
	private String jobtitle;
	private String jobdescription;
	private String salary;
	private String skills;
	private String joblocation;
	private String contactperson;
	private String contactpersonnumber;
	private String companyname;
	private String companyemail;
	public String getJobtitle() {
		return jobtitle;
	}
	public void setJobtitle(String jobtitle) {
		this.jobtitle = jobtitle;
	}
	public String getJobdescription() {
		return jobdescription;
	}
	public void setJobdescription(String jobdescription) {
		this.jobdescription = jobdescription;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
	public String getJoblocation() {
		return joblocation;
	}
	public void setJoblocation(String joblocation) {
		this.joblocation = joblocation;
	}
	public String getContactperson() {
		return contactperson;
	}
	public void setContactperson(String contactperson) {
		this.contactperson = contactperson;
	}
	public String getContactpersonnumber() {
		return contactpersonnumber;
	}
	public void setContactpersonnumber(String contactpersonnumber) {
		this.contactpersonnumber = contactpersonnumber;
	}
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public String getCompanyemail() {
		return companyemail;
	}
	public void setCompanyemail(String companyemail) {
		this.companyemail = companyemail;
	}
	@Override
	public String toString() {
		return "Jobs [" + (jobtitle != null ? "jobtitle=" + jobtitle + ", " : "")
				+ (jobdescription != null ? "jobdescription=" + jobdescription + ", " : "")
				+ (salary != null ? "salary=" + salary + ", " : "") + (skills != null ? "skills=" + skills + ", " : "")
				+ (joblocation != null ? "joblocation=" + joblocation + ", " : "")
				+ (contactperson != null ? "contactperson=" + contactperson + ", " : "")
				+ (contactpersonnumber != null ? "contactpersonnumber=" + contactpersonnumber + ", " : "")
				+ (companyname != null ? "companyname=" + companyname + ", " : "")
				+ (companyemail != null ? "companyemail=" + companyemail : "") + "]";
	}
	public Jobs(String jobtitle, String jobdescription, String salary, String skills, String joblocation,
			String contactperson, String contactpersonnumber, String companyname, String companyemail) {
		
		this.jobtitle = jobtitle;
		this.jobdescription = jobdescription;
		this.salary = salary;
		this.skills = skills;
		this.joblocation = joblocation;
		this.contactperson = contactperson;
		this.contactpersonnumber = contactpersonnumber;
		this.companyname = companyname;
		this.companyemail = companyemail;
	}
	public Jobs() {
		
		// TODO Auto-generated constructor stub
	}

}
