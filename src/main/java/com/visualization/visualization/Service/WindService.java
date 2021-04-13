package com.visualization.visualization.Service;

import com.visualization.visualization.Class.Wind;
import com.visualization.visualization.DAO.WindDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WindService {
    @Autowired
    WindDAO windDAO;

    public List<Wind> getByTime(int Time) {
        return windDAO.findByTime(Time);
    }
}
