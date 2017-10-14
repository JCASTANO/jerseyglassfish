package co.com.mycompany.domain;

import org.junit.Assert;
import org.junit.Test;

public class PersonTest {

	private static final String A_NAME = "a name";

	@Test
	public void createValid() {
		//Arrange
		Person person;
		//Act
		person = new Person(A_NAME);
		//Assert
		Assert.assertEquals(person.getName(), A_NAME);
	}
}
