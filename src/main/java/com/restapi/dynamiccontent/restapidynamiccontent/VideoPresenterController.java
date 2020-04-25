package com.restapi.dynamiccontent.restapidynamiccontent;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VideoPresenterController {

    @RequestMapping(method = RequestMethod.GET, path = "/GetVideos/{videoTopic}")
    public String getVideos(@PathVariable String videoTopic) {
        switch (videoTopic) {
            case "python":
                return "This is all our Python videos.";
            case "java":
                return "This is all our Java videos.";
            default:
                return "Sorry, incorrect input.";
        }
    }
}
