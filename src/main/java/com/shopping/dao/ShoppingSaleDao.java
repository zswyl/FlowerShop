/**
 * FileName: ShoppingSaleDao
 * Author:   江七
 * Date:     2020/12/17 16:24
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.shopping.dao;

import com.shopping.entity.ShoppingSale;

import java.util.List;

public interface ShoppingSaleDao {
    List<ShoppingSale> getAllSale();
    public ShoppingSale getSaleById(int productId);
    public void addSale(ShoppingSale shoppingSale);
    public boolean updateSale(ShoppingSale shoppingSale);
}