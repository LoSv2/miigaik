a=[int(a) for a in input().split()]
b=[]
for i in range (len(a)-1):
    if int(a[i])<int(a[i+1]):
        b.append(a[i+1])
print(b)