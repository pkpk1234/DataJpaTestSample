package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.*;

import java.util.List;


@RunWith(SpringRunner.class)
@DataJpaTest
public class DataJpaTestApplicationTests {

	@Autowired
	private PersonRepostroy personRepostroy;

	@Autowired
	private TestEntityManager testEntityManager;


	@Test
	public void test() {
		this.testEntityManager.persist(new Person("li2","jiaming2",33));
		List<Person> list = this.personRepostroy.findAll();
		list.stream().forEach(System.out::println);
		assertTrue("only one result",list.size() == 1);
	}

}
