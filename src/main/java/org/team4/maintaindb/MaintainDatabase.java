package org.team4.maintaindb;

public class MaintainDatabase {
	
	private static MaintainDatabase instance;
	private static MaintainUser userMaintainer;
	private static MaintainBooks bookMaintainer;
	private static MaintainDVD dvdMaintainer;
	private static MaintainMagazine magazineMaintainer;
	private static MaintainRent rentMaintainer;
	private static MaintainStudent studentMaintainer;
	private static MaintainCourse courseMaintainer;
	private static MaintainPurchase purchaseMaintainer;
	private static MaintainSubscriptions subscriptionMaintainer;
	private static MaintainNotifications notificationMaintainer;
	private static MaintainRequests requestMaintainer;
	private static MaintainNewsletter newsletterMaintainer;
	
	private MaintainDatabase() {
		userMaintainer = MaintainUser.getInstance();
		bookMaintainer = MaintainBooks.getInstance();
		dvdMaintainer = MaintainDVD.getInstance();
		magazineMaintainer = MaintainMagazine.getInstance();
		rentMaintainer = MaintainRent.getInstance();
		courseMaintainer = MaintainCourse.getInstance();
		studentMaintainer = MaintainStudent.getInstance();
		purchaseMaintainer = MaintainPurchase.getInstance();
		subscriptionMaintainer = MaintainSubscriptions.getInstance();
		notificationMaintainer = MaintainNotifications.getInstance();
		requestMaintainer = MaintainRequests.getInstance();
		newsletterMaintainer = MaintainNewsletter.getInstance();
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
	 * Used to get an instance of the Newsletter database
	 * @return
	 */

	public MaintainNewsletter getNewsletterDatabase() {
		return MaintainNewsletter.getInstance();
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
	 * Used to get an instance of the student database
	 * @return
	 */
	public MaintainStudent getStudentDatabase() {
		return MaintainStudent.getInstance();
	}
	
	/**
	 * Used to get an instance of the course database
	 * @return
	 */
	public MaintainCourse getCourseDatabase() {
		return MaintainCourse.getInstance();
	}

	/**
	 * Used to get an instance of the purchase database
	 * @return
	 */
	public MaintainPurchase getPurchaseDatabase() {
		return MaintainPurchase.getInstance();
	}

	/**
	 * Used to get an instance of the purchase database
	 * @return
	 */
	public MaintainSubscriptions getSubscriptionDatabase() {
		return MaintainSubscriptions.getInstance();
	}
	
	/**
	 * Used to get an instance of the notifications database
	 * @return
	 */
	public MaintainNotifications getNotificationDatabase() {
		return MaintainNotifications.getInstance();
	}
	
	/**
	 * Used to get an instance of the request database
	 * @return
	 */
	public MaintainRequests getRequestDatabase() {
		return MaintainRequests.getInstance();
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
		studentMaintainer.update();
		courseMaintainer.update();
		purchaseMaintainer.update();
		subscriptionMaintainer.update();
		notificationMaintainer.update();
		requestMaintainer.update();
		newsletterMaintainer.update();
	}

}
