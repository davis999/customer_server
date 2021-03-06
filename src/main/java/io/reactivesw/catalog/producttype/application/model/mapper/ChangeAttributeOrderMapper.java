package io.reactivesw.catalog.producttype.application.model.mapper;

import io.reactivesw.catalog.producttype.domain.entity.ProductTypeEntity;
import io.reactivesw.common.model.UpdateAction;

/**
 * Created by Davis on 16/12/12.
 */
public class ChangeAttributeOrderMapper implements ProductTypeUpdateMapper<ProductTypeEntity> {
  @Override
  public void handle(ProductTypeEntity entity, UpdateAction action) {
    // The attributes must be equal to the product type attributes (except for the order).
  }
}
