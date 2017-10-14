package co.com.mycompany.repository;

import co.com.mycompany.domain.Person;

public class MysqlPersonRepository implements PersonRepository {

	@Override
	public Person find() {
		return new Person("juan esteban", "castaño rincón");
	}
}
