package io.reactivesw.catalog.inventory.domain.service;

import io.reactivesw.catalog.inventory.application.model.InventoryEntry;
import io.reactivesw.catalog.inventory.application.model.InventoryEntryDraft;
import io.reactivesw.catalog.inventory.application.model.mapper.InventoryEntryMapper;
import io.reactivesw.catalog.inventory.domain.entity.InventoryEntryEntity;
import io.reactivesw.catalog.inventory.infrastructure.repository.InventoryEntryRepository;
import io.reactivesw.common.exception.NotExistException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Davis on 16/12/21.
 */
@Service
public class InventoryEntryService {
  /**
   * log.
   */
  private static final Logger LOG = LoggerFactory.getLogger(InventoryEntryService.class);

  /**
   * The Inventory entry repository.
   */
  @Autowired
  private transient InventoryEntryRepository inventoryEntryRepository;

  /**
   * Create inventory entry inventory entry.
   *
   * @param draft the draft
   * @return the inventory entry
   */
  public InventoryEntry createInventoryEntry(InventoryEntryDraft draft) {
    LOG.debug("enter createInventoryEntry, inventory entry draft is : {}", draft.toString());

    InventoryEntryEntity entity = InventoryEntryMapper.modelToEntity(draft);
    InventoryEntryEntity savedEntity = inventoryEntryRepository.save(entity);

    InventoryEntry result = InventoryEntryMapper.entityToModel(savedEntity);

    LOG.debug("end createInventoryEntry, new InventoryEntry is : {}", result.toString());

    return result;
  }

  /**
   * Gets inventory entry by id.
   *
   * @param id the id
   * @return the inventory entry by id
   */
  public InventoryEntry getInventoryEntryById(String id) {
    LOG.debug("enter getInventoryEntryById, id is : {}", id);

    InventoryEntryEntity entity = getInventoryEntryEntity(id);

    InventoryEntry result = InventoryEntryMapper.entityToModel(entity);

    LOG.debug("end getInventoryEntryById, get result is : {}", result.toString());

    return result;
  }

  /**
   * Gets inventoryentry.
   *
   * @param id the id
   * @return the inventory entry entity
   */
  protected InventoryEntryEntity getInventoryEntryEntity(String id) {
    InventoryEntryEntity entity = inventoryEntryRepository.findOne(id);
    if (entity == null) {
      LOG.debug("can not find inventoryentry by id : {}", id);
      throw new NotExistException("InventoryEntry Not Found");
    }
    return entity;
  }
}
