library(rpart)
data=iris
str=data
head(data)
adata=as.data.frame(data)
dtree=rpart(Species~adata$Sepal.Length+adata$Sepal.Width,data=adata,method = "class")
print(dtree)
plot(dtree, main="Decision Tree for Classification")
text(dtree,use.n=TRUE,all=TRUE, cex=0.5,pretty=0)