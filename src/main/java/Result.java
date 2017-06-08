import com.himal.school.model.Exam;
import com.himal.school.model.StudentKakshya;

public class Result {

	private Exam exam;
	private StudentKakshya student;
	private Double marksObtained;
	private String remarks;
	private boolean examAttended;
	public Exam getExam() {
		return exam;
	}
	public void setExam(Exam exam) {
		this.exam = exam;
	}
	public StudentKakshya getStudent() {
		return student;
	}
	public void setStudent(StudentKakshya student) {
		this.student = student;
	}
	public Double getMarksObtained() {
		return marksObtained;
	}
	public void setMarksObtained(Double marksObtained) {
		this.marksObtained = marksObtained;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public boolean isExamAttended() {
		return examAttended;
	}
	public void setExamAttended(boolean examAttended) {
		this.examAttended = examAttended;
	}
	
}
