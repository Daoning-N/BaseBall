package com.baseballproject.entity;

import java.sql.Timestamp;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class DcheerBoard {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int didx;

  private String Dc_title;
  private String Dc_content;
  private String Dc_pw;
  private Timestamp Dc_date;
}
