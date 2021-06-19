/**
 * FileName: ShoppingSaleDaoImplement
 * Author:   江七
 * Date:     2020/12/17 16:24
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.shopping.dao;

import com.shopping.entity.ShoppingSale;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository
public class ShoppingSaleDaoImplement implements ShoppingSaleDao {
    @Resource
    private SessionFactory sessionFactory;
    @Override
    public List<ShoppingSale> getAllSale() {
        String hql = "from ShoppingSale";
        Query query = sessionFactory.getCurrentSession().createQuery(hql);
        return query.list();
    }
    @Override
    public void addSale(ShoppingSale shoppingSale) {
        sessionFactory.getCurrentSession().save(shoppingSale);
    }

    @Override
    public ShoppingSale getSaleById(int productId){
        String hql = "from ShoppingSale where productId=?";
        Query query = sessionFactory.getCurrentSession().createQuery(hql);
        query.setParameter(0, productId);
        return  (ShoppingSale)query.uniqueResult();
    }

    @Override
    public boolean updateSale(ShoppingSale shoppingSale) {
        String hql = "update ShoppingSale set counts=?,totalPrice=? where productId=?";
        Query query = sessionFactory.getCurrentSession().createQuery(hql);
        query.setParameter(0, shoppingSale.getCounts());
        query.setParameter(1, shoppingSale.getTotalPrice());
        return query.executeUpdate() > 0;
    }
}