import pafy
import url
import pprint
url=input("enter the url of the playlist\n").strip()
playlistdict=pafy.get_playlist(url)
'''for i in playlistdict:
    print(i)
'''
'''
k=0
for i in playlistdict:
    print("quality of video "+str(k+1))
    for j in playlistdict['items'][k]['pafy'].videostreams:
        print(j)
    print("\n")
    k+=1

'''
pprint(playlistdict.videostreams)

'''print("playlist author "+playlistdict['author'])
print("playlist title "+playlistdict['title'])
print("playlist items "+str(len(playlistdict['items'])))
'''