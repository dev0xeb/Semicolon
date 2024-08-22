def reverse(number):
    """Return the reversal of an integer"""
   



def is_palindrome(number):
    string_number = str(number)
    print(f'{string_number}')
    reversed_num = reverse(string_number)
    print(f'{reversed_num}')
    if reversed_num == string_number:
        return True
    else:
        return False
    
print(is_palindrome(121))


def get_sorted(num1, num2, num3):
        number = [num1, num2, num3]
        number.sort()

        return number
print(get_sorted(3, 1, 2))
