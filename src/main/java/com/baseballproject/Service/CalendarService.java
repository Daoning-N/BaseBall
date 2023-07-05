package com.baseballproject.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import com.baseballproject.entity.Calendar;

@Service
public class CalendarService {
  

  
  public List<Calendar> getData(String month, String team) throws IOException {

    String URL = "https://sports.news.naver.com/kbaseball/schedule/index?date=20230601&month=0"+month+"&year=2023&teamCode="+team;
    List<Calendar> dataList = new ArrayList<>();
    Document document = Jsoup.connect(URL).get();

    Elements contents = document.getElementById("calendarWrap").children();
    
    for(Element content : contents) {
      Calendar calendar = Calendar.builder()
                        .team_lft(content.getElementsByClass("team_lft").text())
                        .team_rgt(content.getElementsByClass("team_rgt").text())
                        .time(content.getElementsByClass("td_hour").text())
                        .date(content.getElementsByClass("td_date").select("strong").text())
                        .build();
      dataList.add(calendar); 
      System.out.println(calendar);
    }
    
    return dataList;
  }
}
