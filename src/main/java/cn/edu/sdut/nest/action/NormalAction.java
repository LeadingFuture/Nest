package cn.edu.sdut.nest.action;

import java.util.Calendar;
import java.util.Date;

import org.apache.log4j.Logger;

import com.opensymphony.xwork2.Action;

public class NormalAction {
	
	Logger log=Logger.getLogger(MemberAction.class);
	private Date startDate=new Date();
	private long passedDays;
	
	public String passedDays(){
//		Calendar c=Calendar.getInstance();
//		c.setTime(startDate);
//		c.add(Calendar.DAY_OF_YEAR, -100);
//		startDate=c.getTime();
//		passedDays = (new Date().getTime()-startDate.getTime()) / (1000 * 60 * 60 * 24);
//		log.info("已过天数: "+passedDays);
		return Action.SUCCESS;
	}


	public Date getStartDate() {
		return startDate;
	}


	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}


	public long getPassedDays() {
		return passedDays;
	}


	public void setPassedDays(long passedDays) {
		this.passedDays = passedDays;
	}
	
}
