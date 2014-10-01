package cn.edu.sdut.nest.service;

import java.util.List;

import cn.edu.sdut.nest.model.Member;

public interface MemberService {
	
	public List<Member> findAll();

    public void save(Member member);

    public void remove(int id);

    public Member find(int id);
	
}