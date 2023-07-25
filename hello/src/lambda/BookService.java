package lambda;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class BookService {

    public BookDao bookDao;

    public BookService() {
        this.bookDao = bookDao;
    }

    public List<Book> getsortedbooks() {
        List<Book> books = new BookDao().getBooks();
        Collections.sort(books,(o1,o2)-> o1.getName().compareTo(o2.getName()));
        return books;
        
    }
    public List<Book> getBooksAccPage(){
        return bookDao.getBooks().stream().filter(t->t.getPages()>=200).collect(Collectors.toList());
    }
    public Book getBooksSoldMaxOnFirst(){
        return bookDao.getBooks().stream().filter(t->t.getBookSold().get(0)>t.getBookSold().get(1))
                .findAny().orElseGet(()->null);
    }
//    public int getTotalSold(int id){
//        int s=bookDao.getBooks().stream().filter(w->w.getId()==id).mapToInt(w->w.getBookSold()).sum();
//        return 0;
//    }

    public static void main(String[] args) {

        System.out.println(new BookService().getsortedbooks());
        System.out.println(new BookService().getBooksAccPage());
        System.out.println(new BookService().getBooksSoldMaxOnFirst());

    }
//    public class Mycom implements Comparator<Book>{
//        @Override
//        public int compare(Book o1, Book o2) {
//            return o2.getName().compareTo(o1.getName());
//        }
//    }

}
