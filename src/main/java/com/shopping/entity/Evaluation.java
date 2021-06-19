package com.shopping.entity;

import javax.persistence.*;


@Entity
@Table(name="evaluation")
@IdClass(value=ShoppingRecordPriKey.class)
public class Evaluation {
    @Id
    @Column(name="user_id")
    private int userId;//用户ID
    @Id
    @Column(name="product_id")
    private int productId;//产品ID
    @Id
    @Column(name="time")
    private String time;//评价时间
    @Column(name="content")
    private String content;//评价内容


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


    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
