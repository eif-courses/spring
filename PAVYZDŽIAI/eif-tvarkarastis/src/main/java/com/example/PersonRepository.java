package com.example;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by Marius on 2/10/2017.
 */

@RepositoryRestResource
interface PersonRepository extends CrudRepository<Person, Long>{
}
