package com.visualization.visualization.DAO;

import com.visualization.visualization.Class.Wind;
import org.springframework.data.repository.Repository;
import java.util.List;

public interface WindDAO extends Repository<Wind,Integer>{
    List<Wind> findByTime(int Time);
}
