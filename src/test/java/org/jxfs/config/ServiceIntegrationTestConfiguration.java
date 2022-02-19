
package org.jxfs.config;

import org.jxfs.grpcstarter.GrpcStarterApplication;
import org.jxfs.stackover2.StockStaticDataRequestService;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import net.devh.boot.grpc.client.autoconfigure.GrpcClientAutoConfiguration;
import net.devh.boot.grpc.server.autoconfigure.GrpcServerAutoConfiguration;
import net.devh.boot.grpc.server.autoconfigure.GrpcServerFactoryAutoConfiguration;

@Configuration
@ImportAutoConfiguration({ GrpcServerAutoConfiguration.class, // Create required server beans
		GrpcServerFactoryAutoConfiguration.class, // Select server implementation
		GrpcClientAutoConfiguration.class,
		GrpcStarterApplication.class})
public class ServiceIntegrationTestConfiguration {
//	@Bean(name = "stocks")
//	public StockStaticDataRequestService stockStaticDataRequestService() {
//		return new StockStaticDataRequestService();
//	}
}
