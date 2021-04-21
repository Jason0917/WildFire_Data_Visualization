package com.visualization.visualization.Controller;
import com.visualization.visualization.Class.Precipitation;
import com.visualization.visualization.Service.PrecipitationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@CrossOrigin(origins = "*",maxAge = 3600)
public class PrecipitationController {
    @Autowired
    PrecipitationService precipitationService;

    // maps HTTP getAllPrecipitation requests onto specific handler method
    @GetMapping("/getAllPrecipitation")
    public List<Precipitation> getAll() throws Exception {
        // Fetch all precipitation data
        return precipitationService.getAll(0);
    }

    // maps HTTP getPrecipitationMap requests onto specific handler methods
    @GetMapping("/getPrecipitationMap")
    public List<Precipitation> getByYear(String YEAR, String MONTH) throws Exception {
        // Fetch all precipitation data by year and month
        if (MONTH==null||MONTH.trim().equals("")) {
            return precipitationService.getByYEAR(Integer.parseInt(YEAR));
        } else{
            return precipitationService.getByYEARAndMONTH(Integer.parseInt(YEAR), Integer.parseInt(MONTH));
        }
    }
}
