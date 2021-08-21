#python
all_digits = ['0', '1', '2', '3', '4', '5', '6', '7', '8', '9'] 
all_letters = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 
               'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'] 
string =input()
total_digits = 0
total_letters = 0
for s in string: 
    if s in all_digits: 
        total_digits += 1
    elif s in all_letters: 
        total_letters += 1
print(total_digits)  
print(len(string)) 
