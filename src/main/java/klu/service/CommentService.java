package klu.service;


import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

import javax.xml.stream.events.Comment;

@Service
public class CommentService {
    private static final String JSON_PLACEHOLDER_API = "https://jsonplaceholder.typicode.com/comments";

    public List<Comment> fetchAllComments() {
        RestTemplate restTemplate = new RestTemplate();
        Comment[] commentsArray = restTemplate.getForObject(JSON_PLACEHOLDER_API, Comment[].class);
        return Arrays.asList(commentsArray);
    }
}
