package ua.lviv.lgs.Services.Implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.lviv.lgs.Services.CategoriesService;

/**
 * Created by vboryskin on 16.07.2016.
 */
@Service
public class CategoriesServiceImpl implements CategoriesService {

    @Autowired
    private CategoriesService categoriesService;

}
