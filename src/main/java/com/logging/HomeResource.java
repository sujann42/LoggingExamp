package com.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {

    Logger logger = LoggerFactory.getLogger(HomeResource.class);


    @RequestMapping("/")
    public String home() {

        //Tracing errors. To show trace, define property in application.properties
        //logging.level.root=TRACE
        logger.trace("Home method executed!!!!");
        //This is for printing error on the console.
        logger.error("Error Occured!!!");
        return "Hello from Spring boot app that shows how to log";

    }
}
