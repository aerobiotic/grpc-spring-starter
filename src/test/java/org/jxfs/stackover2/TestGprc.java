
package org.jxfs.stackover2;

import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.jxfs.config.ServiceIntegrationTestConfiguration;
import org.jxfs.grpc.stackover2.api.StockStaticDataRequestServiceGrpc.StockStaticDataRequestServiceBlockingStub;
import org.jxfs.grpc.stackover2.api.StockStaticManyDataRequest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.client.inject.GrpcClient;

@Slf4j
@SpringBootTest
@ActiveProfiles("test")
@SpringJUnitConfig(classes = { ServiceIntegrationTestConfiguration.class })
@DirtiesContext
class TestGprc {
	@GrpcClient("stocks")
    private StockStaticDataRequestServiceBlockingStub stub;
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		log.info("setUpBeforeClass");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		log.info("tearDownAfterClass");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	@DirtiesContext
    void testClient() {
        StockStaticManyDataRequest request = StockStaticManyDataRequest.newBuilder()
            .addAllTickerSymbols(List.of("AAPL"))
            .build();
        stub.getManyStockStatics(request).forEachRemaining(security -> {
            log.info("security={}", security);
        });
	}
}
