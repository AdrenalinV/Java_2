package Lesson_2;

import org.junit.Assert;
import org.junit.Test;

public class TestLesson2 {
    @Test(expected = MyArraySizeException.class)
    public void testMyArraySizeExeption() {
        int res = Lesson_2.demoException(new String[][]{});

    }

    @Test(expected = MyArrayDataException.class)
    public void MyArrayDataException() {
        int res = Lesson_2.demoException(new String[][]{{"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "и", "16"}});
    }

    @Test
    public void testOk() {
        int res = Lesson_2.demoException(new String[][]{{"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}});
        Assert.assertEquals(136, res);
    }
}
