package com.sprintetest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Marek Lewandowski on 26.04.17.
 */
public class PrintControllerJunitTest {
    private PrintNameService printNameService;
    private PrintSurnameService printSurnameService;
    private PrintController printController;

    @Before
    public void setUp() {
        printNameService = new PrintNameService();
        printSurnameService = new PrintSurnameService();
        printController = new PrintController();

        printController.setPrintNameService(printNameService);
        printController.setPrintSurnameService(printSurnameService);
    }

    @Test
    public void printFullNameTest() {
        printNameService.printName();
        printSurnameService.printSurname();
        String fullName = printController.printFullName();

        Assert.assertEquals(fullName, "MarekLewandowski");
    }
}
