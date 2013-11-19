package org.effectivejava.examples.chapter02.item06;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Created with IntelliJ IDEA.
 * User: d.crespo@london.net-a-porter.com
 * Date: 19/11/2013
 * Time: 19:03
 * To change this template use File | Settings | File Templates.
 */
@RunWith(JUnit4.class)
public class StackTest {

    private static Log logger = LogFactory.getLog(StackTest.class);
    private Stack stack = new Stack();

    @Test
    public void pushMethodTest() {
        showStack();
        stack.push("1");
        showStack();
    }

    public void showStack() {
        logger.debug("stack status...");
        logger.debug("stack.getElements(): " + stack.getElements());
        logger.debug("stack.getSize(): " + stack.getSize());
        logger.debug("stack.DEFAULT_INITIAL_CAPACITY: " + stack.DEFAULT_INITIAL_CAPACITY);
    }
}
