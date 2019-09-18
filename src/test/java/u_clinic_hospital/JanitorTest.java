package u_clinic_hospital;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import org.junit.Test;

public class JanitorTest {

	@Test
	public void janitorSalaryIsFortyK() throws Exception {
		Janitor underTest = new Janitor("Test Janitor");
		int testSalary = underTest.getSalary();
		assertThat(testSalary, is(40000));
	}

	@Test
	public void shouldBeSweeping() throws Exception {
		Janitor underTest = new Janitor("Busy Janitor");
		boolean isJanitorSweeping = underTest.getSweeping();
		assertThat(isJanitorSweeping, is(true));
	}

	@Test
	public void shouldNotBeSweeping() throws Exception {
		Janitor underTest = new Janitor("Lazy Janitor");
		underTest.setSweeping(false);
		boolean isJanitorSweeping = underTest.getSweeping();
		assertThat(isJanitorSweeping, is(false));
	}
}
