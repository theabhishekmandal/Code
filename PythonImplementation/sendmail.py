import smtplib
text = "Hello there!"
ml = smtplib.SMTP('smtp.gmail.com', 587)
ml.ehlo()
ml.starttls()
ml.login("abhishekmandal0097@gmail.com","98183166269810779280")
ml.sendmail('nobody@cia.com','abhishekmandal0097@gmail.com', text)
ml.close()