package JobPortal.Bean;

public class TotalAppliedCandidates {
	private String CompanyName;
	private String JobTitle;
	private String Email;
	private String FullName;
	private String MobileNo;
	private String Skills;
	private String Applied;
	private String Approved;
	private String Id;
	public String getCompanyName() {
		return CompanyName;
	}
	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}
	public String getJobTitle() {
		return JobTitle;
	}
	public void setJobTitle(String jobTitle) {
		JobTitle = jobTitle;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getFullName() {
		return FullName;
	}
	public void setFullName(String fullName) {
		FullName = fullName;
	}
	public String getMobileNo() {
		return MobileNo;
	}
	public void setMobileNo(String mobileNo) {
		MobileNo = mobileNo;
	}
	public String getSkills() {
		return Skills;
	}
	public void setSkills(String skills) {
		Skills = skills;
	}
	public String getApplied() {
		return Applied;
	}
	public void setApplied(String applied) {
		Applied = applied;
	}
	public String getApproved() {
		return Approved;
	}
	public void setApproved(String approved) {
		Approved = approved;
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public TotalAppliedCandidates(String companyName, String jobTitle, String email, String fullName, String mobileNo,
			String skills, String applied, String approved, String id) {
		super();
		CompanyName = companyName;
		JobTitle = jobTitle;
		Email = email;
		FullName = fullName;
		MobileNo = mobileNo;
		Skills = skills;
		Applied = applied;
		Approved = approved;
		Id = id;
	}
	public TotalAppliedCandidates() {
		
	}
	@Override
	public String toString() {
		return "TotalAppliedCandidates [" + (CompanyName != null ? "CompanyName=" + CompanyName + ", " : "")
				+ (JobTitle != null ? "JobTitle=" + JobTitle + ", " : "")
				+ (Email != null ? "Email=" + Email + ", " : "")
				+ (FullName != null ? "FullName=" + FullName + ", " : "")
				+ (MobileNo != null ? "MobileNo=" + MobileNo + ", " : "")
				+ (Skills != null ? "Skills=" + Skills + ", " : "")
				+ (Applied != null ? "Applied=" + Applied + ", " : "")
				+ (Approved != null ? "Approved=" + Approved + ", " : "") + (Id != null ? "Id=" + Id : "") + "]";
	}
	
}
