package vo;

public class StudentVO {
	private String studentid;
	private String college;
	private String name;
	private int complete;
	private String major;
	
	public String getStudentid() {
		return studentid;
	}
	public String getCollege() {
		return college;
	}
	public String getName() {
		return name;
	}
	public int getComplete() {
		return complete;
	}
	public String getMajor() {
		return major;
	}
	public void setStudent_id(String studentid) {
		this.studentid = studentid;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setComplete(int complete) {
		this.complete = complete;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
}
