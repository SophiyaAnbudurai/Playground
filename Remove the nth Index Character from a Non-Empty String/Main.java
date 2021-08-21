#python
str = input()
n = int(input())

modified_str = '' 
for char in range(0, len(str)): 
    if(char != n): 
        modified_str += str[char] 
print(modified_str) 