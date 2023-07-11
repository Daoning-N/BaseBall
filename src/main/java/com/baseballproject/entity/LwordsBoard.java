package com.baseballproject.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class LwordsBoard {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int lidx;

  private String Lw_title;
  private String Lw_content;
}
