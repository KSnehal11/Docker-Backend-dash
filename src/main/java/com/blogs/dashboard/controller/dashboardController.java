package com.blogs.dashboard.controller;

import com.blogs.dashboard.model.comment;
import com.blogs.dashboard.model.dashboardModel;
import com.blogs.dashboard.service.dashboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/dashboard")
@CrossOrigin(allowedHeaders ="*", origins="*" )
public class dashboardController
{
    @Autowired
    dashboardService service;



    @PostMapping("/addblog/{id}")
    public ResponseEntity<?> addB(@PathVariable String id ,  @RequestBody  dashboardModel model)
    {
        return new ResponseEntity<>(service.addBlog(id,model), HttpStatus.CREATED);
    }

    @GetMapping("/getblogs")
    public ResponseEntity<?> shoB()
    {
        return new ResponseEntity<>(service.showBlogs(), HttpStatus.OK);
    }

    @PostMapping("/addcomment/{vId}")
    public ResponseEntity<?> addC(@PathVariable String vId , @RequestBody comment com)
    {
        return new ResponseEntity<>(service.addComm(vId , com),HttpStatus.OK);
    }
    @GetMapping("getcomments/{vId}")
    public ResponseEntity<?> showC(@PathVariable String vId)
    {
        return new ResponseEntity<>(service.showCom(vId),HttpStatus.OK);
    }
}
