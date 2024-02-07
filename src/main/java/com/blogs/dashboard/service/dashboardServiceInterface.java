package com.blogs.dashboard.service;

import com.blogs.dashboard.model.comment;
import com.blogs.dashboard.model.dashboardModel;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface dashboardServiceInterface {
    public dashboardModel addBlog(String id , dashboardModel model);
    public List<dashboardModel> showBlogs();
    String uploadImage(String path , MultipartFile file) throws IOException;

    public comment addComm(String vId, comment com);

    public List<comment> showCom(String vId);
}
