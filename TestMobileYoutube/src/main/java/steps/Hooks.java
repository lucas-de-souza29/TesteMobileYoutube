package steps;

import java.net.MalformedURLException;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import static utils.Utils.*;

public class Hooks {
	
	@Before
	public void setUp()throws MalformedURLException,InterruptedException{
		acessarApp();
	}

	@After
	public void fecharApp() {
		driver.quit();
	}

}
