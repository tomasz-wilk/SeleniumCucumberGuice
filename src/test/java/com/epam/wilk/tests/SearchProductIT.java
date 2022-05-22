package com.epam.wilk.tests;

import com.epam.wilk.steps.setup.CookieExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(CookieExtension.class)
public class SearchProductIT {

    @Test
    void testCookie(){
        System.out.println("test");
    }

}
