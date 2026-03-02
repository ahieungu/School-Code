library(ggplot2)
library(psych)
library(tidyverse)
library(PerformanceAnalytics)
library(moments)
library(kableExtra)

df1 <- read.csv("Grades.csv", header = TRUE,sep = ",")
df2 <- df1[-1, ]

plot1 <- ggplot(df2, aes(x = Quiz1, y = Quiz2)) +
  geom_point()+
  theme_classic()
plot1

ggsave("./Results/Scatter1.pdf",plot1)
ggsave("./Results/Scatter1.jpg",plot1)

plot2 <- ggplot(df2, aes(x = Quiz1, y = Quiz2, color = Gender)) +
  geom_point(shape = 15)+
  theme_classic()
ggsave("./Results/Scatter2.pdf", plot2)
ggsave("./Results/Scatter2.jpg", plot2)
plot2

df3<-df2%>%select_if(is.numeric)%>%select(-Student,-EC)

chart.Correlation(df3, histogram=TRUE, pch=19)

plot3=ggplot(df2, aes(x=Quiz2)) +
  geom_histogram(aes(y=..count..),
                 breaks=seq(0.5, 8.5, by = 1),
                 colour="red", fill="lightblue")+
  scale_x_continuous(breaks=seq(0.5, 8.5, by = 0.5))+ 
  theme_classic()
ggsave("./Results/Histogram_Quiz2.pdf",plot3)
ggsave("./Results/Histogram_Quiz2.jpg",plot3)
plot3

plot4=ggplot(df2, aes(x=Quiz2,fill=Gender)) +
  geom_histogram(aes(y=..count..),
                 breaks=seq(0.5, 8.5, by = 1))+
  scale_x_continuous(breaks=seq(0.5, 8.5, by = 0.5))+ 
  theme_classic()
ggsave("./Results/Histogram_Quiz2vsGender.pdf",plot4)
ggsave("./Results/Histogram_Quiz2vsGender.jpg",plot4)
plot4

plot5<- ggplot(df2, aes(x="", y = Quiz6)) +
  stat_boxplot(geom = 'errorbar', width = 0.3)+
  geom_boxplot()+
  stat_summary(fun=mean, colour="darkred", geom="point", 
               shape=18, size=3,show.legend = FALSE) +
  labs(x="Quiz 6",y="Frequency")+
  theme_classic()
ggsave("./Results/Quiz6_Boxplot.pdf",plot5)
ggsave("./Results/Quiz6_Boxplot.jpg",plot5)
plot5

plot6<- ggplot(df2, aes(x=Gender, y = Midterm)) +
  stat_boxplot(geom = 'errorbar', width = 0.3)+
  geom_boxplot()+
  stat_summary(fun=mean, colour="darkred", geom="point", 
               shape=18, size=3,show.legend = FALSE) +
  labs(x="Genders",y="Frequency")+
  theme_classic()
ggsave("./Results/Midterm_Gender_Boxplot.pdf",plot6)
ggsave("./Results/Midterm_Gender_Boxplot.jpg",plot6)
plot6

describe(df3,na.rm=TRUE,skew=TRUE,trim=.1)
SumStats=describe(df3)
write.csv(SumStats,"./Results/SummaryStatistics.csv")

describeBy(df2$Midterm,group=df2$Gender,na.rm=TRUE,skew=TRUE,trim=.1)

MidSummary=df2%>%group_by(Gender) %>%
  summarise(
    n = n(),
    mean = mean(Midterm),
    sd = sd(Midterm),
    med=median(Midterm),
    min=min(Midterm),
    max=max(Midterm),
    mad=mad(Midterm),
    sk=skewness(Midterm),
    kur=kurtosis(Midterm),
    IQR=IQR(Midterm),
    .groups = 'drop'
  )
MidSummary

write.csv(MidSummary,"./Results/MidtermSummaryByGender.csv")

df4 <- read.csv("Absorption.csv", header = TRUE,sep = ",")

plot7=ggplot(df4, aes(x=Measurement)) +
  geom_histogram(aes(y=..count..),
                 breaks=seq(1, 2, by = 0.1),
                 colour="red", fill="lightblue")+
  scale_x_continuous(breaks=seq(1, 2, by = 0.1))+ 
  theme_classic()
ggsave("./Results/Histogram_Absorption.pdf",plot7)
ggsave("./Results/Histogram_Absorption.jpg",plot7)
plot7

plot8=ggplot(df4, aes(x=Measurement)) +
  geom_histogram(aes(y=..count..),
                 breaks=seq(1, 2, by = 0.05),
                 colour="red", fill="lightblue")+
  scale_x_continuous(breaks=seq(1, 2, by = 0.05))+ 
  theme_classic()
ggsave("./Results/Histogram_Absorption2.pdf",plot8)
ggsave("./Results/Histogram_Absorption2.jpg",plot8)
plot8

df5 <- read.csv("Monkeys.csv", header = TRUE,sep = ",")

plot9<- ggplot(df5, aes(x=Location, y = Height)) +
  stat_boxplot(geom = 'errorbar', width = 0.3)+
  geom_boxplot()+
  stat_summary(fun=mean, colour="darkred", geom="point", 
               shape=18, size=3,show.legend = FALSE) +
  labs(x="Location",y="Frequency")+
  theme_classic()
ggsave("./Results/Height_Location_Boxplot.pdf",plot9)
ggsave("./Results/Height_Location_Boxplot.jpg",plot9)
plot9

HeightSummary=df5%>%group_by(Location) %>%
  summarise(
    n = n(),
    mean = mean(Height),
    sd = sd(Height),
    med=median(Height),
    min=min(Height),
    max=max(Height),
    mad=mad(Height),
    sk=skewness(Height),
    kur=kurtosis(Height),
    IQR=IQR(Height),
    .groups = 'drop'
  )
HeightSummary

plot10=ggplot(df5, aes(x=Height)) +
  geom_histogram(aes(y=..count..),
                 breaks=seq(32, 62, by = 5),
                 colour="red", fill="lightblue")+
  scale_x_continuous(breaks=seq(32, 62, by = 5))+ 
  theme_classic()
ggsave("./Results/Histogram_Height.pdf",plot10)
ggsave("./Results/Histogram_Height.jpg",plot10)
plot10
