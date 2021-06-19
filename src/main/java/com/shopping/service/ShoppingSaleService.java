/**
 * FileName: ShoppingSaleService
 * Author:   江七
 * Date:     2020/12/17 16:35
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.shopping.service;

import com.shopping.entity.ShoppingSale;

import java.util.List;

public interface ShoppingSaleService {
    public List<ShoppingSale> getAllSale();
    public void addSale(ShoppingSale shoppingSale);
    public ShoppingSale getSaleById(int productId);
    public boolean updateSale(ShoppingSale shoppingSale);
}