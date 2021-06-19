package com.shopping.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name="products")
public class Product {
    @Id
    @GenericGenerator(name = "generator", strategy = "increment") //设置主键自增
    @GeneratedValue(generator = "generator")
    @Column(name="id")
    private int id;//产品ID
    @Column(name="name")
    private String name;//产品名字
    @Column(name="description")
    private String description;//产品描述
    @Column(name="key_word")
    private String keyWord;//关键词
    @Column(name="price")
    private int price;//产品价格
    @Column(name="counts")
    private int counts;//库存数量
    @Column(name="type")
    private int type;//产品类型

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getKeyWord() {
        return keyWord;
    }
    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getCounts() {
        return counts;
    }
    public void setCounts(int counts) {
        this.counts = counts;
    }
    public int getType() {
        return type;
    }
    public void setType(int type) {
        this.type = type;
    }
}
