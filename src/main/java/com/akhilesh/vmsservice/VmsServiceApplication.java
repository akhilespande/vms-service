package com.akhilesh.vmsservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author akhilesh pandey(akhilespande@gmail.com)
 */
@Slf4j
@SpringBootApplication
public class VmsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(VmsServiceApplication.class, args);
		log.info("Running version : [{}]",
				VmsServiceApplication.class.getPackage().getImplementationVersion());
	}
}
