package io.transport_manager.springbootapplication.transport_manager;

import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.transportmanager.auth.TransportManagerApplication;

/**
 * The Class AbstractTest.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=TransportManagerApplication.class)
public class AbstractTest {
	
	/** The logger. */
	protected Logger logger=LoggerFactory.getLogger(this.getClass());

}
