package ua.lviv.lgs.Services.Implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.lviv.lgs.Services.ProductService;
import ua.lviv.lgs.dao.ProductDao;
import ua.lviv.lgs.entry.Product;

/**
 * Created by admin on 01.07.2016.
 */
@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductDao productDao;

    @Transactional
    public void add(String name, int price, String specification){
        Product product = new Product(name, price, specification);
        productDao.add(product);
    }
}
