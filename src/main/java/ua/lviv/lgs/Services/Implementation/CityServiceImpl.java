package ua.lviv.lgs.Services.Implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.lviv.lgs.Services.CityService;
import ua.lviv.lgs.dao.CityDao;
import ua.lviv.lgs.entry.City;

/**
 * Created by admin on 01.07.2016.
 */
@Service
public class CityServiceImpl implements CityService{
    @Autowired
    private CityDao cityDao;

    @Transactional
    public void add(String cityName, String country){
        City city = new City(cityName, country);
        cityDao.add(city);
    }
}
