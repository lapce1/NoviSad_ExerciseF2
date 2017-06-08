import static org.junit.Assert.*;
import org.junit.Test;
import main.PlanetExplorer;
import main.PlanetExplorerException;

public class TestPlanetExplorer {

	@Test
	public void test_executeCommandF() throws PlanetExplorerException {
		PlanetExplorer pe = new PlanetExplorer(3,3,"");
		
		assertEquals("Lokacija je (1,0), N","(1, 0, N)",pe.executeCommand("f"));
	}
	
	@Test
	public void test_executeCommandR() throws PlanetExplorerException {
		PlanetExplorer pe = new PlanetExplorer(3,3,"");
		
		assertEquals("Lokacija je (0,0), E","(0, 0, E",pe.executeCommand("r"));
	}
}
