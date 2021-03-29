package com.visualization.visualization.Service;

import com.visualization.visualization.Class.Wildfire;
import com.visualization.visualization.DAO.WildfireDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WildfireService {
    @Autowired
    WildfireDAO wildfireDAO;

    public List<Wildfire> getAll(double SIZE_HA){
        return wildfireDAO.findBySIZEGreaterThanEqual(SIZE_HA);
    }

    public List<Wildfire> getByYEAR(int YEAR){
        return wildfireDAO.findByYEAR(YEAR);
    }

    public List<Wildfire> getByYEARAndSIZE_HA(int YEAR, double SIZE_HA){
        return wildfireDAO.findByYEARAndSIZEGreaterThanEqual(YEAR, SIZE_HA);
    }

    public List<Wildfire> getByYEARAndMONTH(int YEAR, int MONTH){
        return wildfireDAO.findByYEARAndMONTH(YEAR, MONTH);
    }

    public List<Wildfire> getByYEARAndMONTHAndSIZE_HA(int YEAR, int MONTH, double SIZE_HA){
        return wildfireDAO.findByYEARAndMONTHAndSIZEGreaterThanEqual(YEAR, MONTH, SIZE_HA);
    }

    public List<Wildfire> getByDECADE(String DECADE){
        return wildfireDAO.findByDECADE(DECADE);
    }

    public List<Wildfire> getByDECADEAndSIZE_HA(String DECADE, double SIZE_HA){
        return wildfireDAO.findByDECADEAndSIZEGreaterThanEqual(DECADE, SIZE_HA);
    }
}
