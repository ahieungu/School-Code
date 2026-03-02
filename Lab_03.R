library(tidyverse)
library(gmodels)

Quest1 <- read.csv("Quest1.csv", header = TRUE, sep = ",")

table(Quest1$Gender, Quest1$Local)
Quest1new = Quest1%>%filter(Local!="")
table(Quest1new$Gender, Quest1new$Local)

Table1 = table(Quest1new$Gender, Quest1new$Local)
Table1

prop.table(Table1)
prop.table(Table1, 1) # row percentages
prop.table(Table1, 2) # column percentages

CrossTable(Quest1new$Gender, Quest1new$Local)

bag = c('yellow','yellow',"green","green","red","red","blue","blue","blue","blue")

table(bag)
table(bag)/length(bag)

set.seed(1233)
Simulation <- sample(x = bag, size = 200, replace = TRUE)

table(Simulation)
table(Simulation)/length(Simulation)

set.seed(42)
unif8_30 <- sample(1:8, size=30,replace = TRUE)

table(unif8_30)/length(unif8_30)

set.seed(42)
unif8_1000 <- sample(1:8, size=1000,replace = TRUE)
table(unif8_1000)/length(unif8_1000)

set.seed(42)
unif_1000000 <- sample(1:8, size=1000000,replace = TRUE)
table(unif_1000000)/length(unif_1000000)

Drivers <- read.csv("Drivers.csv", header = TRUE, sep = ",")
table(Drivers$Gender, Drivers$Car)
Driversnew = Drivers%>%filter(Car!="")
table(Driversnew$Gender, Driversnew$Car)
Table2 = table(Driversnew$Gender, Driversnew$Car)
Table2