package sdaacademy.pl.numberlistview;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class StatisticTest {
    List<Integer> testList = Arrays.asList(2,32,3,1,12);

    @Test
    public void meanTestList() throws Exception {
        double result = Statistic.mean(testList);
        assert 10.0 == result;
    }

    @Test
    public void meanEmptyList() throws Exception {
        assert Statistic.mean(Collections.EMPTY_LIST) == 0;
    }
    @Test
    public void maxTestList() throws Exception {

        int result = Statistic.max(testList);
        assert 32 == result;
    }

    @Test(expected = IllegalArgumentException.class)
    public void maxEmptyList() throws Exception {
        Statistic.max(Collections.EMPTY_LIST);
    }

    @Test
    public void minTestList() throws Exception {

        int result = Statistic.min(testList);
        assert 1 == result;
    }

    @Test(expected = IllegalArgumentException.class)
    public void minEmptyList() throws Exception {
        Statistic.min(Collections.EMPTY_LIST);
    }

}