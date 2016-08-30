# r-fifa-ratings
Data Visualization of FIFA 15's Player Ratings with R
- Using [fifaguide's Developer API] (http://tools.fifaguide.com/develop.php), JSON files are retrieved and parsed with Java's JSON API in a separate Java file (see `src` for `ratingRetriever`).
- The data (about 19,000 ratings) is then written onto multiple .csv files
- With ggplot2 and R's built in capabilities, this data is then visualized into 5 distinct histograms, density plots, and dotplots.

# Frameworks used:
- [ggplot2] (http://ggplot2.org/) for the complex graphs
- [fifaguide's Developer API] (http://tools.fifaguide.com/develop.php)  for retrieving ratings
- [Google's Java JSON library] (https://github.com/google/gson) for parsing the JSON data

# How to Run:
- In your R console, use the `source()` function to run each of the R scripts
- Make sure that the files are in your working directory using `dir()`
- If `source()` does not work, then run each script line by line, making sure `library(ggplot2)` is ran

# Graphs Screenshots:

##ggplot2 Graphs:
### Density of Full Dataset
<img width="569" alt="screen shot 2016-08-09 at 1 13 26 pm" src="https://cloud.githubusercontent.com/assets/12012798/17531976/3d1fb48e-5e33-11e6-8abd-db1e3da6b42e.png">
### Histogram of Full Dataset
<img width="561" alt="screen shot 2016-08-15 at 2 02 23 pm" src="https://cloud.githubusercontent.com/assets/12012798/17679608/fee9a1bc-62f0-11e6-90f6-3f29d3cefdae.png">
### Dotplot of Partial Dataset
<img width="560" alt="screen shot 2016-08-15 at 2 02 36 pm" src="https://cloud.githubusercontent.com/assets/12012798/17679593/f1395558-62f0-11e6-92e2-9166b8913655.png">
### FreqPoly with Area fill
<img width="560" alt="screen shot 2016-08-15 at 2 02 30 pm" src="https://cloud.githubusercontent.com/assets/12012798/17679603/f7c89190-62f0-11e6-9a08-1462e39d87e6.png">
## R generated Graphs
### Density of Half Dataset 
<img width="558" alt="screen shot 2016-08-09 at 1 11 59 pm"
src="https://cloud.githubusercontent.com/assets/12012798/17531979/3d27d90c-5e33-11e6-9bd1-8aa43b364a41.png">
### Polygon Density of Half Dataset
<img width="567" alt="screen shot 2016-08-09 at 1 14 30 pm" src="https://cloud.githubusercontent.com/assets/12012798/17531974/3d00e18a-5e33-11e6-890b-3b12ee07b1c2.png">
### Histogram of Half Dataset
<img width="563" alt="screen shot 2016-08-09 at 1 11 36 pm" src="https://cloud.githubusercontent.com/assets/12012798/17531978/3d26fa14-5e33-11e6-9dbd-a8bb032517b5.png">
