package user.vo;

import java.io.Serializable;
import java.sql.Date;

public class Users implements Serializable {
// -- ALL_USET AND QUIT_USER TABLE
	private String userId;
	private String commGrade;
	private String userName;
	private String gender;
	private Date birthday;
	private String email;
	private String address;
	private String phone;
	private Date Enroll_date;
	private int pointSum;
	private String resumeYNP;
	private Date quitDate;
	
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Users(String userId, String commGrade, String userName, String gender, Date birthday, String email,
			String address, String phone, Date enroll_date, int pointSum, String resumeYNP, Date quitDate) {
		super();
		this.userId = userId;
		this.commGrade = commGrade;
		this.userName = userName;
		this.gender = gender;
		this.birthday = birthday;
		this.email = email;
		this.address = address;
		this.phone = phone;
		Enroll_date = enroll_date;
		this.pointSum = pointSum;
		this.resumeYNP = resumeYNP;
		this.quitDate = quitDate;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getCommGrade() {
		return commGrade;
	}

	public void setCommGrade(String commGrade) {
		this.commGrade = commGrade;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Date getEnroll_date() {
		return Enroll_date;
	}

	public void setEnroll_date(Date enroll_date) {
		Enroll_date = enroll_date;
	}

	public int getPointSum() {
		return pointSum;
	}

	public void setPointSum(int pointSum) {
		this.pointSum = pointSum;
	}

	public String getResumeYNP() {
		return resumeYNP;
	}

	public void setResumeYNP(String resumeYNP) {
		this.resumeYNP = resumeYNP;
	}

	public Date getQuitDate() {
		return quitDate;
	}

	public void setQuitDate(Date quitDate) {
		this.quitDate = quitDate;
	}

	@Override
	public String toString() {
		return "Users [userId=" + userId + ", commGrade=" + commGrade + ", userName=" + userName + ", gender=" + gender
				+ ", birthday=" + birthday + ", email=" + email + ", address=" + address + ", phone=" + phone
				+ ", Enroll_date=" + Enroll_date + ", pointSum=" + pointSum + ", resumeYNP=" + resumeYNP + ", quitDate="
				+ quitDate + "]";
	}
	
	
	
	
	
	
}
