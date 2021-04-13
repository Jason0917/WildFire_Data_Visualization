package com.visualization.visualization.Service;
import com.visualization.visualization.Class.Precipitation;
import com.visualization.visualization.DAO.PrecipitationDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PrecipitationService {
    @Autowired
    PrecipitationDAO precipitationDAO;

    // Fetch all precipitation data
    public List<Precipitation> getAll(double TOTAL_PRECIPITATION){
        return precipitationDAO.findByPRECIPITATIONGreaterThanEqual(TOTAL_PRECIPITATION);
    }

    // Fetch all precipitation data by year
    public List<Precipitation> getByYEAR(int YEAR){
        return precipitationDAO.findByYEAR(YEAR);
    }

    // Fetch all precipitation data by year and month
    public List<Precipitation> getByYEARAndMONTH(int YEAR, int MONTH){
        return precipitationDAO.findByYEARAndMONTH(YEAR, MONTH);
    }
}
