package com.in28minutes.mockito.mockitodemo;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ListTest {

    @Test
    public void testListSize() {
        List listMock = mock(List.class);
        when(listMock.size()).thenReturn(10);
        assertEquals(10, listMock.size());
    }

    @Test
    public void testListSizeMultipleReturns() {
        List listMock = mock(List.class);
        when(listMock.size()).thenReturn(10).thenReturn(20);
        assertEquals(10, listMock.size());
        assertEquals(20, listMock.size());
        assertEquals(20, listMock.size());
    }

    @Test
    public void testGetFromListSpecificParameter() {
        List listMock = mock(List.class);
        when(listMock.get(0)).thenReturn("Some string");
        assertEquals("Some string", listMock.get(0));
        assertEquals(null, listMock.get(1));
    }

    @Test
    public void testGetFromListGenericParameter() {
        List listMock = mock(List.class);
        when(listMock.get(Mockito.anyInt())).thenReturn("Some string");
        assertEquals("Some string", listMock.get(0));
        assertEquals("Some string", listMock.get(1));
        assertEquals("Some string", listMock.get(234));
    }
}
