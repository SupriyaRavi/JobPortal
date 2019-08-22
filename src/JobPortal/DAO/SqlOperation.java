package JobPortal.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import JobPortal.Bean.Company;
import JobPortal.Bean.Employee;
import JobPortal.Bean.Jobs;
import JobPortal.Bean.TotalAppliedCandidates;
import JobPortal.SqlConnect.DBConnector;

public class SqlOperation {
	
	static Connection con=null;
	public boolean validateUser(String username,String password) {
		
		con=DBConnector.dbConnector();
		try {
			String query = "select * from employee where mail=? and Password=?";
			PreparedStatement st = con.prepareStatement(query);
			st.setString(1,username);
			st.setString(2, password);
			ResultSet rs = st.executeQuery();
				if (rs.next()) 
				{return true;}
			} 
		catch (Exception e){System.out.println(e);}
		return false;
	}
	
	
	public int addUser(String mail,String fname,String lname,String mobilenum,String username,String password, String gender,String technicalskills, String currentrole,String company,String experience) {
		try {
		con=DBConnector.dbConnector();
		String query="insert into employee values(?,?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement st = con.prepareStatement(query);
        st.setString(1, mail);
        st.setString(2, fname);
        st.setString(3, lname);
        st.setString(4, mobilenum);
        st.setString(5, username);
        st.setString(6, password);
        st.setString(7, gender);
        st.setString(8, technicalskills);
        st.setString(9, currentrole);
        st.setString(10, company);
        st.setString(11, experience);
        int flag=st.executeUpdate();
System.out.println("Registration Successful");
return flag;
		} 
		catch (Exception e){System.out.println(e);}
		return 0;	
	
}
	
	public int addCompany(String Cname, String Email,String Password, String Website,String ContactPerson,String ContactPersonNumber) {
		
		try {
			con=DBConnector.dbConnector();
			String query="insert into company values(?,?,?,?,?,?)";
			PreparedStatement st=con.prepareStatement(query);
			st.setString(1, Cname);
			st.setString(2, Email);
			st.setString(3, Password);
			st.setString(4, Website);
			st.setString(5, ContactPerson);
			st.setString(6, ContactPersonNumber);
			   int flag=	 st.executeUpdate();
			 System.out.println("Registration Successful");
			 return flag;
			 		} 
			 		catch (Exception e){System.out.println(e);
			 		}
			 		return 0;	
			 	
			 }


public boolean validateCompany(String email,String Password) {
	con=DBConnector.dbConnector();
	System.out.println("company");
		try {
			String query = "select * from company where Email=? and Password=?";
			PreparedStatement st = con.prepareStatement(query);
			st.setString(1,email);
			st.setString(2, Password);
			ResultSet rs = st.executeQuery();
				if (rs.next()) 
					
				{System.out.println("true");
					return true;
				  
				}
			} 
		catch (Exception e){System.out.println(e);}
		return false;
	}



public int addJob(String jobtitle, String jobdescription, String salary, String skills, String joblocation,
		String contactperson, String contactpersonnumber, String companyname, String companyemail) {

	try {
		con=DBConnector.dbConnector();
		String query="insert into jobs values(?,?,?,?,?,?,?,?,?)";
		PreparedStatement st=con.prepareStatement(query);
		st.setString(1,jobtitle);
		st.setString(2,jobdescription);
		st.setString(3,salary);
		st.setString(4,skills);
		st.setString(5,joblocation);
		st.setString(6,contactperson);
		st.setString(7,contactpersonnumber);
		st.setString(8,companyname);
		st.setString(9,companyemail);


		
		   int flag=	 st.executeUpdate();
		   System.out.println(flag);
		 System.out.println("job Successful");
		 return flag;
		 		} 
		 		catch (Exception e){System.out.println(e);
		 		}
	
	return 0;
}



public static List<Jobs> list() throws SQLException {
	List<Jobs> jobs = new ArrayList<Jobs>();
	try {
		con=DBConnector.dbConnector();
		Statement statement = con.createStatement();
		ResultSet resultSet = statement.executeQuery("select * from jobs");

		while (resultSet.next()) {
			Jobs j = new Jobs();
			// Example :: j.setLocation(resultSet.getString("Location"));
			j.setJobtitle(resultSet.getString("jobtitle"));
            j.setJobdescription(resultSet.getString("jobdescription"));
			j.setSalary(resultSet.getString("salary"));
			j.setSkills(resultSet.getString("skills"));
			j.setJoblocation(resultSet.getString("joblocation"));
			j.setContactperson(resultSet.getString("contactperson"));
			j.setContactpersonnumber(resultSet.getString("contactpersonnumber"));
			j.setCompanyname(resultSet.getString("companyname"));
			j.setCompanyemail(resultSet.getString("companyemail"));
			System.out.println(j);
			jobs.add(j);
			
		}
		return jobs;
	} catch (Exception e) {System.out.println(e);}
	return null;
}


public int addUserToJob(String companyName, String jobtitle, String mail, String fullName, String mobileNo,
		String skills) {
	
	con=DBConnector.dbConnector();
	String query="insert into AppliedJobs values(?,?,?,?,?,?,?,?)";
	PreparedStatement st;
	try {
		st = con.prepareStatement(query);
		String Applied="Yes";
		String Approved="NO";
		st.setString(1, companyName);
		st.setString(2, jobtitle);
		st.setString(3, mail);
		st.setString(4, fullName);
		st.setString(5, mobileNo);
		st.setString(6, skills);
		st.setString(7, Applied);
		st.setString(8, Approved);
		int i = st.executeUpdate();
		return i;
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return 0;
}

public static  Employee fetchEmployee(String mail) {
	con=DBConnector.dbConnector();
	String query="select * from employee where mail=?";
	System.out.println("mail from dao "+mail);
	
	
	try {
		PreparedStatement	st = con.prepareStatement(query);
		st.setString(1, mail);
		ResultSet rs =st.executeQuery();
		while(rs.next()) {
			Employee emp=new Employee();
			emp.setEmail(rs.getString("mail"));
			emp.setFname(rs.getString("fname"));
			emp.setLname(rs.getString("lname"));
			emp.setMobilenum(rs.getString("mobilenum"));
			emp.setUsername(rs.getString("username"));
			emp.setPassword(rs.getString("password"));
			emp.setGender(rs.getString("gender"));
			emp.setTechnicalskills(rs.getString("technicalskills"));
			emp.setCurrentrole(rs.getString("currentrole"));
			emp.setCompany(rs.getString("company"));
			emp.setExperience(rs.getString("experience"));
			System.out.println("from DAO :: "+emp);
		return emp;
		}
	} catch (SQLException e) {e.printStackTrace();}
	
	return null;
	
}
public static  Company fetchCompany(String mail) {
	con=DBConnector.dbConnector();
	String query="select * from company where email=?";
	System.out.println("email from dao "+mail);
	
	
	try {
		PreparedStatement	st = con.prepareStatement(query);
		st.setString(1, mail);
		ResultSet rs =st.executeQuery();
		while(rs.next()) {
			Company c=new Company();
			c.setCname(rs.getString("Cname"));
			c.setEmail(rs.getString("Email"));
			c.setPassword(rs.getString("Password"));
			c.setContactPerson(rs.getString("ContactPerson"));
			c.setContactPersonNumber(rs.getString("ContactPersonNumber"));
			c.setWebsite(rs.getString("Website"));
			System.out.println("from DAO :: "+c);
		return c;
		}
	} catch (SQLException e) {e.printStackTrace();}
	return null;
	
}
public int UpdateCompanyValue(String mail, String cname, String password, String website, String contactPerson, String contactPersonNumber) {
	try {
		con=DBConnector.dbConnector();
		String query="update company SET Cname=?,Password=?,Website=?,ContactPerson=?,ContactPersonNumber=? where Email=?";
		PreparedStatement st=con.prepareStatement(query);
		st.setString(1, cname);
		st.setString(2, password);
		st.setString(3, website);
		st.setString(4, contactPerson);
		st.setString(5, contactPersonNumber);
		st.setString(6, mail);
		   int flag=st.executeUpdate();
		 System.out.println("Updation Successful");
		 return flag;
		 		} 
		 		catch (Exception e){System.out.println(e);
		 		}
	return 0;
	
}


public int updateUserValue(String mail, String fname, String lname, String mobilenum, String username, String password,
		String gender, String technicalskills, String currentrole, String company, String experience) {
	try {
		con=DBConnector.dbConnector();
		String query="update employee SET fname=?,lname=?,mobilenum=?,username=?,password=?,gender=?,technicalskills=?,currentrole=?,company=?,experience=? where mail=?";
		PreparedStatement st = con.prepareStatement(query);
       
        st.setString(1, fname);
        st.setString(2, lname);
        st.setString(3, mobilenum);
        st.setString(4, username);
        st.setString(5, password);
        st.setString(6, gender);
        st.setString(7, technicalskills);
        st.setString(8, currentrole);
        st.setString(9, company);
        st.setString(10, experience);
        st.setString(11, mail);
        int flag=st.executeUpdate();
System.out.println("Updation Successful");
return flag;
		} 
		catch (Exception e){System.out.println(e);}
	
	
	return 0;
}


public static List<TotalAppliedCandidates> appliedJobs() {
	List<TotalAppliedCandidates> TA = new ArrayList<TotalAppliedCandidates>();
	try {
		con = DBConnector.dbConnector();
		Statement statement = con.createStatement();
		ResultSet resultSet = statement.executeQuery("select * from appliedjobs");

		while (resultSet.next()) {
			TotalAppliedCandidates t = new TotalAppliedCandidates();
			t.setCompanyName(resultSet.getString("companyName"));
			t.setJobTitle(resultSet.getString("jobtitle"));
			t.setEmail(resultSet.getString("email"));
			t.setFullName(resultSet.getString("fullName"));
			t.setMobileNo(resultSet.getString("mobileNo"));
			t.setSkills(resultSet.getString("skills"));
			t.setApplied(resultSet.getString("Applied"));
			t.setApproved(resultSet.getString("Approved"));
			//t.setId(resultSet.getString("jobId"));
			System.out.println(t);
		    TA.add(t);
		}
	   return TA;
	} catch (Exception e) {System.out.println(e);}
	return null;
}
public   int updateApprove(String jtitle,String Company) {
	try {
		con=DBConnector.dbConnector();
		String Query="UPDATE appliedjobs SET Approved =? where jobtitle=? and companyName=? ";
	    String approve="yes";
		PreparedStatement st = con.prepareStatement(Query);
		st.setString(1, approve);
		st.setString(2, jtitle);
		st.setString(3, Company);
		int i = st.executeUpdate();
		return i;
	}
 catch (Exception e) {System.out.println(e);}
	return 0;
	}

public static int ProfileCompleteStatusUser(String mail) {
	int count=0;
	String query="select * from employee where mail=?";
	try {
		PreparedStatement	st = con.prepareStatement(query);
		st.setString(1, mail);
		ResultSet rs =st.executeQuery();
		while(rs.next()) {
			Employee emp=new Employee();
			emp.setEmail(rs.getString("mail"));
			emp.setFname(rs.getString("fname"));
			emp.setLname(rs.getString("lname"));
			emp.setMobilenum(rs.getString("mobilenum"));
			emp.setUsername(rs.getString("username"));
			emp.setPassword(rs.getString("password"));
			emp.setGender(rs.getString("gender"));
			emp.setTechnicalskills(rs.getString("technicalskills"));
			emp.setCurrentrole(rs.getString("currentrole"));
			emp.setCompany(rs.getString("company"));
			emp.setExperience(rs.getString("experience"));
			System.out.println("from DAO :: "+emp);
			count=computeUser(emp);
		return count;
		}
	
	}
	 catch (Exception e) {System.out.println(e);}
	return 0;
	
}


private static int computeUser(Employee emp) {
	int count=0;
	if(emp.getFname()!=null) {
		count++;
		if(emp.getLname()!=null) {
			count++;
			if(emp.getMobilenum()!=null) {
				count++;
				if(emp.getUsername()!=null) {
					count++;
					if(emp.getGender()!=null) {
						count++;
						if(emp.getTechnicalskills()!=null) {
							count++;
							if(emp.getCurrentrole()!=null) {
								count++;
								if(emp.getCompany()!=null) {
									count++;
									if(emp.getExperience()!=null)
									{
										count++;
										return count;
									}
									return count;
								}
								return count;
							}
							return count;
						}
						return count;
					}
					return count;
				}
				return count;
			}
			return count;
		}
		return count;
	}
	return 0;
}
}
