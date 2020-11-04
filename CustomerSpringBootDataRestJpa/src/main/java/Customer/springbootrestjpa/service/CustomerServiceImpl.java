package Customer.springbootrestjpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import Customer.springbootrestjpa.dao.ICustomerRepository;
import Customer.springbootrestjpa.entities.Customer;

@Service
@Transactional
public class CustomerServiceImpl implements ICustomerService {

	@Autowired
	private ICustomerRepository customerDao;

	@Override
	public Customer register(Customer customer) {
		Customer bhura = customerDao.save(customer);
		return bhura;
	}

	@Override
	public Customer update(Customer customer) {
		Customer bhura = customerDao.save(customer);
		return bhura;
	}

	@Override
	public List<Customer> findAll() {
		List<Customer> customers = (List<Customer>) customerDao.findAll();
		return customers;
	}

}
