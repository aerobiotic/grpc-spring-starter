package org.jxfs.grpcstarter;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.jxfs.config.ServiceIntegrationTestConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
@ActiveProfiles("test")
@SpringJUnitConfig(classes = { ServiceIntegrationTestConfiguration.class })
@DirtiesContext
class GrpcStarterApplicationTests {
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		log.info("tearDownAfterClass");
	}


	@Test
	@DirtiesContext
	void contextLoads() {
	}

}
