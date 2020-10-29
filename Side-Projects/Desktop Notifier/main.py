from plyer import notification

title = 'Hello Amazing People!'
message = '''Thank you for reading! Take Care!...Thank you for reading! Take Care!...Thank you for reading! Take Care!...'''


notification.notify(title= title,
                    message= message,
                    app_icon = None,
                    timeout= 10,
                    toast= False)
