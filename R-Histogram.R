dat1 <- read.csv("mediumSet.csv", header=F)$V1
hist(dat1, col="#C0C0C0", main="Distribution of Player Ratings", xlab ="Player Rating (40-99)", ylab = "Frequency",xlim = c(40,99), breaks = 400)

