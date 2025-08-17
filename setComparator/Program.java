package college.dkte.demo2;
import java.util.*;

public class Program {

	public static void main1(String[] args) {
		//Set<Book> set = new HashSet<Book>();
		Set<Book> set = new LinkedHashSet<Book>();
		//Set<Book> set = new TreeSet<Book>();
		
		set.add(new Book(4, "The Alchemist", "Novel", 493.23));
		set.add(new Book(1, "The Archer", "Novel", 723.53));
		set.add(new Book(5, "The Fountainhead", "Novel", 652.73));
		set.add(new Book(2, "Atlas Shrugged", "Novel", 872.94));
		set.add(new Book(6, "Harry Potter", "Novel", 423.68));
		set.add(new Book(1, "The Archer", "Novel", 723.53));
		set.add(new Book(3, "Lord of Rings", "Novel", 621.53));
 
		System.out.println("Size of set: "+ set.size());
		
		for(Book ele : set)
			System.out.println(ele);
	}
	
	public static void main(String[] args) {
		
		
		class BookPriceComparator implements Comparator<Book>{
			
			@Override
			public int compare(Book x, Book y) {
				int diff = Double.compare(x.getPrice() , y.getPrice());
				return diff;
			}
		}
		
		Set<Book> set = new TreeSet<Book>(new BookPriceComparator());
		
		set.add(new Book(4, "The Alchemist", "Novel", 493.23));
		set.add(new Book(1, "The Archer", "Novel", 723.53));
		set.add(new Book(5, "The Fountainhead", "Novel", 652.73));
		set.add(new Book(2, "Atlas Shrugged", "Novel", 872.94));
		set.add(new Book(6, "Harry Potter", "Novel", 423.68));
		set.add(new Book(1, "The Archer", "Novel", 723.53));
		set.add(new Book(3, "Lord of Rings", "Novel", 621.53));
		
		for(Book b : set) {
			System.out.println(b);
		}
			
	}
}
