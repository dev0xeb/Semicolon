user_input = int(input('Enter the number of rows you want the pyramid to print: '))
for count in range(1, user_input + 1):
    #space
    for counter in range(user_input - count):
        print(' ', end = '')
    #decreasing numbers
    for counter in range(count -1, 0, -1):
        print(counter, end = '')
    #increasing numbers
    for counter in range(1, count + 1):
        print(counter, end='')
    print()

