package io.reactivesw.catalog.category.application.model.mapper;

import io.reactivesw.catalog.category.application.model.action.SetExternalID;
import io.reactivesw.catalog.category.domain.entity.CategoryEntity;
import io.reactivesw.common.model.UpdateAction;

/**
 * Created by Davis on 16/12/7.
 */
public class ExternalIDMapper implements CategoryUpdateMapper<CategoryEntity> {

  @Override
  public void handle(CategoryEntity entity, UpdateAction action) {
    SetExternalID setExternalID = (SetExternalID) action;
    entity.setExternalId(setExternalID.getExternalId());
  }
}
