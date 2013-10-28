package cs.ut.domain.soap;

import static org.junit.Assert.*;

import org.junit.Test;

import cs.ut.domain.soap.client.PlantResource;
import cs.ut.domain.soap.client.PlantResourceList;
import cs.ut.domain.soap.client.PlantSOAPService;
import cs.ut.domain.soap.client.PlantSOAPServiceService;

public class PlantSOAPServiceTest {

	@Test
	public void test() {
		PlantResourceList actualPlantsList;
		PlantResource plant;
		PlantSOAPServiceService plantSOAPServiceService = new PlantSOAPServiceService();
		PlantSOAPService plantSOAPServicePort = plantSOAPServiceService.getPlantSOAPServicePort();
		actualPlantsList = plantSOAPServicePort.getAllPlants();
		
	}

}
