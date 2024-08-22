print('Welcome to Lagbaja Schools')
student_number = -1
while student_number < 0:
    try:
        student_number = int(input('Enter the number students in the class: '))
        if student_number < 0:
            print('Invalid Number')
        else:
            break
    except ValueError:
        print('Invalid input, Enter a valid Number')

number_of_subject = -1    
while number_of_subject < 0:
    try:
        number_of_subject = int(input('Enter the number of subjects: '))
        if number_of_subject < 0:
            print('Invalid Number')
        else:
            break
    except ValueError:
        print('Invalid input, Enter a valid Number')
print("Saving >>>>>>>>>>>>>>>>")
print("Saved successfully")

scores = [[0] * number_of_subject for students in range(student_number)]
student_sum = [0] * student_number
student_average = [0] * student_number

for student in range(student_number):
    print(f'Entering scores for student {student + 1}')
    for student_scores in range(number_of_subject):
        score = -1
        while score < 0 or score > 100:
            try:
                score = int(input(f'Enter the student score in subject in {student_scores + 1}: '))
                if score < 0 or score > 100:
                    print('Invalid score')
                else:
                    scores[student][student_scores] = score
                    student_sum[student] += score
            except ValueError:
                print('Invalid Input')
    student_average[student] = student_sum[student] / number_of_subject
print("Saving >>>>>>>>>>>>>>>>")
print("Saved successfully")

for student in range(student_number):
    print(f'The summary of the performance for student {student + 1} is: ')
    for student_scores in range(number_of_subject):
        print(f'{scores[student][student_scores]}')
    print(f'The total score for student {student + 1} is {student_sum[student]}')
    print(f'The average score for student {student + 1} is {student_average[student]}')
    
