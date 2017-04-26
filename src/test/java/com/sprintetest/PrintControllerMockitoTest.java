package com.sprintetest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.*;

import static org.mockito.Mockito.*;

/**
 * Created by Marek Lewandowski on 26.04.17.
 */
public class PrintControllerMockitoTest {

    @InjectMocks
    private PrintController printController;

    @Mock
    private PrintNameService printNameService;

    @Spy
    private PrintSurnameService printSurnameService;

    @Before
    public void setUp() {
        printController = new PrintController();
        MockitoAnnotations.initMocks(this);

        when(printNameService.printName()).thenReturn("Marek");
    }

    @Test
    public void printFullNameTest() {
        String fullName = printController.printFullName();

        Assert.assertEquals("MarekLewandowski", fullName);
    }
}
