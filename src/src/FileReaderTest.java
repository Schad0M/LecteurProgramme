package src;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class FileReaderTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
	}

	@Test
	void lireProg() {
		FileReader a = new FileReader();
		assertEquals("Erreur lors de la lecture du fichier", a.lireProg(null), "ContenuDuFichierTEST");
	}
}
