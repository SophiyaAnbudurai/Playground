#Type your code here
stype=(input())
tfee=int(input())
bfee=int(input())
hfee=int(input())
if(stype == 'MSDS'):
  print(tfee+bfee)
elif(stype == 'MSH'):
   print(tfee+hfee)
elif(stype == 'MGSDS'):
  print((1.5*tfee)+bfee)
elif(stype == 'MGSH'):
   print((1.5*tfee)+hfee)