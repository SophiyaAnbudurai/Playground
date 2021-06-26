def recur_fibo(n):
  if (n <= 1):
       return n
  return(recur_fibo(n-1) + recur_fibo(n-2))

nterms = int(input())
if nterms <= 0:
   print("Plese enter a positive integer")
else:
  for i in range(nterms):
       print(recur_fibo(i))