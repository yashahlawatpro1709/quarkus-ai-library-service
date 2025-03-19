package org.agoncal.quarkus.starting;

import jakarta.enterprise.context.ApplicationScoped;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@ApplicationScoped
public class BookRepository {
    private final List<Book> books = new ArrayList<>(List.of(
            new Book(1, "The Hitchhiker's Guide to the Galaxy", "Douglas Adams", 1979, "Science Fiction"),
            new Book(2, "1984", "George Orwell", 1949, "Dystopian"),
            new Book(3, "Pride and Prejudice", "Jane Austen", 1813, "Classic Romance"),
            new Book(4, "To Kill a Mockingbird", "Harper Lee", 1960, "Literary Fiction"),
            new Book(5, "The Great Gatsby", "F. Scott Fitzgerald", 1925, "Literary Fiction"),
            new Book(6, "The Catcher in the Rye", "J.D. Salinger", 1951, "Literary Fiction"),
            new Book(7, "Lord of the Rings", "J.R.R. Tolkien", 1954, "Fantasy"),
            new Book(8, "Brave New World", "Aldous Huxley", 1932, "Science Fiction"),
            new Book(9, "The Hobbit", "J.R.R. Tolkien", 1937, "Fantasy"),
            new Book(10, "Fahrenheit 451", "Ray Bradbury", 1953, "Science Fiction"),
            new Book(11, "Jane Eyre", "Charlotte Bronte", 1847, "Gothic Fiction"),
            new Book(12, "The Alchemist", "Paulo Coelho", 1988, "Fantasy"),
            new Book(13, "Dune", "Frank Herbert", 1965, "Science Fiction"),
            new Book(14, "The Da Vinci Code", "Dan Brown", 2003, "Mystery Thriller"),
            new Book(15, "The Hunger Games", "Suzanne Collins", 2008, "Young Adult"),
            new Book(16, "Harry Potter and the Sorcerer's Stone", "J.K. Rowling", 1997, "Fantasy"),
            new Book(17, "The Girl with the Dragon Tattoo", "Stieg Larsson", 2005, "Crime Thriller"),
            new Book(18, "The Road", "Cormac McCarthy", 2006, "Post-Apocalyptic"),
            new Book(19, "The Kite Runner", "Khaled Hosseini", 2003, "Historical Fiction"),
            new Book(20, "The Chronicles of Narnia", "C.S. Lewis", 1950, "Fantasy"),
            new Book(21, "The Shining", "Stephen King", 1977, "Horror"),
            new Book(22, "The Handmaid's Tale", "Margaret Atwood", 1985, "Dystopian"),
            new Book(23, "The Color Purple", "Alice Walker", 1982, "Literary Fiction"),
            new Book(24, "One Hundred Years of Solitude", "Gabriel García Márquez", 1967, "Magical Realism"),
            new Book(25, "The Picture of Dorian Gray", "Oscar Wilde", 1890, "Gothic Fiction"),
            new Book(26, "The Grapes of Wrath", "John Steinbeck", 1939, "Historical Fiction"),
            new Book(27, "The Silent Patient", "Alex Michaelides", 2019, "Psychological Thriller"),
            new Book(28, "The Name of the Wind", "Patrick Rothfuss", 2007, "Fantasy"),
            new Book(29, "The Martian", "Andy Weir", 2011, "Science Fiction"),
            new Book(30, "Gone Girl", "Gillian Flynn", 2012, "Psychological Thriller"),
            new Book(31, "The Night Circus", "Erin Morgenstern", 2011, "Fantasy"),
            new Book(32, "The Shadow of the Wind", "Carlos Ruiz Zafón", 2001, "Mystery"),
            new Book(33, "The Book Thief", "Markus Zusak", 2005, "Historical Fiction"),
            new Book(34, "The Goldfinch", "Donna Tartt", 2013, "Literary Fiction"),
            new Book(35, "The Pillars of the Earth", "Ken Follett", 1989, "Historical Fiction"),
            new Book(36, "The Stand", "Stephen King", 1978, "Post-Apocalyptic"),
            new Book(37, "American Gods", "Neil Gaiman", 2001, "Fantasy"),
            new Book(38, "The Poisonwood Bible", "Barbara Kingsolver", 1998, "Historical Fiction"),
            new Book(39, "The Three-Body Problem", "Cixin Liu", 2008, "Science Fiction"),
            new Book(40, "The Secret History", "Donna Tartt", 1992, "Literary Fiction"),
            new Book(41, "The Wind-Up Bird Chronicle", "Haruki Murakami", 1994, "Magical Realism"),
            new Book(42, "The Road Less Traveled", "M. Scott Peck", 1978, "Self-Help"),
            new Book(43, "The Unbearable Lightness of Being", "Milan Kundera", 1984, "Philosophical Fiction"),
            new Book(44, "The Bell Jar", "Sylvia Plath", 1963, "Literary Fiction"),
            new Book(45, "The Stranger", "Albert Camus", 1942, "Philosophical Fiction"),
            new Book(46, "The Metamorphosis", "Franz Kafka", 1915, "Literary Fiction"),
            new Book(47, "The Old Man and the Sea", "Ernest Hemingway", 1952, "Literary Fiction"),
            new Book(48, "The Catch-22", "Joseph Heller", 1961, "Satirical Fiction"),
            new Book(49, "The Odyssey", "Homer", -800, "Epic Poetry"),
            new Book(50, "The Divine Comedy", "Dante Alighieri", 1320, "Epic Poetry"),
            new Book(51, "The Canterbury Tales", "Geoffrey Chaucer", 1400, "Poetry"),
            new Book(52, "The Prince", "Niccolò Machiavelli", 1532, "Political Philosophy"),
            new Book(53, "The Art of War", "Sun Tzu", -500, "Military Strategy"),
            new Book(54, "The Republic", "Plato", -380, "Philosophy"),
            new Book(55, "The Count of Monte Cristo", "Alexandre Dumas", 1844, "Adventure"),
            new Book(56, "The Three Musketeers", "Alexandre Dumas", 1844, "Adventure"),
            new Book(57, "The Tale of Two Cities", "Charles Dickens", 1859, "Historical Fiction"),
            new Book(58, "The Great Expectations", "Charles Dickens", 1861, "Coming-of-age"),
            new Book(59, "The Adventures of Sherlock Holmes", "Arthur Conan Doyle", 1892, "Mystery"),
            new Book(60, "The War of the Worlds", "H.G. Wells", 1898, "Science Fiction"),
            new Book(61, "The Time Machine", "H.G. Wells", 1895, "Science Fiction"),
            new Book(62, "The Invisible Man", "H.G. Wells", 1897, "Science Fiction"),
            new Book(63, "The Island of Doctor Moreau", "H.G. Wells", 1896, "Science Fiction"),
            new Book(64, "The Call of the Wild", "Jack London", 1903, "Adventure"),
            new Book(65, "The Sea Wolf", "Jack London", 1904, "Adventure"),
            new Book(66, "The Iron Heel", "Jack London", 1908, "Science Fiction"),
            new Book(67, "The Jungle", "Upton Sinclair", 1906, "Political Fiction"),
            new Book(68, "The Age of Innocence", "Edith Wharton", 1920, "Historical Romance"),
            new Book(69, "The Sun Also Rises", "Ernest Hemingway", 1926, "Literary Fiction"),
            new Book(70, "The Sound and the Fury", "William Faulkner", 1929, "Literary Fiction"),
            new Book(71, "The Good Earth", "Pearl S. Buck", 1931, "Historical Fiction"),
            new Book(72, "The Fountainhead", "Ayn Rand", 1943, "Philosophical Fiction"),
            new Book(73, "The Little Prince", "Antoine de Saint-Exupéry", 1943, "Children's Literature"),
            new Book(74, "The Plague", "Albert Camus", 1947, "Philosophical Fiction"),
            new Book(75, "The Second Sex", "Simone de Beauvoir", 1949, "Philosophy"),
            new Book(76, "The Lion, the Witch and the Wardrobe", "C.S. Lewis", 1950, "Fantasy"),
            new Book(77, "The Catcher in the Rye", "J.D. Salinger", 1951, "Literary Fiction"),
            new Book(78, "The Old Man and the Sea", "Ernest Hemingway", 1952, "Literary Fiction"),
            new Book(79, "The Fellowship of the Ring", "J.R.R. Tolkien", 1954, "Fantasy"),
            new Book(80, "The Two Towers", "J.R.R. Tolkien", 1954, "Fantasy"),
            new Book(81, "The Return of the King", "J.R.R. Tolkien", 1955, "Fantasy"),
            new Book(82, "The Fall", "Albert Camus", 1956, "Philosophical Fiction"),
            new Book(83, "The Once and Future King", "T.H. White", 1958, "Fantasy"),
            new Book(84, "The Tin Drum", "Günter Grass", 1959, "Magical Realism"),
            new Book(85, "The Phantom Tollbooth", "Norton Juster", 1961, "Children's Literature"),
            new Book(86, "The Bell Jar", "Sylvia Plath", 1963, "Literary Fiction"),
            new Book(87, "The Crying of Lot 49", "Thomas Pynchon", 1966, "Postmodern"),
            new Book(88, "The Master and Margarita", "Mikhail Bulgakov", 1967, "Magical Realism"),
            new Book(89, "The Electric Kool-Aid Acid Test", "Tom Wolfe", 1968, "Non-fiction"),
            new Book(90, "The Godfather", "Mario Puzo", 1969, "Crime Fiction"),
            new Book(91, "The Bluest Eye", "Toni Morrison", 1970, "Literary Fiction"),
            new Book(92, "The Exorcist", "William Peter Blatty", 1971, "Horror"),
            new Book(93, "The Princess Bride", "William Goldman", 1973, "Fantasy Romance"),
            new Book(94, "The Dispossessed", "Ursula K. Le Guin", 1974, "Science Fiction"),
            new Book(95, "The Dead Zone", "Stephen King", 1979, "Horror"),
            new Book(96, "The Name of the Rose", "Umberto Eco", 1980, "Historical Mystery"),
            new Book(97, "The Color Purple", "Alice Walker", 1982, "Literary Fiction"),
            new Book(98, "The House of the Spirits", "Isabel Allende", 1982, "Magical Realism"),
            new Book(99, "The Handmaid's Tale", "Margaret Atwood", 1985, "Dystopian"),
            new Book(100, "The Mists of Avalon", "Marion Zimmer Bradley", 1983, "Fantasy"),
            new Book(101, "The Joy Luck Club", "Amy Tan", 1989, "Literary Fiction"),
            new Book(102, "The Things They Carried", "Tim O'Brien", 1990, "War Fiction"),
            new Book(103, "The Firm", "John Grisham", 1991, "Legal Thriller"),
            new Book(104, "The English Patient", "Michael Ondaatje", 1992, "Historical Fiction"),
            new Book(105, "The Virgin Suicides", "Jeffrey Eugenides", 1993, "Literary Fiction"),
            new Book(106, "The Shipping News", "Annie Proulx", 1993, "Literary Fiction"),
            new Book(107, "The Stone Diaries", "Carol Shields", 1993, "Literary Fiction"),
            new Book(108, "The Wind-Up Bird Chronicle", "Haruki Murakami", 1994, "Magical Realism"),
            new Book(109, "The Golden Compass", "Philip Pullman", 1995, "Fantasy"),
            new Book(110, "The Beach", "Alex Garland", 1996, "Adventure Fiction"),
            new Book(111, "The God of Small Things", "Arundhati Roy", 1997, "Literary Fiction"),
            new Book(112, "The Hours", "Michael Cunningham", 1998, "Literary Fiction"),
            new Book(113, "The Perks of Being a Wallflower", "Stephen Chbosky", 1999, "Young Adult"),
            new Book(114, "The Amazing Adventures of Kavalier & Clay", "Michael Chabon", 2000, "Historical Fiction"),
            new Book(115, "The Corrections", "Jonathan Franzen", 2001, "Literary Fiction"),
            new Book(116, "The Life of Pi", "Yann Martel", 2001, "Adventure Fiction"),
            new Book(117, "The Lovely Bones", "Alice Sebold", 2002, "Literary Fiction"),
            new Book(118, "The Time Traveler's Wife", "Audrey Niffenegger", 2003, "Science Fiction Romance"),
            new Book(119, "The Shadow of the Wind", "Carlos Ruiz Zafón", 2004, "Historical Mystery"),
            new Book(120, "The History of Love", "Nicole Krauss", 2005, "Literary Fiction"),
            new Book(121, "The Road", "Cormac McCarthy", 2006, "Post-Apocalyptic"),
            new Book(122, "The Brief Wondrous Life of Oscar Wao", "Junot Díaz", 2007, "Literary Fiction"),
            new Book(123, "The White Tiger", "Aravind Adiga", 2008, "Dark Comedy"),
            new Book(124, "The Help", "Kathryn Stockett", 2009, "Historical Fiction"),
            new Book(125, "The Immortal Life of Henrietta Lacks", "Rebecca Skloot", 2010, "Non-fiction"),
            new Book(126, "The Tiger's Wife", "Téa Obreht", 2011, "Magical Realism"),
            new Book(127, "The Fault in Our Stars", "John Green", 2012, "Young Adult"),
            new Book(128, "The Ocean at the End of the Lane", "Neil Gaiman", 2013, "Fantasy"),
            new Book(129, "The Goldfinch", "Donna Tartt", 2013, "Literary Fiction"),
            new Book(130, "The Bone Clocks", "David Mitchell", 2014, "Fantasy"),
            new Book(131, "The Girl on the Train", "Paula Hawkins", 2015, "Psychological Thriller"),
            new Book(132, "The Underground Railroad", "Colson Whitehead", 2016, "Historical Fiction"),
            new Book(133, "The Power", "Naomi Alderman", 2016, "Science Fiction"),
            new Book(134, "The Hate U Give", "Angie Thomas", 2017, "Young Adult"),
            new Book(135, "The Seven Husbands of Evelyn Hugo", "Taylor Jenkins Reid", 2017, "Historical Fiction"),
            new Book(136, "The Overstory", "Richard Powers", 2018, "Literary Fiction")
    ));  // Fixed by adding the missing closing parenthesis

    public List<Book> getAllBooks() {
        return books;
    }

    public int countAllBooks() {
        return books.size();
    }

    public Optional<Book> getBook(int id) {
        return books.stream().filter(book -> book.id == id).findFirst();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public boolean borrowBook(int id, String username) {
        Optional<Book> book = getBook(id);
        return book.map(b -> b.borrowBook(username)).orElse(false);
    }

    public boolean returnBook(int id) {
        Optional<Book> book = getBook(id);
        return book.map(Book::returnBook).orElse(false);
    }

    public boolean addReview(int bookId, Review review) {
        Optional<Book> book = getBook(bookId);
        if (book.isPresent()) {
            book.get().addReview(review);
            return true;
        }
        return false;

    }
    public List<Review> getReviews(int bookId){
        return getBook(bookId).map(Book::getReviews).orElse(List.of());
    }
    public boolean reserveBook(int id,String username){
        return getBook(id).map(book->book.reserveBook(username)).orElse(false);
    }
    public boolean cancelReservation(int id,String username){
        return getBook(id).map(book->book.cancelReservation(username)).orElse(false);
    }
}