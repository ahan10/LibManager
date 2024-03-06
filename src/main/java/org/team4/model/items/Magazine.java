package org.team4.model.items;

public class Magazine extends Item{
    private String publisher;
    private int issueNumber;


    public Magazine(Item item, String publisher, int issueNumber) {
        super(item);
        this.publisher = publisher;
        this.issueNumber = issueNumber;
    }


	public String getPublisher() {
		return publisher;
	}


	public int getIssueNumber() {
		return issueNumber;
	}
}
