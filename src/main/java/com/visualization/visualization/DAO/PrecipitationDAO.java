package com.visualization.visualization.DAO;
import com.visualization.visualization.Class.Precipitation;
import org.springframework.data.repository.Repository;
import java.util.List;

public interface PrecipitationDAO extends Repository<Precipitation,Integer>{
    // Fetch all precipitation data that has value
    List<Precipitation> findByPRECIPITATIONGreaterThanEqual(double TOTAL_PRECIPITATION);
    // Fetch all precipitation data by year
    List<Precipitation> findByYEAR(int YEAR);
    // Fetch all precipitation data by year and month
    List<Precipitation> findByYEARAndMONTH(int YEAR, int MONTH);
}
