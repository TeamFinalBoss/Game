package coordinatorTest;

import static org.easymock.EasyMock.createNiceMock;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import util.Observer;
import coordinators.CoordinatorScheduler;
import coordinators.CoordinatorType;

public class CoordinatorSchedulerTest {
	
	private CoordinatorScheduler coordinatorScheduler = CoordinatorScheduler.getInstance();
	private Observer observer;
	
	@Before
	public void init() {
		observer = createNiceMock(Observer.class);
	}
	@Test
	public void testRegisteringObserver() {
		coordinatorScheduler.registerObserver(observer);
		assertEquals(1, coordinatorScheduler.getObservers().size());
		coordinatorScheduler.unregisterObserver(observer);
	}
	
	@Test
	public void testUnRegisteringObserver() {
		coordinatorScheduler.registerObserver(observer);
		assertEquals(1, coordinatorScheduler.getObservers().size());
		coordinatorScheduler.unregisterObserver(observer);
		assertEquals(0, coordinatorScheduler.getObservers().size());
	}
	
	@Test
	public void testChangingCoordinatorTypeGame() {
		coordinatorScheduler.changeCoordinator(CoordinatorType.GAME);
		assertEquals(CoordinatorType.GAME, coordinatorScheduler.getCoordinatorType());
	}
	
	@Test 
	public void testChangingCoordinatorTypeMenu() {
		coordinatorScheduler.changeCoordinator(CoordinatorType.MENU);
		assertEquals(CoordinatorType.MENU, coordinatorScheduler.getCoordinatorType());
	}
	
	@Test 
	public void testChangingCoordinatorTypeInventory() {
		coordinatorScheduler.changeCoordinator(CoordinatorType.INVENTORY);
		assertEquals(CoordinatorType.INVENTORY, coordinatorScheduler.getCoordinatorType());
	}
	
	@Test
	public void testSchedulerAsSingleton() {
		assertEquals(coordinatorScheduler, CoordinatorScheduler.getInstance());
	}
	
	

}
