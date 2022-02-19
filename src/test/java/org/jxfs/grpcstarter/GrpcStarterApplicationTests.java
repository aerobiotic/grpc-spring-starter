package org.jxfs.grpcstarter;

import java.util.concurrent.CountDownLatch;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.jxfs.stackover2.StockStaticDataRequestService;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ActiveProfiles;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import lombok.extern.slf4j.Slf4j;

@SpringBootTest(classes = GrpcStarterApplication.class)
@Slf4j
@ActiveProfiles("test")
@TestInstance(Lifecycle.PER_CLASS)
@DirtiesContext
class GrpcStarterApplicationTests {
	private static Server server;
	private static Thread serverThread;
	
	private static CountDownLatch latch;
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
//		latch = new CountDownLatch(1);
//		server = ServerBuilder
//	            .forPort(-1)
//	            .addService(new StockStaticDataRequestService())
//	            .build();
//	        server.start();
//	        serverThread = new Thread(() -> {
//	            try {
//	                server.awaitTermination();
//	            } catch (final InterruptedException e) {
//	            	log.error("", e);
//	            	latch.countDown();
//	                Thread.currentThread().interrupt();
//	            }
//	        });
//	        serverThread.setDaemon(false);
//	        serverThread.start();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		log.info("tearDownAfterClass");
////		 channel.shutdown();
//		  server.shutdown();
//		  //channel.awaitTermination(1, TimeUnit.SECONDS);
//		  server.awaitTermination();
////		server.shutdownNow();
//		serverThread.interrupt();
//		boolean gotToZero = latch.await(30, TimeUnit.SECONDS);
//		if (gotToZero) {
//			log.info("good server was stopped");
//		} else {
//			log.error("server was not stopped");
//		}
	}


	@Test
	void contextLoads() {
	}

}
