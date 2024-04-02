package org.team4.unit.maintaindb;

import static org.junit.Assert.*;

import org.junit.*;
import org.team4.maintaindb.MaintainRequests;
import org.team4.model.items.BookRequest;

public class MaintainRequestsTest {
	
	MaintainRequests requestMaintainer;
	
	@Before
	public void setUp() {
		requestMaintainer = MaintainRequests.getInstance();
	}
	
	@Test
	public void requestHighList() {
		assertFalse(requestMaintainer.getHighPriorityRequests().isEmpty());
	}
	
	@Test
	public void requestLowList() {
		assertFalse(requestMaintainer.getLowPriorityRequests().isEmpty());
	}
	
	@Test
	public void numberHigh() {
		assertEquals(3, requestMaintainer.getHighPriorityRequests().size());
	}
	
	@Test
	public void numberLow() {
		assertEquals(1, requestMaintainer.getLowPriorityRequests().size());
	}
	
	@Test
	public void update() throws Exception {
		requestMaintainer.update();
	}
	
	@Test
	public void addExistingRequest() {
		BookRequest req = new BookRequest("1", "Title", "Author", "1234567890", 1, "TextBook");
		requestMaintainer.addRequest(req);
	}
	
	@Test
	public void addTextBookRequest() throws Exception {
		int highRequests = requestMaintainer.getHighPriorityRequests().size();
		BookRequest req = new BookRequest("1", "Title", "Author", "1234567894", 1, "TextBook");
		requestMaintainer.addRequest(req);
		assertEquals(highRequests + 1, requestMaintainer.getHighPriorityRequests().size());
		
		// Clean CSV
		requestMaintainer.getHighPriorityRequests().remove(highRequests);
		requestMaintainer.update();
	}
	
	@Test
	public void addBookRequest() throws Exception {
		int lowRequests = requestMaintainer.getLowPriorityRequests().size();
		BookRequest req = new BookRequest("1", "Title", "Author", "1234567894", 1, "General Book");
		requestMaintainer.addRequest(req);
		assertEquals(lowRequests + 1, requestMaintainer.getLowPriorityRequests().size());
		
		// Clean CSV
		requestMaintainer.getLowPriorityRequests().remove(lowRequests);
		requestMaintainer.update();
	}

}