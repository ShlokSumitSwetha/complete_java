package streams;

import entity.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 *
 *
 *  1. Collector<T, ?, Map<K,U>> toMap(Function<? super T, ? extends K> keyMapper,
 *   Function<? super T, ? extends U> valueMapper)
 *
 *   2.Collector<T, ?, M> toMap(Function<? super T, ? extends K> keyMapper,
 *   Function<? super T, ? extends U> valueMapper,
 *   BinaryOperator<U> mergeFunction)
 *
 *   3.Collector<T, ?, M> toMap(Function<? super T, ? extends K> keyMapper,
 *   Function<? super T, ? extends U> valueMapper,
 *   BinaryOperator<U> mergeFunction,
 *   Supplier<M> mapSupplier)
 *
 *
 *
 *
 *
 *
 *
 *
 */

public class ToMapUsage {

    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book("The Fellowship of the Ring", 1954, "ISBN:0395489318"));
        bookList.add(new Book("The Two Towers", 1954, "ISBN:0345339711"));
        bookList.add(new Book("The Return of the King", 1955, "ISBN:0618129111"));

        System.out.println(listToMap(bookList));
       // System.out.println(listToMapWithDupKeyError(bookList));
        System.out.println(listToMapWithDupKey(bookList));
        System.out.println(listToConcurrentMap(bookList));

    }

    /**
     * Collector<T, ?, Map<K,U>> toMap(Function<? super T, ? extends K> keyMapper,
     *   Function<? super T, ? extends U> valueMapper)
     *
     * @param books
     * @return
     */
    public static Map<String, String> listToMap(List<Book> books) {
        return books.stream().collect(Collectors.toMap(Book::getIsbn, Book::getName));
    }

    /**
     *
     * @param books
     * @return
     */
    public static Map<Integer, Book> listToMapWithDupKeyError(List<Book> books) {
        return books.stream().collect(
                Collectors.toMap(Book::getReleaseYear, Function.identity()));
    }

    /**
     * Collector<T, ?, M> toMap(Function<? super T, ? extends K> keyMapper,
     *   Function<? super T, ? extends U> valueMapper,
     *   BinaryOperator<U> mergeFunction)
     * @param books
     * @return
     */
    public static Map<Integer, Book> listToMapWithDupKey(List<Book> books) {
        return books.stream().collect(Collectors.toMap(Book::getReleaseYear, Function.identity(),
                (existing, replacement) -> existing));
    }

    /**
     * Collector<T, ?, M> toMap(Function<? super T, ? extends K> keyMapper,
     *   Function<? super T, ? extends U> valueMapper,
     *   BinaryOperator<U> mergeFunction,
     *   Supplier<M> mapSupplier)
     * @param books
     * @return
     */

    public static Map<Integer, Book> listToConcurrentMap(List<Book> books) {
        return books.stream().collect(Collectors.toMap(Book::getReleaseYear, Function.identity(),
                (o1, o2) -> o1, ConcurrentHashMap::new));
    }

}
