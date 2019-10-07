import time
import pafy
from urllib import request
def playlist(url:str)->None:
	video=pafy.new(url)
	k=0
	##path=request.pathname2url(input("enter path").strip())k=0

	'''
	 UNCOMMENT THE LINES WHEN YOU WANT VARIOUS OPTIONS HAVING VARIOUS RESOLUTIONS AND FILESIZE
	for i in video.allstreams:
		print(str(k),i)
		k+=1
	length=len(video.allstreams)
	value=int(input("enter the value from "+str(0)+" - "+str(k-1)+"\n"))
	if value>k-1 or value<0:
		print("wrong value try again")
		exit(1)
	vid=video.allstreams[value-1]
	'''

	# this line will download the best video 
	vid=video.getbest()
	print("Extension of the video "+vid.extension)
	print("Resolution of the video "+vid.resolution)
	print("TITLE\n "+video.title)
	print("DURATION\n "+video.duration)
	print("AUTHOR\n "+video.author)
	print("FILESIZE\n "+str(vid.get_filesize()))
	print("download starting ")
	time.sleep(3)
	vid.download()

if __name__ == '__main__':
	url=input("enter the url of the video\n").strip()
	playlist(url)




