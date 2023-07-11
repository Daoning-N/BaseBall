package com.baseballproject.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class DwordsBoard {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int didx;

  private String Dw_title;
  private String Dw_content;
}
