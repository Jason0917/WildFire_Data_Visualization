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

2. Establish a Mysql database, create tables and import data from under the datasets folder.

3. Go to /src/main/resources/application.properties and modify the configuration accordingly.
![Image](https://github.com/Jason0917/WildFire_Data_Visualization/blob/master/Configuration.png)

4. Run DataVisualizationApplication.java under /src/main/java/com/visualization/visualization to start the server-side application.

5. Open Wildfire\_Scattermap.html as the entry point to visit our website. Please note that by default, all HTTP requests will be sent to http://localhost:8443.

## Demo

![Image](https://github.com/Jason0917/WildFire_Data_Visualization/blob/master/scatter_demo.png)

![Image](https://github.com/Jason0917/WildFire_Data_Visualization/blob/master/heat_demo.png)

## More to Explore

So far, only Wild fire scatter map, heat map, wind map and precipitation map are included in this project. More visualization tools can be found at [Echarts.js](https://echarts.apache.org/zh/index.html).

For this project, National Fire Database fire point data is used to be visualized. However, more wildfire datasets in different formats can be found at [CWFIS](https://cwfis.cfs.nrcan.gc.ca/datamart).

## Contact

If there are any issues or any suggestions, please contact zjian3@ualberta.ca.

Thanks! (*^_^*)
