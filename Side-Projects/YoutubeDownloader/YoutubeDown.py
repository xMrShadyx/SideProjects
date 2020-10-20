"""
For pytube to work properly, you need to go to : \\AppData\\Local\\Programs\\Python\\Python39\\Lib\\site-packages\\pytube\\extract.py
at line : 301 or locate with ctrl + F
except KeyError:
            cipher_url = [
                parse_qs(formats[i]["cipher"]) for i, data in enumerate(formats)

and replace parse_qs with:

cipher_url = [
                parse_qs(formats[i]["signatureCipher"]) for i, data in enumerate(formats)
            ]
You can work with all youtube links only this way, before pytube auth fixes it...
"""

import os
from pytube import YouTube #pip install pytube3
from moviepy.editor import * #pip install moviepy **Requires numpy!!!!


# Can have multiple items in list
playlist = ['https://www.youtube.com/watch?v=o_l4Ab5FRwM&list=RDo_l4Ab5FRwM&start_radio=1']

# Download all the videos from list above "playlist = []"

for item in playlist:
    url = item
    my_video = YouTube(url)
    print("****Video Title****")
    print(my_video.title)
    print("***Download video***")
    my_video = my_video.streams.get_highest_resolution()
    my_video.download()


# Rename's some of the special characters which seems like give most of the errors.
for file in os.listdir("E:\\Coding\\PyProject\\Side-Projects\\YoutubeDownloader"):
    if file.endswith(".mp4"):
        os.rename(file, file.replace(" ", "").replace("-", "").replace("!", "").replace("(", "").replace(")", ""))

# Sorting all .mp4 files into one list "n_list"
list_n = []
for file in os.listdir("E:\\Coding\\PyProject\\Side-Projects\\YoutubeDownloader"):
    if file.endswith(".mp4"):
        list_n.append(file)

# Converting mp4 files from n_list to mp3 files
for item in list_n:
    print(item)
    mp4_file = r'{}'.format(item)
    mp3_file = r'{}.{}'.format(item,'mp3')

    videoclip = VideoFileClip(mp4_file)
    audioclip = videoclip.audio
    audioclip.write_audiofile(mp3_file)
    audioclip.close()
    videoclip.close()

    os.remove(item) # <- In case you don't want the video. just the mp3






