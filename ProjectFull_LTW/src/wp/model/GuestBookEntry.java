package wp.model;

public class GuestBookEntry {

	private String name;
	private String message;
	private int key;
	
	public GuestBookEntry() {}
	
	public GuestBookEntry(String name, String message, int key) {
		this.name = name;
		this.message = message;
		this.key = key;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}
}
