# WildFire_Data_Visualization
A web-based wildfire data visualization system

## Getting Started

1. Clone or download our project

```git clone https://github.com/Jason0917/WildFire_Data_Visualization.git```

2. Download wildfire_sample.csv or download the full dataset [here](https://drive.google.com/file/d/1tZJZ41LL4rI7QrwA5-POZYlrKIeup9D8/view?usp=sharing).

3. Establish a Mysql database, create table and import data from the downloaded .csv file.

4. Go to /src/main/resources/application.properties and modify the configuration accordingly.
![Image](https://github.com/Jason0917/WildFire_Data_Visualization/blob/master/Configuration.png)

5. Run DataVisualizationApplication.java under /src/main/java/com/visualization/visualization to start the server-side application.

6. Open Wildfire_Scattermap.html or Wildfire_Heatmap.html to visit our website. Please note that by default, all HTTP requests will be sent to http://localhost:8443. If you change the port number or the address of server-side application. You need to change the ajax URLs in Wildfire_Scattermap.html and Wildfire_Heatmap.html.
