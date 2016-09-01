package local.sia._7SpringMVC.test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.mockito.Mockito.*;
import org.junit.Test;

import local.sia._7SpringMVC.controller.HomeController;
import local.sia._7SpringMVC.domain.Spittle;
import local.sia._7SpringMVC.service.SpitterService;
import local.sia.publicclass.ClassContainStatic;

public class HomeControllerTest {
	
	private Set<Spittle> expectedSpittles;

	@Test
	public void shouldDisplayRecentSpittles() {
		expectedSpittles = new HashSet<>();
		expectedSpittles.add(new Spittle());
		expectedSpittles.add(new Spittle());
		expectedSpittles.add(new Spittle());
		SpitterService spitterService = mock(SpitterService.class);
		when(spitterService.getRecentSpittles(ClassContainStatic.DEFAULT_SPITTLES_PER_PAGE)).thenReturn(expectedSpittles);
		HomeController controller = new HomeController(spitterService);
		HashMap<String, Object> model = new HashMap<String, Object>();
		
		String viewName = controller.showHomepage(model);
		assertEquals("home", viewName);
		assertSame(expectedSpittles, model.get("spittles"));
		verify(spitterService).getRecentSpittles(ClassContainStatic.DEFAULT_SPITTLES_PER_PAGE);
		
	}
	
}
