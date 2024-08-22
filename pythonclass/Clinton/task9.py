#collect inputs
#calculate the gross pay
#calculate the federal witholding
#calculate the state witholding
#calculate the total deduction
#calculate the net pay


employee_name = input('Enter employee\'s name: ')
hours_worked = int(input('Enter number of hours worked in a week: '))
hourly_pay_rate = float(input('Enter hourly pay rate: '))
federal_tax = float(input('Enter federal tax withholding rate: '))
state_tax = float(input('Enter state tax witholding rate: '))

gross_pay = hours_worked * hourly_pay_rate

federal_witholding = federal_tax * gross_pay

state_witholding = state_tax * gross_pay

total_deduction = federal_witholding + state_witholding

net_pay = gross_pay - federal_witholding + state_witholding

print(f'{employee_name}')
print(f'Hours worked {hours_worked}')
print(f'pay rate {hourly_pay_rate}')
print(f'Gross pay is; {gross_pay}')
print('Deductions')
print(f'Federal witholding is: {federal_witholding}')
print(f'state witholding is: {state_witholding}')
print(f'total deduction: {total_deduction}')
print(f'net pay is {net_pay}')
