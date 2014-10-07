package cn.edu.sdut.nest.action;

import java.util.List;

import org.apache.log4j.Logger;

import com.opensymphony.xwork2.Action;

import cn.edu.sdut.nest.model.Member;
import cn.edu.sdut.nest.service.MemberService;

public class MemberAction {
	Logger log=Logger.getLogger(MemberAction.class);
	
	private MemberService memberService;
	private List<Member> members;
	private Member member;
	private Integer memberId;
	
	private String message="用户列表";
	
	public String execute(){
		members=memberService.findAll();
		if(memberId!=null){
			member=memberService.find(memberId);
		}
		return Action.SUCCESS;
	}
	public String save(){
		memberService.save(member);
		return Action.SUCCESS;
	}
	public String remove(){
		memberService.remove(memberId);
		return Action.SUCCESS;
	}

	public List<Member> getMembers() {
		return members;
	}

	public void setMembers(List<Member> members) {
		this.members = members;
	}

	public MemberService getMemberService() {
		return memberService;
	}

	public void setMemberService(MemberService memberService) {
		this.memberService = memberService;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	public Member getMember() {
		return member;
	}
	public void setMember(Member member) {
		this.member = member;
	}
	public Integer getMemberId() {
		return memberId;
	}
	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}
	

}
