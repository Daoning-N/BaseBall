package com.baseballproject.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.UpdateTimestamp;

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

  @UpdateTimestamp
  private LocalDateTime Dc_date;
}
