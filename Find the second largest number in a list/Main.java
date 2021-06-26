#python
list1 = []
num = int(input())
for i in range(1, num + 1):
    ele = int(input())
    list1.append(ele)
print(sorted(list1)[-2])