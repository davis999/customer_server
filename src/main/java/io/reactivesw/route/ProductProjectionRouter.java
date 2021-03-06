package io.reactivesw.route;

import static io.reactivesw.route.BaseRouter.URL_ROOT;

/**
 * Created by Davis on 16/12/21.
 */
public final class ProductProjectionRouter {
  /**
   * product project root.
   */

  public static final String PRODUCT_PROJECTION_ROOT = URL_ROOT + "/product-projections";

  /**
   * product project id.
   */
  public static final String PRODUCT_PROJECTION_ID = "productProjectId";

  /**
   * product project with id.
   */
  public static final String PRODUCT_PROJECTION_WITH_ID = PRODUCT_PROJECTION_ROOT
      + "/{" + PRODUCT_PROJECTION_ID + "}";
}
