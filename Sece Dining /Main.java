#python
side=input()
way=int(input())
#print("Left Handed")
if(side=="front" and way==1):
  print("Left Handed")
elif(side=="front" and way==2):
  print("Right Handed")
elif(side=="rear" and way==1):
  print("Right Handed")
elif(side=="rear" and way==2):
  print("Left Handed")