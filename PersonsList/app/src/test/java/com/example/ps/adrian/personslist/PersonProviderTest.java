package com.example.ps.adrian.personslist;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Adrian on 2017-04-01.
 */
public class PersonProviderTest {



    @Test
    public void provide() throws Exception {
        PersonProvider provider = new PersonProvider();
        List<Person> result = provider.provide();
        //Assertions TODO
        assert result.size() == 3;
    }

}