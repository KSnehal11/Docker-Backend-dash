package com.blogs.dashboard.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import java.util.List;

@Document(collection = "blogs")
public class dashboardModel {
   @Id
   private String id;

   private String title;
   private String author;
   private String description;

   private String url;

   private String date ;
   public String getDescription() {
      return description;
   }

   public void setDescription(String description) {
      this.description = description;
   }

   public String getDate() {
      return date;
   }

   public void setDate(String date) {
      this.date = date;
   }






   public dashboardModel(String id, String title ,  String author, String description, String url , String date) {
      this.id = id;
      this.title = title;
      this.author = author;
      this.description = description;
      this.url = url;
      this.date = date;
   }

   public dashboardModel() {
   }

   public String getId() {
      return id;
   }

   public void setId(String id) {
      this.id = id;
   }

   public String getTitle() {
      return title;
   }

   public void setTitle(String title) {
      this.title = title;
   }

   public String getAuthor() {
      return author;
   }

   public void setAuthor(String author) {
      this.author = author;
   }


   public String getUrl() {
      return url;
   }

   public void setUrl(String url) {
      this.url = url;
   }
}