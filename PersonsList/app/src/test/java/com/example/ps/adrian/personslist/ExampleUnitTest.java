package com.example.ps.adrian.personslist;

import org.junit.Test;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        String text = "Jakiś text";
        text.replace("ś","s");
        System.out.println(text);
    }

    @Test
    public void sortTest() throws Exception {

        PersonProvider provider = new PersonProvider();
        List<Person> persons = provider.provide();

        Collections.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        for (Person person : persons) {
            System.out.println(person);
        }

    }
}