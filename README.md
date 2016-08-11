# r-fifa-ratings
Data Visualization of FIFA 16's Player Ratings with R and Java
- Using [fifaguide's] (http://tools.fifaguide.com/develop.php) Developer API, JSON files were retrieved and parsed with Java's JSON API.
- The data (about 19,000 ratings) is then written onto a .csv file
- With ggplot2 and RStudio, this data is then visualized into 5 distinct histograms, density plots, and dotplots.

# How to Run:
- In your R console, use the source() function to run each of the R scripts
- Make sure that the files are in your working directory using dir()
- If souurce() does not work, then run each script line by line

# Frameworks used:
- [ggplot2] (http://ggplot2.org/) for the more complex graphs
- [fifaguide's] (http://tools.fifaguide.com/develop.php) Developer API for retrieving ratings
- [Google's Java JSON library] (https://github.com/google/gson) for parsing the JSON data

# Graphs Screenshots:

##ggplot2 Graphs:
### Density of Full Dataset
<img width="569" alt="screen shot 2016-08-09 at 1 13 26 pm" src="https://cloud.githubusercontent.com/assets/12012798/17531976/3d1fb48e-5e33-11e6-8abd-db1e3da6b42e.png">
### Histogram of Full Dataset
<img width="564" alt="screen shot 2016-08-09 at 1 12 33 pm" src="https://cloud.githubusercontent.com/assets/12012798/17531977/3d24b10a-5e33-11e6-805d-7366e7ae8824.png">
### Dotplot of Partial Dataset
<img width="566" alt="screen shot 2016-08-09 at 1 13 52 pm" src="https://cloud.githubusercontent.com/assets/12012798/17531975/3d1856e4-5e33-11e6-8f50-62ba37c03132.png">
### FreqPoly with Area fill
<img width="572" alt="screen shot 2016-08-10 at 6 56 27 pm" src="https://cloud.githubusercontent.com/assets/12012798/17576863/55e4a8c2-5f2c-11e6-9a9a-d762ebb5d266.png">
## R generated Graphs
### Density of Half Dataset 
<img width="558" alt="screen shot 2016-08-09 at 1 11 59 pm"
src="https://cloud.githubusercontent.com/assets/12012798/17531979/3d27d90c-5e33-11e6-9bd1-8aa43b364a41.png">
### Polygon Density of Half Dataset
<img width="567" alt="screen shot 2016-08-09 at 1 14 30 pm" src="https://cloud.githubusercontent.com/assets/12012798/17531974/3d00e18a-5e33-11e6-890b-3b12ee07b1c2.png">
### Histogram of Helf Dataset
<img width="563" alt="screen shot 2016-08-09 at 1 11 36 pm" src="https://cloud.githubusercontent.com/assets/12012798/17531978/3d26fa14-5e33-11e6-9dbd-a8bb032517b5.png">
