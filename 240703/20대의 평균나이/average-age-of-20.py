count = 0
sum_age = 0.0

while True:
    age = int(input())
    
    if age < 20 or age >= 30:
        break
        
    sum_age += age
    count += 1

average_age = sum_age / count
print(f'{average_age:.2f}')