package Table.SubClass.Mapping;

public class WeekdayStudent extends CurrentStudent {
private String qualification;
private String percentage;
private int yop;
public WeekdayStudent(){}
public WeekdayStudent(String sname,String city,String status,double totalfee,double feebal,String timings,String branch,
		String qualification, String percentage,int yop){
	super(sname,city,status,totalfee,feebal,timings,branch);
	this.qualification=qualification;
	this.percentage=percentage;
	this.yop=yop;
}

public WeekdayStudent(String qualification, String percentage, int yop) {
	this.qualification = qualification;
	this.percentage = percentage;
	this.yop = yop;
}
public WeekdayStudent(String percentage, int yop) {
	this.percentage = percentage;
	this.yop = yop;
}
public String getQualification() {
	return qualification;
}
public void setQualification(String qualification) {
	this.qualification = qualification;
}
public String getPercentage() {
	return percentage;
}
public void setPercentage(String percentage) {
	this.percentage = percentage;
}
public int getYop() {
	return yop;
}
public void setYop(int yop) {
	this.yop = yop;
}
public String toString(){
	return super.toString()+","+qualification+","+percentage+","+yop;
}

}
