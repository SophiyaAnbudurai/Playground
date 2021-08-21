#python
item=int(input())
heat=float(input())
if(item==2):
  heat1=(heat+0.50)
  tot=(item+heat1)
  print('%.2f'%tot)
elif(item==3):
  heat1=(heat+heat)
  tot=(item+heat1)-item
  print('%.2f'%tot)
else:
  print("Number of items is more")
