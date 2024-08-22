user_input = input('Enter your values: ')
print(user_input)
letters_count = 0
number_count = 0
for count in user_input:
    if count.isalpha():
        letters_count+=1
    if count.isdigit():
        number_count+=1
print(f'Letters is {letters_count} and number is {number_count}')
