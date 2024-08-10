print('Welcome to credit card validator where you can get all information regarding your CreditCard')
card_number = input('Enter your Credit Card number: ')
print()
if len(card_number) < 13 or len(card_number) > 16:
    print('Invalid Card Number')
print('*********************************************************')
if (card_number[0] == '4'):
    print('**Credit Card Type: Visa Card')
elif (card_number[0] == '5'):
    print('**Credit Card Type: Master Card')
elif (card_number[0] == '3' and card_number[1] == '7'):
    print('**Credit Card Type: American Express Card')
elif (card_number[0] == '6'):
    print('**Credit Card type: Discover Card')
else:
    print('**Credit Card Type: Invalid Card')
    
right_to_left_total = 0
for right_to_left in range(len(card_number) -2, -1, -2):
    number = int(card_number[right_to_left])
    number *= 2
    if number > 9:
        number = number - 9
    right_to_left_total += number
print(right_to_left_total)

odd_total = 0
for odd_index in range(len(card_number)-1, -1, -2):
    numbers = int(card_number[odd_index])
    odd_total += numbers
print(odd_total)

print(f'**Credit Card Number: {card_number}')
print(f'**Credit Card Digit Length: {len(card_number)}')
total = right_to_left_total + odd_total
if total % 10 == 0:
    print('**Credit Card Validity Status: Valid')
else:
    print('**Credit Card Validity Status: Invalid')
print("*********************************************************")
