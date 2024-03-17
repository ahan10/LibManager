package org.team4.maintaindb;

import java.io.FileWriter;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import org.team4.model.items.BookRequest;
import org.team4.model.items.builder.BookRequestBuilder;

import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;

public class MaintainRequests {

	private static MaintainRequests instance;

	public ArrayList<BookRequest> highPriorityRequests;
	public ArrayList<BookRequest> lowPriorityRequests;


	private static final String FILE_PATH = "database/requests.csv";

	private MaintainRequests(){
		this.highPriorityRequests = new ArrayList<BookRequest>();
		this.lowPriorityRequests = new ArrayList<BookRequest>();

		try {
			//LOAD ONLY ONCE WHEN DATABASE CREATED
			this.load();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Failed to Initialize Request Database");
		}

	}

	public static MaintainRequests getInstance() {
		if (instance == null) {
			// Extra check for Multi-threaded applications
			synchronized (MaintainBooks.class) {
				if (instance == null) {
					instance = new MaintainRequests();
				}
			}
		}

		return instance;
	}


	public void load() throws Exception{
		CsvReader reader = new CsvReader(FILE_PATH);
		reader.readHeaders();

		while (reader.readRecord()) {
			BookRequest newRequest =  new BookRequestBuilder()
					.title(reader.get("title"))	
					.author(reader.get("author"))
					.ISBN(reader.get("ISBN"))
					.edition(Integer.parseInt(reader.get("edition")))
					.booktype(reader.get("booktype"))
					.build();
			if(newRequest.getBookType().equals("TextBook")) {
				highPriorityRequests.add(newRequest);
			}
			else {
				lowPriorityRequests.add(newRequest);
			}
		}
	}

	public void update() throws Exception{
		try {
			CsvWriter csvOutput = new CsvWriter(new FileWriter(FILE_PATH, false), ',');
			//email,password,name,type,validated

			//set header
			csvOutput.write("email");
			csvOutput.write("title");
			csvOutput.write("author");
			csvOutput.write("ISBN");
			csvOutput.write("edition");
			csvOutput.write("booktype");
			csvOutput.endRecord();

			// write out records
			for(BookRequest b: highPriorityRequests){
				csvOutput.write(b.getEmail());
				csvOutput.write(b.getTitle());
				csvOutput.write(b.getAuthor());
				csvOutput.write(b.getISBN());
				csvOutput.write(String.valueOf((b).getEdition()));
				csvOutput.write(b.getBookType());
				csvOutput.endRecord();
			}
			// write out records
			for(BookRequest b: lowPriorityRequests){
				csvOutput.write(b.getEmail());
				csvOutput.write(b.getTitle());
				csvOutput.write(b.getAuthor());
				csvOutput.write(b.getISBN());
				csvOutput.write(String.valueOf((b).getEdition()));
				csvOutput.write(b.getBookType());
				csvOutput.endRecord();
			}
			csvOutput.close();

		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void addRequest(BookRequest request) {
		boolean flag = false;
		ArrayList<BookRequest> allRequests = new ArrayList<>();
		allRequests.addAll(lowPriorityRequests);
		allRequests.addAll(highPriorityRequests);

		for (BookRequest d: allRequests) {
			if (d.getISBN().equals(request.getISBN())) {
				flag = true;
				JOptionPane.showMessageDialog(new JFrame(), "Book request already exists!",
						"Error Invalid Request", JOptionPane.ERROR_MESSAGE);
				break;
			}
		}
		if (flag == false) {
			//this.requests.add(request);
			if(request.getBookType().equals("TextBook")) {
				this.highPriorityRequests.add(request);
				JOptionPane.showMessageDialog(new JFrame(), "Successful high priority request! Priority: " + (highPriorityRequests.size()) + " of " + (allRequests.size()+1),
						"Request Complete", JOptionPane.INFORMATION_MESSAGE);
			}
			else {
				this.lowPriorityRequests.add(request);
				JOptionPane.showMessageDialog(new JFrame(), "Successful low priority request! Priority: " + (allRequests.size()+1) + " of " + (allRequests.size()+1),
						"Request Complete", JOptionPane.INFORMATION_MESSAGE);
			}
			try {
				update();

			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Couldn't add request: " + request);
			}
		}

	}	 
}
