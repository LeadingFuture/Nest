package cn.edu.sdut.nest.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="member")
public class Member {

	@Id
	@GeneratedValue
    private Integer id;
	
	@Column(name="username")
    private String userName;
	
	@Column(name="sex")
	private String sex; 
	
	@Column(name="start_day")
	private Date startDate;
	
	@OneToOne
	@JoinColumn(name="lover_id")
	private Member lover;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String username) {
        this.userName = username;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    @Transient
    public String getPassedDays(){
		long passedDays = (new Date().getTime()-startDate.getTime()) / (1000 * 60 * 60 * 24);
    	return passedDays+"";
    }

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		System.out.println(">>>>>>>>>>>>>>>>"+sex);
		this.sex = sex;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Member getLover() {
		return lover;
	}

	public void setLover(Member lover) {
		this.lover = lover;
	}
}
