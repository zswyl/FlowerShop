/**
 * FileName: ShoppingSalePriKey
 * Author:   江七
 * Date:     2020/12/18 10:07
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.shopping.entity;
import java.io.Serializable;

public class ShoppingSalePriKey implements Serializable {
    private int productId;
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ShoppingSalePriKey)) return false;

        ShoppingSalePriKey that = (ShoppingSalePriKey) o;

        return productId == that.productId;

    }
    @Override
    public int hashCode() {
        return productId;
    }
}