package org.agoncal.quarkus.starting;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class BookRecommendation {
    @Inject
    BookRepository bookRepository;

    public List<Book> getRecommendationsByGenre(String genre) {
        return bookRepository.getAllBooks().stream()
                .filter(book -> book.getGenre().equalsIgnoreCase(genre))
                .limit(3)
                .toList();
    }

    public List<Book> getRecommendationsByAuthor(String author) {
        return bookRepository.getAllBooks().stream()
                .filter(book -> book.getAuthor().equalsIgnoreCase(author))
                .limit(3)
                .toList();
    }

    public List<Book> getRecommendationsByYear(int year) {
        return bookRepository.getAllBooks().stream()
                .filter(book -> book.getYear() == year)
                .limit(3)
                .toList();
    }

    public List<Book> getSimilarBooks(int bookId) {
        Book referenceBook = bookRepository.getBook(bookId).orElse(null);
        if (referenceBook == null) {
            return new ArrayList<>();
        }

        return bookRepository.getAllBooks().stream()
                .filter(book -> book.getId() != bookId)
                .filter(book -> book.getGenre().equals(referenceBook.getGenre()))
                .limit(5)
                .toList();
    }
}
