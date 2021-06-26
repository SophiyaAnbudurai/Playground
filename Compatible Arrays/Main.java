n=int(input())
a=[]
b=[]
for i in range(0,n):
  value=int(input())
  a.append(value)
for j in range(0,n):
  value1=int(input())
  b.append(value1)
if(len(a)==len(b)):
  print("Compatible")
