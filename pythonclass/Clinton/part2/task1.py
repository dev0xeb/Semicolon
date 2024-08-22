#iterate through the range 1000 - 3000, using a conditional statement to check for even numbers all in a list


for numbers in range(999, 3001):
    if numbers % 2 == 0:
        num1 = numbers // 1000
        num2 = (numbers % 1000) // 100
        num3 = (numbers % 100) // 10
        num4 = numbers % 10
        if num1 %2 == 0 and num2 %2 == 0 and num3 %2 == 0 and num4 %2 == 0:
            print(numbers, end = ", ")
