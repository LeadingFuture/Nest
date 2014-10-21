package cn.edu.sdut.nest.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;

import cn.edu.sdut.nest.service.MemberService;

public class LoginAction {
	private MemberService memberService;
	
	/**
	 * @TODO 取得session中数据
	 * @return
	 */
	public String auth(){
		ActionContext.getContext().getSession().put("currentMember", memberService.find(1));
		return Action.SUCCESS;
	}

	public MemberService getMemberService() {
		return memberService;
	}

	public void setMemberService(MemberService memberService) {
		this.memberService = memberService;
	}
}
