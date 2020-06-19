import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Algorithm2_test {

    private Algorithm2 test;

    private List<Integer>list;
    private List<Integer>list2;

    @Before
    public void listInit(){
        test=new Algorithm2();
        list=new ArrayList<Integer>();
    }


    @Test
    public void maximaAndMinimaElement(){
        list.add(-1000000);
        list.add(1000000);

        assertEquals(1,test.solution(list));
    }
    @Test
    public void oneElement(){
        list.add(435);
        assertEquals(1,test.solution(list));
    }
    @Test
    public void fewPositiveRandomElements(){
        list.add(4123);
        list.add(1);
        list.add(75);
        list.add(41);
        list.add(578);
        list.add(3);
        list.add(17);
        assertEquals(2,test.solution(list));
    }
    @Test
    public void fewNegativeRandomElements(){
        list.add(-123);
        list.add(-1);
        list.add(-75);
        list.add(-410);
        list.add(-58);
        list.add(-3);
        list.add(-7);
        assertEquals(1,test.solution(list));
    }
    @Test
    public void fewPositiveAndNegativeRandomElements(){
        list.add(-123);
        list.add(-1);
        list.add(-75);
        list.add(410);
        list.add(-58);
        list.add(-3);
        list.add(-7);
        list.add(4123);
        list.add(1);
        list.add(2);
        list.add(75);
        list.add(41);
        list.add(-578);
        list.add(3);
        list.add(17);
        assertEquals(4,test.solution(list));
    }

    @Test
    public void fromOneTo100000Elements(){
        for(int i=1;i<=100000;i++)
            list.add(i);
        assertEquals(100001,test.solution(list));
    }
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void EmptyList(){
        test.solution(list);
    }
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void TooLargeList(){
        for(int i=0;i<127000;i++)
            list.add(i);
        test.solution(list);
    }

    @Test(expected = NullPointerException.class)
    public void uninitializedList(){
        test.solution(list2);
    }

    @Test(expected = ArithmeticException.class)
    public void outOfRangeElement(){
        list.add(-123);
        list.add(-1);
        list.add(1234567);
        list.add(41);
        list.add(-578);
        list.add(3);
        list.add(17);
        test.solution(list);
    }

}
