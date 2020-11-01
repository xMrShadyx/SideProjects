# import os
# from datetime import datetime

# print(dir(os))
# print(os.getcwd())  # <- Current location
# os.chdir('E:\Coding\PyProject\ETC\CoreyShafer\OS-Module')  # <- os.chdir stand for change directory
#os.chdir('C:\\Users\\xMrShadyx\\Desktop')  # <- os.chdir stand for change directory
# print(os.getcwd())  # <- Current location
# os.mkdir('OS-Demo-55') # <- Single folder creation
# os.makedirs('OS-Demo-2/Sub-Dir-1')  # <- multiple folder creation
# os.rmdir('OS-Demo-55')  # <- Remove Single folder creation
# os.removedirs('OS-Demo-2/Sub-Dir-1')  # <- remove multiple folder creation
# os.rename('snippets.txt', 'demo.txt') # <- Rename files
# os.rename('demo.txt', 'snippets.txt')

# print(os.stat('snippets.txt')) # <- Statistics for current folder
# mod_time = os.stat('snippets.txt').st_mtime
# print(datetime.fromtimestamp(mod_time))
# print(os.listdir())  # <- show files in current location

# For loop for walking through whole file system.
# for dirpath, dirnames, filenames in os.walk('C:\\Users\\xMrShadyx\\Desktop'):
# 	print('Current Path:', dirpath)
# 	print('Directries:', dirnames)
# 	print('Files:', filenames)
# 	print()

# print(os.environ.get("HOME"))  # <- Environment Variables
# file_path = os.path.join(os.getcwd(), 'text.txt')  # <- Create file using environment locations
# print(file_path)

# with open (file_path, 'w') as f: # <- file creation
# 	f.write()

# print(os.path.basename("/tmp/test.txt"))
# print(os.path.dirname("/tmp/test.txt"))
# print(os.path.split("/tmp/test.txt"))
# print(os.path.splitext("/tmp/test.txt"))  # <- file name without extension,
# print(os.path.exists("/tmp/test.txt"))
#
# print(os.path.isdir("/tmp/test.txt"))  # <- return true if is directory,
# print(os.path.isfile("/tmp/test.txt"))  # <- return true if is file
#
# print(dir(os.path))
