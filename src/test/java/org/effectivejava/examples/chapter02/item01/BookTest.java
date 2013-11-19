package org.effectivejava.examples.chapter02.item01;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Created with IntelliJ IDEA.
 * User: david
 * Date: 08/09/13
 * Time: 14:40
 * To change this template use File | Settings | File Templates.
 */
@RunWith(JUnit4.class)
public class BookTest {

    @Test
    public void classTest() {
        Book book = new Book();
        Book book2 = Book.instanceOfBook();
        org.junit.Assert.assertNotNull(book);
        org.junit.Assert.assertNotNull(book2);
    }
}
