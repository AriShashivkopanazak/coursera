import statistics
data = [15.80, 19.60, 21.85, 33.61, 49.73, 51.27, 56.26, 63.06, 76.56, 76.57, 85.78, 90.74, 92.60, 99.71, 100.51, 101.12, 101.25, 102.19, 104.85, 110.59, 125.92, 131.25, 136.04, 141.15, 148.54, 150.02]
data.append(162.7)
data.insert(8, 71.01)
print(data)
day = 0
x = 0
sum_data = []
for i in data:
    day +=1
print(day)
sum_data1 = data[0:7]
print(sum_data1)
sum_data2 = data[8:15]
sum_data3 = data[15:22]
sum_data4 = data[22:]
print('Average data in week one is:', statistics.mean(sum_data1))
print('Average data in week two is:', statistics.mean(sum_data2))
print('Average data in week three is:', statistics.mean(sum_data3))
print('Average data in week four is:', statistics.mean(sum_data4))