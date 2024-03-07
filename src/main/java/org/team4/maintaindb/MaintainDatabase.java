package org.team4.maintaindb;

public class MaintainDatabase {
	
	private static MaintainDatabase instance;
	private static MaintainUser userMaintainer;
	private static MaintainBooks bookMaintainer;
	
	private MaintainDatabase() {
		userMaintainer = new MaintainUser();
		bookMaintainer = new MaintainBooks();
	}
	
	public static MaintainDatabase getInstance() {
		if (instance == null) {
			// Extra check for Multi-threaded applications
			synchronized (MaintainDatabase.class) {
				if (instance == null) {
					instance = new MaintainDatabase();
				}
			}
		}
		
		return instance;
	}
	
	public void load() throws Exception {
		userMaintainer.load();
		bookMaintainer.load();
	}

}
