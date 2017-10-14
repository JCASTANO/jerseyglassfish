package co.com.mycompany.repository;

import co.com.mycompany.domain.Person;

public class MysqlPersonRepository implements PersonRepository {

	@Override
	public Person find() {
		sleep();
		return new Person("juan esteban", "castaño rincón");
	}

	private void sleep() {
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
