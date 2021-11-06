package ua.intita.qa.homework13.generic;

import java.util.ArrayList;
import java.util.List;

public class TestOne<One> {
    private List<One> ones = new ArrayList<>();

    public TestOne(List<One> ones) {
        this.ones = ones;
    }

    public TestOne() {

    }

    public List<One> getOnes() {
        return ones;
    }

    public void setOnes(List<One> ones) {
        this.ones = ones;
    }

    @Override
    public String toString() {
        return "Test{" +
                "ones=" + ones +
                '}';
    }
}
