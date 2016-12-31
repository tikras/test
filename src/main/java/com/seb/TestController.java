package com.seb;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by audri on 2016-12-30.
 */
@RestController
public class TestController {
    @Value("${userBucket.path}")
    private String userBucketPath;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return "Hi";
    }
}
