//Display and compare dates
import java.time.*;

public class Date {
	private int d,m,y;
	boolean flag;
	
	//Parameterized constructor to initialize date values
	public Date(int d,int m,int y)
	{
		this.d=d;
		this.m=m;
		this.y=y;
	}
	
	//Display a date
	@Override
	public String toString() {
		return("Date is "+d+"/"+m+"/"+y);
	}
	
	//Find the smaller one of two dates
	public boolean isSmaller(Date d) {
		if(this.y==d.y) {
			if(this.m==d.m) {
				if(this.d==d.d)
					flag=true;
				else if (this.d<d.d)
					flag=false;
				else
					flag=true;
			}
			else if(this.m<d.m)
				flag=false;
			else
				flag=true;
		}
		else if(this.y<d.y)
			flag=false;
		else
			flag=true;
		return flag;
	}

	//Find difference between two dates
	public int[] diff(Date d) {
		
		int[] dateDifference=new int[3];
		LocalDate date1,date2;
		Period diff = null;
		
		date1=LocalDate.of(this.y, this.m, this.d);
		date2=LocalDate.of(d.y, d.m, d.d);
		
		if(date1.getYear()==date2.getYear())
		{
			if(date1.getMonth()==date2.getMonth()) {
				if(date1.getDayOfYear()==date2.getDayOfYear())
					diff=Period.between(date1, date2);
				}
			else if(date1.getDayOfYear()>date2.getDayOfYear())
				diff=Period.between(date2, date1);
			else
				diff=Period.between(date1, date2);
		}
		else if(date1.getYear()>date2.getYear())
			diff=Period.between(date2, date1);
		else
			diff=Period.between(date1, date2);
		
		dateDifference[2]=diff.getYears();
		dateDifference[1]=diff.getMonths();
		dateDifference[0]=diff.getDays();
		
		return dateDifference;
	}
	//find the age of a person given the date of birth
	public int[] age() {
		
		int[] age=new int[3];
		LocalDate date1,date2=LocalDate.now();
		
		date1=LocalDate.of(this.y, this.m, this.d);
		Period diff=Period.between(date1, date2);
		
		age[2]=diff.getYears();
		age[1]=diff.getMonths();
		age[0]=diff.getDays();
		
		return age;	
	}
	
	//Getters for date,month and year values
	public int getD() {
		return d;
	}

	public int getM() {
		return m;
	}

	public int getY() {
		return y;
	}
}
	

