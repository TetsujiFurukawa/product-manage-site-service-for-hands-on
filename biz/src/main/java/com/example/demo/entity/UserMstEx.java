package com.example.demo.entity;

import java.io.Serializable;
import com.example.demo.entity.domain.UserMst;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserMstEx extends UserMst implements Serializable {

  private static final long serialVersionUID = 1881004410937914901L;

  private static final String DELIMIT_LOCALE = "-";

  /**
   * Gets the user language.
   *
   * @return the user language
   */
  public String getUserLanguage() {

    String[] items = getUserLocale().split(DELIMIT_LOCALE);

    return items[0];

  }
}
