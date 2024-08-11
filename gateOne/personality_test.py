user_name = input('Kindly enter your name to take the MBTI Personality Test: ')
print(f'Welcome: {user_name}, you can now take the test')

personality_questions = ["Introvert/Extrovert.\n Do you prefer to focus on the outer world, Enter A for Yes or B for No.",
                                        "Do you gain energy from being around people, Enter A  /for Yes or B for No.",
					"I prefer to work on projects myself. Enter A for Yes or B for No.",
					"I find it easy to start conversations with strangers. Enter A for Yes or B for No.",
					"I enjoy being the center of attention. Enter A for Yes or B for No.",
					"Sensing/Intuition.\nI prefer pratical and realistic information over abstract ideas. Enter A for Yes or B for No.",
					"I focus on future possibilities rather than past experiences. Enter A for Yes or B for No.",
					"I trust my hunches and gut feelings. Enter A for Yes or B for No.",
					"I am detail oriented and focus on the specifics. Enter A for Yes or B for No.",
					"I enjoy brainstorming and thinking about the big picture. Enter A for Yes or B for No.",
					"Thinking/Feeling.\n I make decisions based on logic and objective criteria. Enter A for Yes or B for No.",
					"I consider the impact of my decisions on others feelings. Enter A for Yes or B for No.",
					"I value fairness and justice over personal considerations. Enter A for Yes or B for No.",
					"I prioritize harmony over conflict. Enter A for Yes or B for No.",
					"I am more concerned with being tactful than being truthful. Enter A for Yes or B for No.",
					"Judging/Perceiving.\n i like to have a plan and stick to it. Enter A for Yes or B for No.",
					"i prefer to keep my options open and be spontaneous. Enter A for Yes or B for No.",
					"i feel stressed when things are unplanned or last minute. Enter A for Yes or B for No.",
					"i am comfortable with changing plans if needed. Enter A for Yes or B for No.",
					"i prefer to make decisions early rather than waiting until the last minute. Enter A for Yes or B for No."]
introvert = 0
extrovert = 0
sensing = 0
intuition = 0
thinking = 0
feeling = 0
judging = 0
perceiving = 0

 for display_questions in range (len(personality_questions)):
    print = personality_questions[display_questions]
    user_input = input(f'{personality_questions[display_questions]}. Enter A/B: ').strip().upper()
    if user_input == 'A' or user_input == 'B':
        if display_questions < 5:
            if user_input == 'A':
                extrovert +=1
            else:
                introvert +=1
        elif display_questions < 10:
            if user_input == 'A':
                sensing +=1
            else:
                intuition +=1
        elif display_questions < 15:
            if user_input == 'A':
                thinking +=1
            else:
                feeling +=1
        elif display_questions < 20:
            if user_input == 'A':
                judging +=1
            else:
                perceiving +=1
    else:
        print('Invalid Input, Enter A/B ')
        
print('Your MBTI personality Test Result is: ')
if extrovert > introvert:
    print('E')
else:
    print('I')
if sensing > intuition:
    print('S')
else:
    print('I')
if thinking > feeling:
    print('T')
else:
    print('F')
if judging > feeling:
    print('J')
else:
    print('F')
                
