/**
 * FileName: ShoppingSale
 * Author:   江七
 * Date:     2020/12/17 16:03
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.shopping.entity;

import javax.persistence.*;

@Entity
@Table(name="shopping_Sale")
@IdClass(value=ShoppingSalePriKey.class)
public class ShoppingSale {

    @Id
    @Column(name="product_id")
    private int productId;

    @Column(name="total_price")
    private int totalPrice;
    @Column(name="counts")
    private int counts;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getCounts() {
        return counts;
    }

    public void setCounts(int counts) {
        this.counts = counts;
    }


}