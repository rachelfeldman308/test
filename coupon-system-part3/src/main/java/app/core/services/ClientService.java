package app.core.services;

import org.springframework.beans.factory.annotation.Autowired;

import app.core.auth.UserCredentials;
import app.core.exceptions.CouponSystemException;
import app.core.repositories.CompanyRepository;
import app.core.repositories.CouponRepository;
import app.core.repositories.CustomerRepository;

public abstract class ClientService {

	@Autowired
	protected CompanyRepository companyRepository;
	@Autowired
	protected CustomerRepository customerRepository;
	@Autowired
	protected CouponRepository couponRepository;

	public abstract String login(UserCredentials userCredentials) throws CouponSystemException;
}
