package com.example.demo.service.session;

import org.springframework.stereotype.Service;

import com.example.demo.entity.domain.UserMst;
import com.example.demo.entity.session.SessionData;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SessionService {

  /** The session data. */
  private final SessionData sessionData;

  /**
   * Gets the user seq.
   *
   * @return the user seq
   */
  public Long getUserSeq() {
    return sessionData.getUserSeq();
  }

  /**
   * Gets the user account.
   *
   * @return the user account
   */
  public String getUserAccount() {
    return sessionData.getUserAccount();
  }

  /**
   * Gets the user name.
   *
   * @return the user name
   */
  public String getUserName() {
    return sessionData.getUserName();
  }

  /**
   * Gets the user locale.
   *
   * @return the user locale
   */
  public String getUserLocale() {
    return sessionData.getUserLocale();
  }

  /**
   * Gets the user langage.
   *
   * @return the user langage
   */
  public String getUserLangage() {
    return sessionData.getUserLanguage();
  }

  /**
   * Gets the user timezone.
   *
   * @return the user timezone
   */
  public String getUserTimezone() {
    return sessionData.getUserTimezone();
  }

  /**
   * Gets the user currency.
   *
   * @return the user currency
   */
  public String getUserCurrency() {
    return sessionData.getUserCurrency();
  }

  /**
   * Gets the user sub menu role.
   *
   * @return the user sub menu role
   */
  public String getUserSubMenuRole() {
    return sessionData.getUserSubMenuRole();
  }

  /**
   * Sets the user seq.
   *
   * @param userSeq the new user seq
   */
  public void setUserSeq(Long userSeq) {
    sessionData.setUserSeq(userSeq);
  }

  /**
   * Sets the user account.
   *
   * @param userAccount the new user account
   */
  public void setUserAccount(String userAccount) {
    sessionData.setUserAccount(userAccount);
  }

  /**
   * Sets the user name.
   *
   * @param userName the new user name
   */
  public void setUserName(String userName) {
    sessionData.setUserName(userName);
  }

  /**
   * Sets the user locale.
   *
   * @param userLocale the new user locale
   */
  public void setUserLocale(String userLocale) {
    sessionData.setUserLocale(userLocale);
  }

  /**
   * Sets the user timezone.
   *
   * @param userTimezone the new user timezone
   */
  public void setUserTimezone(String userTimezone) {
    sessionData.setUserTimezone(userTimezone);
  }

  /**
   * Sets the user currency.
   *
   * @param userCurrency the new user currency
   */
  public void setUserCurrency(String userCurrency) {
    sessionData.setUserCurrency(userCurrency);
  }

  /**
   * Sets the user sub menu role.
   *
   * @param userSubMenuRole the new user sub menu role
   */
  public void setUserSubMenuRole(String userSubMenuRole) {
    sessionData.setUserSubMenuRole(userSubMenuRole);
  }

  /**
   * Sets the up session.
   *
   * @param userMst the new up session
   */
  public void setupSession(UserMst userMst) {

    setUserSeq(userMst.getUserSeq());
    setUserAccount(userMst.getUserAccount());
    setUserName(userMst.getUserName());
    setUserLocale(userMst.getUserLocale());
    setUserTimezone(userMst.getUserTimezone());
    setUserCurrency(userMst.getUserCurrency());
    setUserSubMenuRole(userMst.getUserSubMenuRole());

  }
}
