package com.baseballproject.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

@Service
public class WinService {
  public String LGWin() throws IOException {
    System.out.println("test1");
    String URL = "https://sports.news.naver.com/kbaseball/record/index?category=kbo";
    String LGWin = "";
    int index_win = -1;
    List<String> lank = new ArrayList<>();
    List<String> team = new ArrayList<>();

    Document document = Jsoup.connect(URL).get();

    Elements contents = document.getElementById("regularTeamRecordList_table").children();

    for (Element content : contents) {
      lank.add(content.getElementsByTag("tr").select("th").select("strong").text().toString());
      team.add(content.getElementsByTag("td").select("span").get(1).text().toString());

    }
    for (int i = 0; i < lank.size(); i++) {
      if (team.get(i).equals("LG")) {
        index_win = i;
      }
    }
    LGWin = lank.get(index_win).toString();
    System.out.println(LGWin);

    return LGWin;
  }

  public String OBWin() throws IOException {
    System.out.println("test2");
    String URL = "https://sports.news.naver.com/kbaseball/record/index?category=kbo";
    String OBWin = "";
    int index_win = -1;
    List<String> lank = new ArrayList<>();
    List<String> team = new ArrayList<>();

    Document document = Jsoup.connect(URL).get();

    Elements contents = document.getElementById("regularTeamRecordList_table").children();

    for (Element content : contents) {
      lank.add(content.getElementsByTag("tr").select("th").select("strong").text().toString());
      team.add(content.getElementsByTag("td").select("span").get(1).text().toString());

    }
    for (int i = 0; i < lank.size(); i++) {
      if (team.get(i).equals("두산")) {
        index_win = i;
      }
    }
    OBWin = lank.get(index_win).toString();
    System.out.println(OBWin);

    return OBWin;
  }
}