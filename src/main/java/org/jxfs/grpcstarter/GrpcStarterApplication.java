package org.jxfs.grpcstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "org.jxfs.grpcstarter","org.jxfs.stackover2" })
public class GrpcStarterApplication {

	public static void main(String[] args) {
		SpringApplication.run(GrpcStarterApplication.class, args);
	}

}
