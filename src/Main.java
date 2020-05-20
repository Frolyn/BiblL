import java.util.HashMap;
import java.util.Map;

class Book {
    String autor;
    String name;
}

class Ticket {
    int number;
    String  libraryName;

    @Override
    public boolean equals(Object o) {
      if (this == o)  return true;
      if (o == null || getClass() != o.getClass()) return false;

      Ticket ticket = (Ticket) o;

        if (number != ticket.number) return false;
        return libraryName != null ? libraryName.equals(ticket.libraryName) : ticket.libraryName == null;

    }

    @Override
    public int hashCode() {
        int result = number;
        result = 69 * result + (libraryName != null ? libraryName.hashCode() : 0);
        return result;
    }
}

public class Main extends Object {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        ticket.number = 77;
        Book book = new Book();
        book.autor = "Kolotushkin";
        book.name = "Kachmar";
        Map<Ticket, Book> library = new HashMap<>();
        library.put(ticket, book);

        Ticket ticket2 = new Ticket();
        ticket2.number = 77;

        Book kolotushkinBook = library.get(ticket2);
        System.out.println(kolotushkinBook.autor);

    }
}
