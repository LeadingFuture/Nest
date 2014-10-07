package cn.edu.sdut.nest.service;

import java.util.List;

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
//		getHibernateTemplate().getSessionFactory().getCurrentSession().setFlushMode(FlushMode.AUTO);
		getHibernateTemplate().merge(member);
		getHibernateTemplate().flush();
	}

	public void remove(int id) {
		getHibernateTemplate().delete(find(id));
		getHibernateTemplate().flush();
	}

	public Member find(int id) {
		return getHibernateTemplate().get(Member.class,id);
	}

}
