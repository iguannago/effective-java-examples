package org.effectivejava.examples.chapter02.item01;

/**
 * Created with IntelliJ IDEA.
 * User: david
 * Date: 08/09/13
 * Time: 14:37
 * To change this template use File | Settings | File Templates.
 */
public class Book {

    /**
     * Static factory method
     * @return
     */
    public static Book instanceOfBook() {
        return new Book();
    }
}
