# import PyPDF2 as pdf
# pdfFileObj = open('/home/abhishek/Desktop/college/resume/Abhishek Mandal.pdf', 'rb')
# pdfReader = pdf.PdfFileReader(pdfFileObj)
# print(pdfReader.numPages)
# print(pdfReader.getPage(0).extractText())
# print(pdfReader.isEncrypted)

import csv
# outputFileWriter = csv.writer(open('hello.csv', 'w', newline=''))
# outputFileWriter.writerow("GoodMorning world how are you doing".split())

with open('hello.csv', 'w', newline = '') as f:
    outputFileWriter = csv.writer(f)
    arr = {
       'first': {
        'name' : 'sdlfsldjf'
    },
    
    'second' : {
        'name' : 'abhishek'
    },
    }
# print(type(outputFileWriter), type(arr))
    def printDict(d : dict, writer : csv.writer) -> None:
        for k, v in d.items():
            if isinstance(v, dict):
                printDict(v, writer)
            else:
                writer.writerow([str(k), str(v)])
    # printDict(arr, outputFileWriter)
    outputFileWriter.writerow(str(arr))