package co.com.mycompany.domain;

import org.junit.Assert;
import org.junit.Test;

public class PersonTest {

	private static final String A_NAME = "a name";
	private static final String A_LASTNAME = "a lastname";

	@Test
	public void createValid() {
		//Arrange
		Person person;
		//Act
		person = new Person(A_NAME,A_LASTNAME);
		//Assert
		Assert.assertEquals(person.getName(), A_NAME);
		Assert.assertEquals(person.getName(), A_LASTNAME);
	}
}
