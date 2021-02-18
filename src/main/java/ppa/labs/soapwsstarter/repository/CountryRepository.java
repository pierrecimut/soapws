package ppa.labs.soapwsstarter.repository;

import org.springframework.stereotype.Component;
import ppa.labs.soapwsstarter.bean.Country;

import javax.annotation.PostConstruct;
import java.util.HashMap;

@Component
public class CountryRepository {
	private static final Map<String, Country> countries = new HashMap<>();

	@PostConstruct
	public void initData() {
		// initialize countries map
	}

	public Country findCountry(String name) {
		return countries.get(name);
	}
}
