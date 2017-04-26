package com.sprintetest;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.Matchers.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringTestApplicationTests {

	@Autowired
	private PrintController printController;

	@Test
	public void contextLoads() {
		String fullName = printController.printFullName();

		Assert.assertThat(fullName, is("MarekLewandowski"));
	}
}
