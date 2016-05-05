package dao.daoImpl;

import java.util.Iterator;
import java.util.List;
import model.User;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import dao.UserDao;

public class UserDaoImpl implements UserDao{
	
	Configuration config = new Configuration().configure();
	SessionFactory sessionFactroty = config.buildSessionFactory();
	Session session = sessionFactroty.openSession();
	
	@Override
	public boolean exist(String name) {
		String hql = "from User u where u.userName like ?";
		
		Transaction transaction = session.beginTransaction();
		Query query = session.createQuery(hql);
		query.setParameter(0, name);
		List list = query.list();
		transaction.commit();
		session.close();
		
		if (list.size() > 0)
			return true;
		else
			return false;
	}
	
	//µÇÂ½
	@Override
	public boolean exist(String name, String pswd) {
		System.out.println(" "+name+" "+pswd);
		String hql = "from User u where u.UserName like ? and u.UserPwd like ?";
		Transaction transaction = session.beginTransaction();
		Query query = session.createQuery(hql);
		query.setParameter(0, name);
		query.setParameter(1, pswd);
		List list = query.list();
		transaction.commit();
		Iterator it=list.iterator();
		while(it.hasNext()){
			User u=(User)it.next();
			System.out.println("UserName:"+u.getUserName());
			System.out.println("UserPwd:"+u.getUserPwd());
		}
		session.close();
		if (list.size() > 0)
			return true;
		else
			return false;
	}

	@Override
	public void save(User user) {

		Transaction transaction = session.beginTransaction();
		session.save(user);
		transaction.commit();
		session.close();
	}

	@Override
	public boolean register(String yonghuming, String password, String useraddress, String userimage,
			int ueserrole) {
		System.out.println(" "+yonghuming+" ÃÜÂë£º  "+password);
		Transaction transaction = session.beginTransaction();
		User user=new User();
		user.setUserName(yonghuming);
		user.setUserPwd(password);
		user.setUserAddress(useraddress);
		user.setUserImage(userimage);
		user.setUserRole(ueserrole);
		session.save(user);
		user.getId();
		transaction.commit();
		session.close();
			return true;
	}	
	
}
