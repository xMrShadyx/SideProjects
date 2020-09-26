# https://levelup.gitconnected.com/test-internet-speed-using-python-python-programming-2b8b387b004f
# pip install speedtest-cli
import speedtest
from tqdm import tqdm
from time import sleep

CGREEN = '\33[32m'
CRED = '\033[91m'
CBLUE = '\33[34m'
CORANGE = '\33[33m'
CEND = '\033[0m'

print()
print('Please Wait, its slowly but surely loading....')
print()
s = speedtest.Speedtest()
dwn_spd = s.download()
upd_spd = s.upload()

dwn_spd = int(dwn_spd / 1000000)
upd_spd = int(upd_spd / 1000000)

for i in tqdm(range(1, dwn_spd), desc="Download Spd", unit=" patatos", leave=False):
    sleep(0.1)

if dwn_spd <= 20:
    print(CBLUE + 'Your download speed is: ' + CEND + CRED + str(dwn_spd) + ' Mbps, Does it feel slow ?' + CEND)
    print()
elif dwn_spd <= 50:
    print(CBLUE + 'Your download speed is: ' + CEND + CORANGE + str(
        dwn_spd) + ' Mbps, Your internet speed seems avarage.' + CEND)
    print()
elif dwn_spd > 50:
    print(CBLUE + 'Your download speed is: ' + CEND + CGREEN + str(
        dwn_spd) + ' Mbps, Your internet speed seems very fast... lol..' + CEND)
    print()

for i in tqdm(range(1, upd_spd), desc="Upload Spd", unit=" potatos", leave=False):
    sleep(0.1)
print(CBLUE + 'Your upload speed is: ' + CEND + CORANGE + str(
    upd_spd) + ' Mbps, ain\'t no one got time for this. sh!t...' + CEND)
print()

print('*' * 20, ' Closest Server to you?? ', '*' * 20)
print()
closest_servers = s.get_closest_servers()

for key, value in closest_servers[1].items():
    print(key, ' : ', value)
print()
print('*' * 68)

# import inspect
# for method in inspect.getmembers(s, predicate=inspect.ismethod):
#     print(method)
