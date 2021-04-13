package com.visualization.visualization.Controller;

import com.visualization.visualization.Class.Wind;
import com.visualization.visualization.Service.WildfireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import com.visualization.visualization.Service.WindService;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.util.List;

@RestController
@CrossOrigin(origins = "*",maxAge = 3600)
public class WindController {
    @Autowired
    WindService windService;

    @GetMapping("/getWindTime")
    public List<Wind> getByTime(int Day, int Time) {
        return windService.getByTime(Day*100 + Time);
    }
}
