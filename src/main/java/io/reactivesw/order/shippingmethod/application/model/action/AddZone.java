package io.reactivesw.order.shippingmethod.application.model.action;

import io.reactivesw.common.model.UpdateAction;
import io.reactivesw.common.model.Reference;

/**
 * this used for add and remove zone.
 * Created by umasuo on 16/12/8.
 */
public class AddZone implements UpdateAction {

  /**
   * The Zone.
   */
  Reference zone;

  /**
   * Gets zone.
   *
   * @return the zone
   */
  public Reference getZone() {
    return zone;
  }

  /**
   * Sets zone.
   *
   * @param zone the zone
   */
  public void setZone(Reference zone) {
    this.zone = zone;
  }
}
