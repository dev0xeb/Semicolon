def validate_user_input_for_student_number(number_of_student):
    student_number = -1
    while student_number < 0:
        try:
            student_number = int(input(number_of_student))
            if student_number < 0:
                print('Invalid Number')
            else:
                break
        except ValueError:
            print('Invalid input, Enter a valid Number')

def validate_user_input_for_subject_number(subject_number):
    number_of_subject = -1
    while number_of_subject < 0:
        try:
            number_of_subject = int(input(subject_number))
            if number_of_subject < 0:
                print('Invalid Number')
            else:
                break
        except ValueError:
            print('Invalid input, Enter a valid Number')

def collect_scores(student_number, number_of_subject):
    scores = [[0] * number_of_subject for students in range(student_number)]
    student_sum = [0] * student_number
    student_average = [0] * student_number

    for student in range(student_number):
        print(f'Entering scores for student {student + 1}')
        for student_scores in range(number_of_subject):
            score = -1
            while score < 0 or score > 100:
                try:
                    score = int(input('Enter the student score in subject {student_scores + 1}'))
                    if score < 0 or score > 100:
                        print('Invalid score')
                    else:
                        scores[student][student_scores] = score
                        student_sum += score
                except ValueError:
                    print('Invalid Input')
        student_average[student] = student_sum[student] / number_of_subject

def student_performance_summary(scores, student_sum, student_average):
    for student in range(student_number):
        print(f'The summary of the performance for student {student + 1} is: ')
        for student_scores in range(number_of_subject):
            print(f'{scores[student][student_scores]}')
        print(f'The total score for student {student + 1} is {student_sum[student]}')
        print(f'The average score for student {student + 1} is {student_average[student]:.2f}')
    
def print_performance_table():
    print('STUDENT\t')
    for subject in range(number_of_subject):
        print(f'SUB {subject + 1}')
    print('\tTOTAL\tAVERAGE\n')

    for student_scores in range(student_number):
        print(f'STUDENT {student_scores + 1}\t')
        for subject in range(number_of_subject):
            print(f'{scores[student_scores][subject]}\t')
        print(f'{student_sum[student_scores]}\tstudent_average[student_scores]')

print('Welcome to Lagbaja Schools')
student_number = validate_user_input_for_student_number('Enter the number of students in the class: ')
number_of_subject = validate_user_input_for_student_number('Enter the number of subjects: ')

scores, student_sum, student_average = collect_scores(student_number, number_of_subject) 

student_performance_summary(scores, student_sum, student_average)

print_performance_table(scores, student_sum, student_average)
