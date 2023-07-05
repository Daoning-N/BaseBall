package com.baseballproject.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.baseballproject.Service.CalendarService;
import com.baseballproject.entity.Calendar;

@Controller
public class CalendarController {
  
  private final CalendarService calendarService;

  public CalendarController(CalendarService calendarService){
    this.calendarService = calendarService;
  }

  @GetMapping("/bears/Calendar.do")
  public String Calendar(Model model, @RequestParam String month, @RequestParam String team) throws Exception {
    System.out.println(month+team);
    List<Calendar> dataList = calendarService.getData(month,team);
    model.addAttribute("data", dataList);
    return "./bears/info_play_bear";
  }
}
