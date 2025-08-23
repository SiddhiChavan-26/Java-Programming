package college.dkte.demo2;

import java.util.*;
public class Program {

	public static void main(String[] args) {
		List <Book> list = new ArrayList<Book>();
		
		Collections.addAll(list,
			    new Book(4, "The Alchemist", "Novel", 493.23),
			    new Book(1, "The Archer", "Novel", 723.53),
			    new Book(5, "The Fountainhead", "Novel", 652.73),
			    new Book(2, "Atlas Shrugged", "Novel", 872.94),
			    new Book(6, "Harry Potter", "Novel", 423.68),
			    new Book(3, "Lord of Rings", "Novel", 621.53)	
			); 
		
		for(Book b: list) {
			System.out.println(b);
		}
		System.out.println();
		
		int index = 3;
		System.out.println("Book at index: "+ index);
		Book b = list.get(index);
		System.out.println(b);

		System.out.println();
		System.out.println("FWD traversing: ");
		Iterator<Book> trav = list.iterator();
		while(trav.hasNext()) {
			Book b1 = trav.next();
			System.out.println(b1);
		}
		
		System.out.println();
		Collections.sort(list);
		System.out.println("Sort by id: ");
		for(Book bk: list) {
			System.out.println(bk);
		}
		
		System.out.println();
		int id =5;
		Book key = new Book();
		key.setId(id);
		int idx = list.indexOf(key);
		if(idx != -1) {
			System.out.println("The book with id "+ id+ " Found");
		}else {
			System.out.println("Book not found");
		}
		
		class BookNameComparator implements Comparator<Book>{
			@Override
			public int compare(Book x, Book y) {
				int diff = x.getName().compareTo(y.getName());
				return diff;
			}
		}
		
		System.out.println("Sorting of books by names: ");
		Collections.sort(list, new BookNameComparator());
		for(Book b2 : list) {
			System.out.println(b2);
		}
		
		System.out.println();
		class BookPriceComparator implements Comparator<Book>{
			
			@Override
			public int compare(Book x, Book y) {
				int diff = Double.compare(x.getPrice(), y.getPrice());
				return diff;
			}
		}
		System.out.println("Sorting books by price in descending order: ");
		Collections.sort(list, new BookPriceComparator());
		for(Book b3 : list) {
			System.out.println(b3);
		}
		
		System.out.println();
		System.out.println("Book with mximum price: ");
		Book book = Collections.max(list, new BookPriceComparator());
		System.out.println(book);
		
	}
	
	

}
