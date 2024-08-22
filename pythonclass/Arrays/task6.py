def total_of_a_list(number):
    total = []
    current_total = 0
    for count in number:
        current_total += count
        total.append(current_total)
    return total
print(total_of_a_list([1, 2, 3, 4, 5]))
