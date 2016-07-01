package ua.lviv.lgs.Services.Implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.lviv.lgs.Services.BrandService;
import ua.lviv.lgs.dao.BrandDao;
import ua.lviv.lgs.entry.Brand;

import javax.jnlp.BasicService;
import java.net.URL;

/**
 * Created by admin on 01.07.2016.
 */
@Service
public class BrandServiceImpl implements BrandService {

    @Autowired
    private BrandDao brandDao;

    @Transactional
    public void add(String brandName, String country){
        Brand brand = new Brand(brandName, country);
        brandDao.add(brand);
    }

}
