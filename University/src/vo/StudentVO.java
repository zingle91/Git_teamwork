package vo;

public class StudentVO {
	private String student_id;
	private String college;
	private String name;
	private int complete;
	private String major;
	
	public String getStudent_id() {
		return student_id;
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
	public void setStudent_id(String student_id) {
		this.student_id = student_id;
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
