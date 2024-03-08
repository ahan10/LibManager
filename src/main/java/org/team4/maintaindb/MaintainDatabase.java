package org.team4.maintaindb;

public class MaintainDatabase {
	
	private static MaintainDatabase instance;
	private static MaintainUser userMaintainer;
	private static MaintainBooks bookMaintainer;
	private static MaintainDVD dvdMaintainer;
	private static MaintainMagazine magazineMaintainer;
	private static MaintainRent rentMaintainer;
	
	private MaintainDatabase() {
		userMaintainer = MaintainUser.getInstance();
		bookMaintainer = MaintainBooks.getInstance();
		dvdMaintainer = MaintainDVD.getInstance();
		magazineMaintainer = MaintainMagazine.getInstance();
		rentMaintainer = MaintainRent.getInstance();
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
	
	/**
	 * Used to get an instance of the DVD database
	 * @return
	 */
	public MaintainDVD getDVDDatabase() {
		return MaintainDVD.getInstance();
	}
	
	/**
	 * Used to get an instance of the magazine database
	 * @return
	 */
	public MaintainMagazine getMagazineDatabase() {
		return MaintainMagazine.getInstance();
	}
	
	/**
	 * Used to get an instance of the renter database
	 * @return
	 */
	public MaintainRent getrenterDatabase() {
		return MaintainRent.getInstance();
	}
	
	
	/**
	 * Update all databases
	 * @throws Exception
	 */
	public void update() throws Exception {
		userMaintainer.update();
		bookMaintainer.update();
		dvdMaintainer.update();
		magazineMaintainer.update();
		rentMaintainer.update();
	}

}
