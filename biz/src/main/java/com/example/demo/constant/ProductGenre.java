package com.example.demo.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ProductGenre {

  /** The shoes. */
  SHOES("1", "shoes"),
  /** The tops. */
  TOPS("2", "tops"),
  /** The bags. */
  BAGS("3", "bags");

  /** The code. */
  private final String code;

  /** The property. */
  private final String property;

}
