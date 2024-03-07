package org.team4.maintaindb;

public class MaintainDatabase {
	
	private static MaintainDatabase instance;
	private static MaintainUser userMaintainer;
	private static MaintainBooks bookMaintainer;
	
	private MaintainDatabase() {
		userMaintainer = MaintainUser.getInstance();
		bookMaintainer = MaintainBooks.getInstance();
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
	
	/**
	 * Used to get an instance of the user database
	 * @return
	 */
	public MaintainUser getUserDatabase() {
		return MaintainUser.getInstance();
	}
	
	/**
	 * Used to get an instance of the books database
	 * @return
	 */
	public MaintainBooks getBookDatabase() {
		return MaintainBooks.getInstance();
	}
	
	public void update() throws Exception {
		userMaintainer.update();
		bookMaintainer.update();
	}

}
