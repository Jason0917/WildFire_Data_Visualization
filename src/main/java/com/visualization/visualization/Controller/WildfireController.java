package com.visualization.visualization.Controller;

import com.visualization.visualization.Class.Wildfire;
import com.visualization.visualization.Service.WildfireService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@RestController
@CrossOrigin(origins = "*",maxAge = 3600)
public class WildfireController {
    @Autowired
    WildfireService wildfireService;

    @GetMapping("/getAll")
    public List<Wildfire> getAll() throws Exception {
        return wildfireService.getAll(200);
    }

    @GetMapping("/getMap")
    public List<Wildfire> getByYear(String YEAR, String MONTH, boolean ignoreSmallFire) throws Exception {
        // For DECADE search
        if (YEAR.contains("-")){
            if (ignoreSmallFire){
                return wildfireService.getByDECADEAndSIZE_HA(YEAR, 200);
            } else {
                return wildfireService.getByDECADE(YEAR);
            }
        }
        // For Precise YEAR and MONTH search
        else {
            if (MONTH==null||MONTH.trim().equals("")) {
                if (ignoreSmallFire) {
                    return wildfireService.getByYEARAndSIZE_HA(Integer.parseInt(YEAR), 200);
                } else {
                    return wildfireService.getByYEAR(Integer.parseInt(YEAR));
                }
            } else{
                if (ignoreSmallFire) {
                    return wildfireService.getByYEARAndMONTHAndSIZE_HA(Integer.parseInt(YEAR), Integer.parseInt(MONTH), 200);
                } else {
                    return wildfireService.getByYEARAndMONTH(Integer.parseInt(YEAR), Integer.parseInt(MONTH));
                }
            }
        }
    }
}
