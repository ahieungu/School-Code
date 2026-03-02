library(easypackages)
libraries("ggplot2", "psych")


F_10 <- pbinom(q=10, size=20, prob=0.35)
F_9 <- pbinom(q=9, size=20, prob=0.35)
P_10 <- F_10 - F_9
f_10 <- dbinom(x=10, size=20, prob=0.35)

FC_10 <- 1 - (F_10 = pbinom(q=10, size=20, prob=0.35))
FC_10 <- pbinom(q=10, size=20, prob=0.35, lower=FALSE) # lower=FALSE gives you the upper tail

P_8_10 <- pbinom(q=10, size=20, prob=0.35) - pbinom(q=7, size=20, prob=0.35) #F(10) - F(7)

F_3 = ppois(q=3, lambda=1)

FC_3 = 1 - ppois(q=3, lambda=1)

f_4 = dpois(x=4, lambda=1)
f_5 = dpois(x=5, lambda=1)
f_6 = dpois(x=6, lambda=1)
f_4 + f_5 + f_6

F_115 <- pnorm(q=115, mean=100, sd=15)
F_85 <- pnorm(q=85, mean=100, sd=15)
P_85_115 <- F_115 - F_85

F_130 <- pnorm(q=130, mean=100, sd=15)
F_70 <- pnorm(q=70, mean=100, sd=15)
P_70_130 <- F_130-F_70

FC_132 <- 1-pnorm(q=132, mean=100, sd=15)
FC_132 <- pnorm(q=132, mean=100, sd=15, lower=FALSE)

Samples50 <- Samples[1:50,]

Samples50_90 <- Samples[50:90,]

SampleMean_20 <- Samples[1:20,12]

SampleMean_20 <- Samples$Means[1:20]

p1 <- qplot(SampleMean_20, # Instructs R to use the vector Samplemean_20 and save the plot as p1
            geom="histogram", #Asks R to create a histogram
            breaks=seq(1, 10, by = 1), # Creates bins 1 to 10 with width 1
            main = "Histogram for Means", #Creates a title
            xlab = "Means", #Puts a title on the x-axis
            ylab = "Counts", #Puts a title on the y-axis
            fill=I("blue"), #Fills the boxes with the color blue
            col=I("red"), #Paints the boundaries with red
            xlim=c(0,11))+ # Tells R where to start and where to end the x axis
  scale_x_continuous(breaks=seq(1,10,by=1))+ #Tells R where to put the markers on the x axis
  theme_light() # Makes sure the background is white, and there is a light gray grid
p1 # Calls the graph p1 so we can see it
ggsave("Histogram_20.pdf", p1) # saves the graph as a pdf
ggsave("Histogram_20.jpg", p1) # saves the graph as a jpg

SampleMean_40=Samples$Means[1:40]
p2 <- qplot(SampleMean_40,
            geom="histogram",
            breaks=seq(1, 10, by = 1),
            main = "Histogram for Means",
            xlab = "Means",
            ylab = "Counts",
            fill=I("blue"),
            col=I("red"),
            xlim=c(0,11))+
  scale_x_continuous(breaks=seq(1,10,by=1))+
  theme_light()
p2
ggsave("Histogram_40.pdf", p2) # saves the graph as a pdf
ggsave("Histogram_40.jpg", p2) # saves the graph as a jpg

SampleMean_400 <- Samples$Means[1:400]
p3 <- qplot(SampleMean_400,
            geom="histogram",
            breaks=seq(1, 10, by = 1),
            main = "Histogram for Means",
            xlab = "Means",
            ylab = "Counts",
            fill=I("blue"),
            col=I("red"),
            xlim=c(0,11))+
  scale_x_continuous(breaks=seq(1,10,by=1))+
  theme_light()
p3
ggsave("Histogram_400.pdf", p3)
ggsave("Histogram_400.jpg", p3)

SampleMean_4000 <- Samples$Means[1:4000]
p4 <- qplot(SampleMean_4000,
            geom="histogram",
            breaks=seq(1, 10, by = 1),
            main = "Histogram for Means",
            xlab = "Means",
            ylab = "Counts",
            fill=I("blue"),
            col=I("red"),
            xlim=c(0,11))+
  scale_x_continuous(breaks=seq(1,10,by=1))+
  theme_light()
p4
ggsave("Histogram_4000.pdf", p4)
ggsave("Histogram_4000.jpg", p4)
