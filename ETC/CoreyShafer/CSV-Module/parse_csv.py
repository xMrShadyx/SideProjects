import csv

# # if open file with wrong delimiter
# with open("new_names.csv", 'r') as csv_file:
# 	csv_reader = csv.reader(csv_file) < Wrong, OK > (new_file, delimiter='\t')
#
# 	for line in csv_reader:
# 		print(line)


# with open("names.csv", 'r') as csv_file:
# 	csv_reader = csv.reader(csv_file)
#
# 	# next(csv_reader)
# 	with open('new_names.csv', 'w') as new_file:
# 		csv_writer = csv.writer(new_file, delimiter='\t')
#
# 		for line in csv_reader:
# 			csv_writer.writerow(line)
# 			# print(line)
# 			# print(line[2])


# with open("names.csv", 'r') as csv_file:
# 	csv_reader = csv.DictReader(csv_file)

# for line in csv_reader:
# print(line)
# print(line['email'])


with open("names.csv", 'r') as csv_file:
	csv_reader = csv.DictReader(csv_file, delimiter=',')

	with open('new_names.csv', 'w') as new_file:
		fieldnames = ['first_name', 'last_name']

		csv_writer = csv.DictWriter(new_file, fieldnames=fieldnames, delimiter='\t')
		csv_writer.writeheader()

		for line in csv_reader:
			del line['email']
			csv_writer.writerow(line)
