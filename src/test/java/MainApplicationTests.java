import com.i.MainApplication;
import com.i.domain.mongo.MachineData;
import com.i.domain.mongo.MachineMongoRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = MainApplication.class)
@WebAppConfiguration
public class MainApplicationTests {

	@Autowired
	MachineMongoRepository machineMongoRepository;

	@Test
	public void contextLoads() {
		machineMongoRepository.save(new MachineData("name","model"));

	}

}
