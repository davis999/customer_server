package io.reactivesw.catalog.inventory.application.model.action;

import io.reactivesw.common.model.UpdateAction;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by Davis on 16/12/21.
 */
@Data
@EqualsAndHashCode
public class RemoveQuantityAction implements UpdateAction {
  /**
   * The Quantity.
   */
  private Integer quantity;
}
