package io.reactivesw.order.cart.application.model;

import io.reactivesw.catalog.taxcategory.application.model.ExternalTaxRateDraft;
import io.reactivesw.common.model.CustomFields;
import io.reactivesw.common.model.LocalizedString;
import io.reactivesw.common.model.Money;
import io.reactivesw.common.model.Reference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * CustomLineItem fields that can be used in query predicates: slug, name, quantity, money, state,
 * discountedPricePerQuantity.
 * Created by umasuo on 16/11/17.
 */
@ApiModel(description = "A custom line item is a generic item that can be added to the cart but is not bound to a product. " +
        "You can use it for discounts (negative money), vouchers, complex cart rules, additional service or fees." +
        "You control the lifecycle of this item.")
public class CustomLineItemDraft {

  @ApiModelProperty(value = "The name of this CustomLineItem.",
          required = true)
  private LocalizedString name;

  @ApiModelProperty(required = true)
  private Integer quantity;

  @ApiModelProperty(value = "The cost to add to the cart. The amount can be negative.", required = true)
  private Money money;

  @ApiModelProperty(value = "String A unique String in the cart to identify this CustomLineItem.", required = true)
  private String slug;

  @ApiModelProperty(value = "Reference to a TaxCategory", required = false)
  private Reference taxCategory;

  @ApiModelProperty(value = "An external tax rate can be set if the cart has the External TaxMode.",
          required = false)
  private ExternalTaxRateDraft externalTaxRate;

  @ApiModelProperty(required = false)
  private CustomFields custom;
}
