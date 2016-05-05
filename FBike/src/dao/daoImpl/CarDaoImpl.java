package dao.daoImpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Car;
import dao.CarDao;

public class CarDaoImpl implements CarDao{
	
	@Override
	public void save(Car car) {
		
		Configuration config = new Configuration().configure();
		SessionFactory sessionFactroty = config.buildSessionFactory();
		Session session = sessionFactroty.openSession();
		
		Transaction transaction = session.beginTransaction();
		session.save(car);
		transaction.commit();
		session.close();
	}

}
