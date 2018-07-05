package com.henrymin.springbootstarter.topic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * Created by henry on 7/4/18.
 */
@RestController
public class TopicController {

    @RequestMapping("/topics")
    public List<Topic> getAllTopics() {
        return Arrays.asList(
                new Topic("spring", "spring framework", "spring framework description"),
                new Topic("java", "Core Java", "Core Java Description")
        );
    }
}
