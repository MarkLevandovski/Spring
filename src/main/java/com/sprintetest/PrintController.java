package com.sprintetest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Marek Lewandowski on 26.04.17.
 */
@Controller
public class PrintController {

    @Autowired
    PrintNameService printNameService;

    @Autowired
    PrintSurnameService printSurnameService;

    @RequestMapping(value = "/printfullname", method = RequestMethod.GET)
    public String printFullName() {
        String name = printNameService.printName();
        String surname = printSurnameService.printSurname();

        return name + surname;
    }
}
