import java.util.HashMap;

class Book{
	int book_id;
	String book_name,book_author,book_publisher;
	int book_quantity;
	
	public Book(int book_id,String book_name,String book_author,String book_publisher,int book_quantity) {
		this.book_id=book_id;
		this.book_name=book_name;
		this.book_author=book_author;
		this.book_publisher=book_publisher;
		this.book_quantity=book_quantity;
		
	}
}
public class hmap4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, Book> map =  new HashMap<Integer, Book>();
		map.put(1, new Book(101, "C", "yashwant", "bpb", 8));
		map.put(2, new Book(102, "Data communications", "ashish", "mcgrawhill", 4));
		map.forEach((key,val)->{ 
			System.out.println(key + " " + val.book_id + " "+ val.book_name + " "+ val.book_author + " "+ val.book_publisher + " "+ val.book_quantity);;
			
		});
	
	}

}
