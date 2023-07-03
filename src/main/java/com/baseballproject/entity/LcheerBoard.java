package com.baseballproject.entity;

import java.sql.Timestamp;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;


@Entity
@Data
public class LcheerBoard {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int Lc_idx;

  private String Lc_title;
  private String Lc_content;
  private String Lc_pw;
  private Timestamp Lc_date;
}
