#python
a=[]
n= int(input())
for x in range(0,n):
    element=int(input())
    a.append(element)
b = set()
unique = []
for x in a:
    if x not in b:
        unique.append(x)
        b.add(x)
print("Non-duplicate items:")
print(unique)