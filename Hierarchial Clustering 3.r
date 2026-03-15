df=as.data.frame(iris)
s=sample(50,50)
df1=as.data.frame(df[s,3:5])
print(df1)
label=df[s,5]
print(label)
df2=df1[,-3]
dist_matrix=dist(df2,method = 'euclidean')
hc=hclust(dist_matrix,method = 'average')
plot(hc, main="Hierarchical Clustering")
cutave=cutree(hc,k=3)
print(cutave)
table(cutave,label)