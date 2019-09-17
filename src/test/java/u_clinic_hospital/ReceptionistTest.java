package u_clinic_hospital;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReceptionistTest {
	
	@Test
	public void receptionistToStringShouldReferToReceptionistName() {
		Receptionist underTest = new Receptionist("John Wayne");
		assertEquals("Receptionist: John Wayne", underTest.toString());
	}
	
	@Test
	public void testingGetNameOfReceptionist() {
		Receptionist underTest = new Receptionist("Arnold Schwarzenegger");
		String recepName = underTest.getName();
		assertEquals("Arnold Schwarzenegger", recepName);
	}
	
	@Test
	public void testSetGetEmployeeNumberOfReceptionist() {
		String receptionistNameExpected = "Arnold Schwarzenegger";
		int employeeNumberExpected = 16;

		Receptionist underTest = new Receptionist( receptionistNameExpected );
		underTest.setEmployeeNumber( employeeNumberExpected );
		int result = underTest.getEmployeeNumber();

		assertEquals(employeeNumberExpected, result);
	
//				Receptionist underTest = new Receptionist("Arnold Schwarzenegger");
//				underTest.setEmployeeNumber(14);
//				int result = underTest.getEmployeeNumber();
//				assertEquals(14, result);
	}

		
		
		
	}
	
