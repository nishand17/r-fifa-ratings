x <- read.csv("dotSet.csv", header =F)$V1
df <- data.frame(x)
df$group = ifelse(df$x < 66, "50-65", ifelse(df$x < 75, "66-74", "75-89"))
library(ggplot2)
ggplot(df, aes(x, fill = group)) + geom_dotplot(binwidth=.95) + scale_fill_manual(values = c("50-65" = "#CD7F32", "66-74" = "#C0C0C0","75-89" = "gold"))  + xlim(50,88) + ggtitle("Representative Dotplot") + labs(x="Rating",y="Frequency") + theme(plot.title = element_text(family = "Trebuchet MS",  face="bold", size=15))


