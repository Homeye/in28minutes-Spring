package com.in28minutes.mockito.mockitodemo;

import org.junit.Test;

import static org.junit.Assert.*;

public class SomeBusinessImplStubTest {

    @Test
    public void testFindTheGreatestFromAllData() {
        SomeBusinessImpl someBusinessImpl = new SomeBusinessImpl(new DataServiceStub());
        int result = someBusinessImpl.findTheGreatestFromAllData();
        assertEquals(24, result);
    }
}

class DataServiceStub implements DataService {

    @Override
    public int[] retrieveAllData() {
        return new int[]{24, 6, 15};
    }
}