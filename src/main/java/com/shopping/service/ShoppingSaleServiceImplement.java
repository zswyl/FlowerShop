/**
 * FileName: ShoppingSaleServiceImplement
 * Author:   江七
 * Date:     2020/12/17 16:36
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.shopping.service;

import com.shopping.dao.ShoppingSaleDao;
import com.shopping.entity.ShoppingSale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShoppingSaleServiceImplement implements ShoppingSaleService {
    @Autowired
    private ShoppingSaleDao shoppingSaleDao;

    @Override
    public List<ShoppingSale> getAllSale() {
        return shoppingSaleDao.getAllSale();
    }

    @Override
    public void addSale(ShoppingSale shoppingSale) {
        shoppingSaleDao.addSale(shoppingSale);
    }


    @Override
    public ShoppingSale getSaleById(int productId) {
        return shoppingSaleDao.getSaleById(productId);
    }

    @Override
    public boolean updateSale(ShoppingSale shoppingSale) {
        return shoppingSaleDao.updateSale(shoppingSale);
    }

}