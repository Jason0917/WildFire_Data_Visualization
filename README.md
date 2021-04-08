# WildFire_Data_Visualization
A web-based wildfire data visualization system based on Echarts.js, Spring Boot and Mysql.

## Pre-requirements

Before running this project, please make sure that you have already installed Java.

IntelliJ IDEA is strongly recommended for this project.

Please note that [Baidu Map API](http://lbsyun.baidu.com/) is embedded in this project. You need to apply for a access key [here](http://lbsyun.baidu.com/apiconsole/center#/home) for free.

After getting an access key, put it here in both .html files.

![Image](https://github.com/Jason0917/WildFire_Data_Visualization/blob/master/ak.png)

## Getting Started

Please follow these steps to start running our website:

1. Clone or download our project

```git clone https://github.com/Jason0917/WildFire_Data_Visualization.git```

2. Download wildfire_sample.csv or download the full dataset [here](https://drive.google.com/file/d/1tZJZ41LL4rI7QrwA5-POZYlrKIeup9D8/view?usp=sharing).

3. Establish a Mysql database, create table and import data from the downloaded .csv file.

4. Go to /src/main/resources/application.properties and modify the configuration accordingly.
![Image](https://github.com/Jason0917/WildFire_Data_Visualization/blob/master/Configuration.png)

5. Run DataVisualizationApplication.java under /src/main/java/com/visualization/visualization to start the server-side application.

6. Open Wildfire_Scattermap.html or Wildfire_Heatmap.html to visit our website. Please note that by default, all HTTP requests will be sent to http://localhost:8443. If you change the port number or the address of server-side application. You need to change the ajax URLs in Wildfire_Scattermap.html and Wildfire_Heatmap.html.

## Demo

![Image](https://github.com/Jason0917/WildFire_Data_Visualization/blob/master/scatter_demo.png)

![Image](https://github.com/Jason0917/WildFire_Data_Visualization/blob/master/heat_demo.png)

## More to Explore

So far, only scatter map and heat map are included in this project. More visualization tools can be found at [Echarts.js](https://echarts.apache.org/zh/index.html).

For this project, National Fire Database fire point data is used to be visualized. However, more wildfire datasets in different formats can be found at [CWFIS](https://cwfis.cfs.nrcan.gc.ca/datamart).

## Contact

If there are any issues or any suggestions, please contact zjian3@ualberta.ca.

Thanks! (*^_^*)
