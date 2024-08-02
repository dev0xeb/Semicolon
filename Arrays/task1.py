def return_largest_element(number):
    largest = number[0]

    for count in number[1:]:
        if count > largest:
            largest = count

    return largest
print(return_largest_element([3, 8, 9,12, 1, 2, 4,]))
     
