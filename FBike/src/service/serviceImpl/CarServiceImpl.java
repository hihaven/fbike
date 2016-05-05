package service.serviceImpl;

import service.CarService;
import dao.CarDao;
import dao.daoImpl.CarDaoImpl;
import model.Car;

public class CarServiceImpl implements CarService{

	@Override
	public void save(Car car) {

		CarDao carDao = new CarDaoImpl();
		carDao.save(car);
	}

		
}
