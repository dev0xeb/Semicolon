from datetime import datetime, timedelta

print('Welcome to Clintons Menstruation app, \n Users Identity and Data are safe with us')
date_format = '%Y-%m-%d'
last_start_date_string = input('Enter the start date of your previous Menstrual period (use the format yyyy-MM-DD): ')
last_start_date = datetime.strptime(last_start_date_string, date_format).date()

cycle_length = int(input('On the average, how long is your typical Menstrual Cycle: '))
menstrual_duration =int(input('What was last Menstrual duration(how many days did your period last): '))

last_end_date = last_start_date + timedelta(days = menstrual_duration)
print(f'The End date of your previous period was {last_end_date}')

print()
next_start_date = last_start_date + timedelta(days = cycle_length)
next_end_date = next_start_date + timedelta(days = menstrual_duration)
print(f'The estimated date of your next period is {next_start_date} to {next_end_date}')

print()
ovulation_start_date = last_start_date + timedelta(days = (cycle_length/2) - 2)
ovulation_end_date = ovulation_start_date + timedelta(days = 1)
print(f'Your estimated Ovulation Date is {ovulation_start_date} to {ovulation_end_date}')

print()
safe_period_start = last_start_date + timedelta(days = (cycle_length/2) + 2)
safe_period_end = safe_period_start + timedelta(days = (cycle_length/2) - 1)
print(f'Your estimated Safe Period is {safe_period_start} to {safe_period_end}')
print()

print("""
            Symptoms to watch out for when nearing your Next Period:-
	    - Menstrual Cramps.
	    - Breast Tenderness.
	    - Mood Swings.
	    - Fatigue.
	    - Back Pain.
	    - Increased Urination.
	    - Changes in Appetite.
				""")

print()
print("""
            Health Tips:-
	    - Eat Balanced Diet.
	    - Stay Hydrated.
	    - Limit caffeine and Alcohol.
	    - Maintain Hygiene.
	    - Avoid Excessive Salt and Sugar.
	    - Consult a Health care Provider if you experience severe symptoms such as debilitating cramps or unusually heavy bleeding.
			""")
