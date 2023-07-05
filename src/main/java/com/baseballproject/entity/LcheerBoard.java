package com.baseballproject.entity;

import java.sql.Timestamp;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Entity
@Data
public class LcheerBoard {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int lidx;

  private String Lc_title;
  private String Lc_content;
  private String Lc_pw;
  
  @UpdateTimestamp
  private LocalDateTime Lc_date;
}
