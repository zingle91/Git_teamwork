package vo;

public class SubjectVO {
	private String subjectId; //학수번호
	private String subject; //과목명
	private int grade; //학점
	private String professor; //교수
	private String place; //장소 
	private String startTime; //시작시간
	private String endTime; //종료시간
	private String division; //구분 (교양,전공..)
	private int total; //정원 
	private int applyNum; //신청인원
	private String major; //학과
	private int openSemester;//개설학기
	
	
	public String getSubjectId() {
		return subjectId;
	}
	public String getSubject() {
		return subject;
	}
	public int getGrade() {
		return grade;
	}
	public String getProfessor() {
		return professor;
	}
	public String getPlace() {
		return place;
	}
	public String getStartTime() {
		return startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public String getDivision() {
		return division;
	}
	public int getTotal() {
		return total;
	}
	public int getApplyNum() {
		return applyNum;
	}
	public String getMajor() {
		return major;
	}
	public int getOpenSemester() {
		return openSemester;
	}
	public void setSubjectId(String subjectId) {
		this.subjectId = subjectId;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public void setProfessor(String professor) {
		this.professor = professor;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public void setDivision(String division) {
		this.division = division;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public void setApplyNum(int applyNum) {
		this.applyNum = applyNum;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public void setOpenSemester(int openSemester) {
		this.openSemester = openSemester;
	}
	
	
	
}
