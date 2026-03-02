install.packages("readxl", repos = "http://cran.us.r-project.org")
library(readxl)
df1=read_excel("Feeding_Log (1).xlsx")
install.packages("ggplot2", repos = "http://cran.us.r-project.org")
library("ggplot2")
install.packages("dplyr")
library(dplyr)

p1 <- ggplot(df1, aes(x = Bath, y = Feeding)) +
  stat_boxplot(geom = 'errorbar', width = 0.3)+
  geom_boxplot()+
  stat_summary(fun=mean, colour="darkred", geom="point",
               shape=18, size=3,show.legend = FALSE) +
  labs(x="Bath Day?",y="Feeding Quantity (in ounces)",
       title="Feeding quantities for bath days or regular days")+
  theme_classic()
p1

ggsave(p1,filename="Boxplot.pdf")
ggsave(p1,filename="Boxplot.jpg")

#Splits data into 2 data frames: Yes Bath and No bath
ybath <- filter(df1, Bath == 'Y')
nbath <- filter(df1, Bath == 'N')

#Summary stats of both the data sets
summary(ybath$Feeding)
summary(nbath$Feeding)

#Standard dev. of both the data sets
ysd <- sd(ybath$Feeding) # Use "$" to specify what column in the dataset you want to use
ysd
nsd <- sd(nbath$Feeding)
nsd

#Mean of both the data sets
ymean <- mean(ybath$Feeding)
ymean
nmean <- mean(nbath$Feeding)
nmean