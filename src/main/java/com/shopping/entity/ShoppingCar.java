package com.shopping.entity;

import javax.persistence.*;


@Entity
@Table(name="shopping_car")
@IdClass(value=ShoppingCarPriKey.class)
public class ShoppingCar {
    @Id
    @Column(name="user_id")
    private int userId;//用户ID
    @Id
    @Column(name="product_id")
    private int productId;//产品ID
    @Column(name="product_price")
    private int productPrice;//产品价格
    @Column(name="counts")
    private int counts;//产品数量

    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }
    public int getProductId() {
        return productId;
    }
    public void setProductId(int productId) {
        this.productId = productId;
    }
    public int getProductPrice() {
        return productPrice;
    }
    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }
    public int getCounts() {
        return counts;
    }
    public void setCounts(int counts) {
        this.counts = counts;
    }
}
