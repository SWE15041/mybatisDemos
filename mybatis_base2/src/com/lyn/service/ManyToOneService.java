package com.lyn.service;

import com.lyn.domain.Product;
import com.lyn.mapper.ProductMapper;
import com.lyn.util.DBTools;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class ManyToOneService {

    public static void selectAll() {
        SqlSession session = DBTools.getSession();
        ProductMapper mapper = session.getMapper(ProductMapper.class);
        List<Product> products = mapper.selectAll();
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public static void main(String[] args) {
        selectAll();
    }
}
