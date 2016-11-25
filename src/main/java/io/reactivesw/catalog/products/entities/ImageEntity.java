package io.reactivesw.catalog.products.entities;

import io.reactivesw.common.entities.BaseIdEntity;
import io.reactivesw.common.models.AssetDimensions;
import io.reactivesw.common.utils.AssetDimensionsJsonConverter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Davis on 16/11/23.
 */
@Entity
@Table(name = "sw_image")
public class ImageEntity extends BaseIdEntity{

  @Column(name = "url")
  private String url;

  @Column(name = "dimensions", columnDefinition = "JSON")
  @Convert(converter = AssetDimensionsJsonConverter.class)
  private AssetDimensions dimensions;

  @Column(name = "label")
  private String label;

  /**
   * Gets id.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Sets id.
   *
   * @param id the id
   */
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Gets url.
   *
   * @return the url
   */
  public String getUrl() {
    return url;
  }

  /**
   * Sets url.
   *
   * @param url the url
   */
  public void setUrl(String url) {
    this.url = url;
  }

  /**
   * Gets dimensions.
   *
   * @return the dimensions
   */
  public AssetDimensions getDimensions() {
    return dimensions;
  }

  /**
   * Sets dimensions.
   *
   * @param dimensions the dimensions
   */
  public void setDimensions(AssetDimensions dimensions) {
    this.dimensions = dimensions;
  }

  /**
   * Gets label.
   *
   * @return the label
   */
  public String getLabel() {
    return label;
  }

  /**
   * Sets label.
   *
   * @param label the label
   */
  public void setLabel(String label) {
    this.label = label;
  }

  @Override
  public String toString() {
    return "ImageEntity{" +
        "id='" + id + '\'' +
        ", url='" + url + '\'' +
        ", dimensions=" + dimensions +
        ", label='" + label + '\'' +
        '}';
  }
}