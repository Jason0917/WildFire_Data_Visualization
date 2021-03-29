package com.visualization.visualization.DAO;

import org.springframework.data.repository.Repository;
import com.visualization.visualization.Class.Wildfire;
import java.util.List;

public interface WildfireDAO extends Repository<Wildfire,Integer>{

    List<Wildfire> findBySIZEGreaterThanEqual(double SIZE_HA);
    List<Wildfire> findByYEAR(int YEAR);
    List<Wildfire> findByYEARAndSIZEGreaterThanEqual(int YEAR, double SIZE_HA);
    List<Wildfire> findByYEARAndMONTH(int YEAR, int MONTH);
    List<Wildfire> findByYEARAndMONTHAndSIZEGreaterThanEqual(int YEAR, int MONTH, double SIZE_HA);
    List<Wildfire> findByDECADE(String DECADE);
    List<Wildfire> findByDECADEAndSIZEGreaterThanEqual(String DECADE, double SIZE_HA);
}
