package com.dqiang.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author StemQ
 * @version v1.0
 * Blog:http://blog.csdn.net/stemq
 * Web:www.dqiang.com
 */
@SpringBootApplication
@RestController
public class Application {
	@RequestMapping("/")
	public String greeting() {
		return "勒布朗·詹姆斯 洛杉矶湖人队";
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
