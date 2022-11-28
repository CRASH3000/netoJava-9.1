package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ApiFormTest {

    @Test
    public void testBirDay () {
        Post post = new Post();
        post.birthday = new FormDate();

        post.birthday.day = 11;

        int expected = 11;
        int actual = post.birthday.day;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testBirMonth () {
        Post post = new Post();
        post.birthday = new FormDate();

        post.birthday.month = 6;

        int expected = 6;
        int actual = post.birthday.month;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testBirYear () {
        Post post = new Post();
        post.birthday = new FormDate();

        post.birthday.year = 2000;

        int expected = 2000;
        int actual = post.birthday.year;

        Assertions.assertEquals(expected, actual);
    }
}
