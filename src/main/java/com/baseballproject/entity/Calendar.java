package com.baseballproject.entity;



import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@ToString
public class Calendar {
  private String team_lft;
  private String team_rgt;
  private String time;
  private String date;
}
