package co.com.mycompany.repository;

import co.com.mycompany.domain.Person;

public interface PersonRepository {

   /**
    * Allows find a person
    * @return
    */
   Person find();
}
