class Book{
private int bookId;
private String name;


public int setBookId(int bookId)
{
this.bookId=bookId;
System.out.println("bookId is set");
}

public void getBookId()
{
	return bookId;
	}
	
public String setName(String Name)
{
this.Name=Name;
System.out.println("Name is set");
}

public void getName()
{
	return Name;
	}