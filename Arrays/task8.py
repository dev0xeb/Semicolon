def total_of_a_list(number):
    """ using for loop"""
    total = 0
    for count in number:
        total += count
    return total
print(total_of_a_list([1, 2, 3, 4, 5]))

def total_of_a_list(number):
    """ using while """
    total = 0
    count = 0
    while count < len(number):
        total += number[count]
        count += 1
    return total
print(total_of_a_list([1, 2, 3, 4, 5]))


