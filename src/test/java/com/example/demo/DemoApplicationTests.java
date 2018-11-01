package com.example.demo;

import com.example.demo.spring.aop.service.IProductService;
import com.example.demo.spring.aop.util.UserHodler;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	private IProductService productService;
	@Test(expected = Exception.class)
	public void testInsert() {
		UserHodler.set("joy");
		productService.delete(1l);
	}

	@Test
	public void testInsert1(){
		UserHodler.set("admin");
		productService.delete(1l);
	}
}
