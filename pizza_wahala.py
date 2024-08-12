print('Welcome to Iya Abimbola Pizza joint, Yaba. \nWe sell the best and most afforable pizza\'s in town')

order_number = -1
while order_number < 0:
    order_number = int(input('Enter the number of people you would like to order for(Each person for 1 slice of pizza): '))
    if order_number < 0 :
        print('invalid input')

print('Below is the information of the type of Pizza we have and the price information, look through carefully')
print('Pizza Type\tNumber of Slices\tPrice Per Box')
print('1. Sapa size\t\t4\t\t2,000')
print('2. Small Money\t\t6\t\t2,400')
print('3. Big boys\t\t8\t\t3,000')
print('4. Odogwu \t\t12\t\t4,200')

print()
order_type = -1
while order_type < 0:
    order_type = int(input('Select a number with the pizza type you would like to order: '))
    if order_type < 0 or order_type > 5:
        print('Invalid Order Type, Enter a valid number in the chart above: ')

SAPA_SIZE = 4
SAPA_SIZE_PRICE = 2000
SMALL_MONEY = 6
SMALL_MONEY_PRICE = 2400
BIG_BOYS = 8
BIG_BOYS_PRICE = 3000
ODOGWU = 12
ODOGWU_PRICE = 4200
NUMBER_OF_BOXES=0
LEFT_OVERS = 0
PRICE = 0

if order_type == 1:
    print('You ordered for the Sapa size pizza 2,000')
    NUMBER_OF_BOXES = round(order_number / SAPA_SIZE)
    LEFT_OVERS = (NUMBER_OF_BOXES * SAPA_SIZE) - order_number
    PRICE = SAPA_SIZE_PRICE * NUMBER_OF_BOXES
    print(f'Number of boxes of pizza to buy: {NUMBER_OF_BOXES} boxes')
    print(f'Number of left over slices after serving: {LEFT_OVERS} slices')
    print(f'Price = {PRICE}')
if order_type == 2:
    print('You ordered for the Small money pizza costing 2,400')
    NUMBER_OF_BOXES = round(order_number / SMALL_MONEY)
    LEFT_OVERS = (NUMBER_OF_BOXES * SMALL_MONEY) - order_number
    PRICE = SMALL_MONEY_PRICE  * NUMBER_OF_BOXES
    print(f'Number of boxes of pizza to buy: {NUMBER_OF_BOXES} boxes')
    print(f'Number of left over slices after serving: {LEFT_OVERS} slices')
    print(f'Price = {PRICE}')
if order_type == 3:
    print('You ordered for the Big boys pizza costing 3,000')
    NUMBER_OF_BOXES = round(order_number / BIG_BOYS)
    LEFT_OVERS = (NUMBER_OF_BOXES * BIG_BOYS) - order_number
    PRICE = BIG_BOYS_PRICE  * NUMBER_OF_BOXES
    print(f'Number of boxes of pizza to buy: {NUMBER_OF_BOXES} boxes')
    print(f'Number of left over slices after serving: {LEFT_OVERS} slices')
    print(f'Price = {PRICE}')
if order_type == 4:
    print('You ordered for the Big boys pizza costing 3,000')
    NUMBER_OF_BOXES = round(order_number / ODOGWU)
    LEFT_OVERS = (NUMBER_OF_BOXES * ODOGWU) - order_number
    PRICE = ODOGWU_PRICE  * NUMBER_OF_BOXES
    print(f'Number of boxes of pizza to buy: {NUMBER_OF_BOXES} boxes')
    print(f'Number of left over slices after serving: {LEFT_OVERS} slices')
    print(f'Price = {PRICE}')
    
