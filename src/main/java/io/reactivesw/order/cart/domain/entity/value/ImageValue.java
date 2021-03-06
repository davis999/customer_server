package io.reactivesw.order.cart.domain.entity.value;

import io.reactivesw.common.entity.BaseIdEntity;
import io.reactivesw.common.model.AssetDimensions;
import io.reactivesw.common.util.converter.AssetDimensionsJsonConverter;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Davis on 16/11/23.
 */
@Entity
@Table(name = "order_cart_image")
public class ImageValue extends BaseIdEntity {

  /**
   * image url.
   */
  @Column(name = "url")
  private String url;

  /**
   * label.
   */
  @Column(name = "dimensions", columnDefinition = "JSON")
  @Convert(converter = AssetDimensionsJsonConverter.class)
  private AssetDimensions dimensions;

  /**
   * label.
   */
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

  /**
   * to string method.
   *
   * @return String
   */
  @Override
  public String toString() {
    return "ImageValue{"
        + "url='" + url + '\''
        + ", dimensions=" + dimensions
        + ", label='" + label + '\''
        + '}';
  }
}
