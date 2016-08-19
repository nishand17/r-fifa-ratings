dat2 <- read.csv("densitySet.csv", header =F)$V1
d <- density(dat2)
plot(d)
polygon(d, col="gold", xlab = "Rating", ylab = "Frequency")

