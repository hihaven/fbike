package dao.daoImpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import dao.BookDao;

public class BookDaoImpl implements BookDao{

	Configuration config = new Configuration().configure();
	SessionFactory sf = config.buildSessionFactory();
	Session session = sf.openSession();
	
	
	@Override
	public List findAllBookType() {

		String hql = "from BookType";
		Transaction transaction = session.beginTransaction();
		Query query = session.createQuery(hql);
		List list = query.list();
		transaction.commit();
		session.close();
		
		return list;
	}

	@Override
	public List findByType(String type) {
		String hql = "from Book b where b.type like ?";
		Transaction ts = session.beginTransaction();
		Query query = session.createQuery(hql);
		query.setParameter(0, type);
		List list= query.list();
		ts.commit();
		session.close();
		return list;
	}
}
