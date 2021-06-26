#python
a=input()
if(a=='a' or a=='e'or a=='i' or a=='o' or a=='u'):
  print("Vowel")
elif((ord(a)) >=48 and (ord(a)) <=57):
   print("Not an alphabet")
else :
  print("Consonant")