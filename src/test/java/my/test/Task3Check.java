package my.test;

import org.junit.Assert;
import org.junit.Test;

public class Task3Check {

    @Test
    public void test() {
        Assert.assertEquals(Integer.valueOf(5), Task3.equationSolution("2+4-3+2"));
        Assert.assertEquals(Integer.valueOf(-1), Task3.equationSolution("100-101"));
        Assert.assertEquals(Integer.valueOf(3), Task3.equationSolution("-2+5"));
        Assert.assertEquals(Integer.valueOf(11), Task3.equationSolution("7--3+1"));
        Assert.assertEquals(Integer.valueOf(-1), Task3.equationSolution("-4+3---2+2"));
    }
}
