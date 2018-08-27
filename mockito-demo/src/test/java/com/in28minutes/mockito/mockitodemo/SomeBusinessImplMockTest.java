package com.in28minutes.mockito.mockitodemo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class SomeBusinessImplMockTest {

    @Test
    public void testFindTheGreatestFromAllData() {
        DataService dataServiceMock = mock(DataService.class);
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{24, 6, 15});
        SomeBusinessImpl someBusinessImpl = new SomeBusinessImpl(dataServiceMock);
        int result = someBusinessImpl.findTheGreatestFromAllData();
        assertEquals(24, result);
    }

    @Test
    public void testFindTheGreatestFromAllDataForOneValue() {
        DataService dataServiceMock = mock(DataService.class);
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{15});
        SomeBusinessImpl someBusinessImpl = new SomeBusinessImpl(dataServiceMock);
        int result = someBusinessImpl.findTheGreatestFromAllData();
        assertEquals(15, result);
    }
}
