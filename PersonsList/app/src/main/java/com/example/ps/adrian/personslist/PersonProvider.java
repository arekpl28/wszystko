package com.example.ps.adrian.personslist;

import android.app.Activity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Adrian on 2017-04-01.
 */

public class PersonProvider {

    public List<Person> provide() {

        List<Person> result = new ArrayList<>();
        result.add(new Person("Jan", 22));
        result.add(new Person("Adam", 12));
        result.add(new Person("Jakub", 29));
        result.add(new Person("Grażyna", 21));
        return result;
    }
}
