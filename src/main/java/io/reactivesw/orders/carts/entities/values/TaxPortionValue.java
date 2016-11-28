package io.reactivesw.orders.carts.entities.values;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.Table;

import io.reactivesw.common.entities.BaseIdEntity;
import io.reactivesw.common.models.Money;
import io.reactivesw.common.utils.MoneyJsonConverter;

/**
 * Created by umasuo on 16/11/17.
 */
@Entity
@Table(name = "orders_carts_tax_portion")
public class TaxPortionValue extends BaseIdEntity{

  /**
   * name.
   */
  @Column
  private String name;

  /**
   * rate.
   */
  @Column
  private Float rate;

  /**
   * amount of money.
   */
  @Column(name = "amount", nullable = false, columnDefinition = "JSON")
  @Convert(converter = MoneyJsonConverter.class)
  private Money amount;

  /**
   * Gets name.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Sets name.
   *
   * @param name the name
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Gets rate.
   *
   * @return the rate
   */
  public Float getRate() {
    return rate;
  }

  /**
   * Sets rate.
   *
   * @param rate the rate
   */
  public void setRate(Float rate) {
    this.rate = rate;
  }

  /**
   * Gets amount.
   *
   * @return the amount
   */
  public Money getAmount() {
    return amount;
  }

  /**
   * Sets amount.
   *
   * @param amount the amount
   */
  public void setAmount(Money amount) {
    this.amount = amount;
  }
}