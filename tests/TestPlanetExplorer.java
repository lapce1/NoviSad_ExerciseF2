import static org.junit.Assert.*;
import org.junit.Test;
import main.PlanetExplorer;
import main.PlanetExplorerException;

public class TestPlanetExplorer {

	@Test
	public void test_executeCommand() throws PlanetExplorerException {
		PlanetExplorer pe = new PlanetExplorer(3,3,"");
		pe.executeCommand("f");
		
		assertEquals("Lokacija je (1,0), N","(1, 0, N)",pe.executeCommand("f"));
	}
}
