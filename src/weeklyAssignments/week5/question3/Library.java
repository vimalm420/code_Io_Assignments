package weeklyAssignments.week5.question3;

import java.awt.print.Book;
public class Library {
   public Book[] b1;
   private int size=0;
   public Library() {
        b1 = new Book[50];
    }
    class Book {
        String title;
        String author;
        int price;

        public Book(String title, String author, int price) {
            this.title = title;
            this.author = author;
            this.price = price;
        }
    }
    public void addBook(String title,String author,int price){
        b1[size++]=new Book(title,author,price);
    }

    public void displayBookDetails(int index){
        System.out.print(b1[index].title+", ");
        System.out.print(b1[index].author+", ");
        System.out.print(b1[index].price);
    }
}
