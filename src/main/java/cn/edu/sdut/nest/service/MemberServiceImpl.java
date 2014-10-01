package cn.edu.sdut.nest.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.log4j.Logger;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import cn.edu.sdut.nest.model.Member;

@Transactional
public class MemberServiceImpl extends HibernateDaoSupport implements MemberService {

	Logger log=Logger.getLogger(MemberServiceImpl.class);
	
	@SuppressWarnings("unchecked")
	public List<Member> findAll() {
		List<Member> members=(List<Member>) getHibernateTemplate().find("select m from Member m");
		log.info("members.size : "+members.size());
		return members;
	}

	public void save(Member member) {

	}

	public void remove(int id) {

	}

	public Member find(int id) {
		return null;
	}

}
