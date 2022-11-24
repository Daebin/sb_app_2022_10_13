package com.sbs.exam.sb_app_2022_10_13.home.controller;


import com.sbs.exam.sb_app_2022_10_13.article.vo.Article;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class UserHomeController {

  private int count;

  public UserHomeController(){
    count=0;
  }

  @RequestMapping("/usr/home/getCount")
  @ResponseBody
  public int getCount(){

   count++;
    return count;
  }

  @RequestMapping("/usr/home/getString")
  @ResponseBody
  public String getString(){
    return "Hi";
  }

  @RequestMapping("/usr/home/getInt")
  @ResponseBody
  public int getInt(){
    return 10;
  }

  @RequestMapping("/usr/home/getFloat")
  @ResponseBody
  public float getFloat(){
    return 10.5f;
  }

  @RequestMapping("/usr/home/getDouble")
  @ResponseBody
  public double getDouble(){
    return 10.5;
  }

  @RequestMapping("/usr/home/getBoolean")
  @ResponseBody
  public boolean getBoolean(){
    return true;
  }

  @RequestMapping("/usr/home/getCharacter")
  @ResponseBody
  public char getCharacter(){
    return 'a';
  }

  @RequestMapping("/usr/home/getList")
  @ResponseBody
  public List<String> getList(){
    List<String> list = new ArrayList<>();
    list.add("철수");
    list.add("영희");

    return list;
  }
  @RequestMapping("/usr/home/getArticle")
  @ResponseBody
  public Article getArticle(){
    Article article = new Article(1,"제목1","내용1");

    return article;
  }

  @RequestMapping("/usr/home/getArticles")
  @ResponseBody
  public List<Article> getArticles(){
    Article article1 = new Article(1,"제목1","내용2");
    Article article2 = new Article(2,"제목2","내용3");

    List<Article> list = new ArrayList<>();
    list.add(article1);
    list.add(article2);

    return list;
  }


  @RequestMapping("/usr/home/doSetCount")
  @ResponseBody
  public String doSetCount(int count, int count2){
    this.count=count;
    return "count의 값이"+ this.count+"으로 초기화 되었습니다.";
  }
}

