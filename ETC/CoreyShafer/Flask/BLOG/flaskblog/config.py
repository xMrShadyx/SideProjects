import os

class Config:
    SECRET_KEY = os.environ.get('SECRET_KEY_504bitx2')
    SQLALCHEMY_DATABASE_URI = 'sqlite:///site.db'
    # Mail Sender
    MAIL_SERVER = 'smtp.googlemail.com'
    MAIL_PORT = 587
    MAIL_USE_TLS = True
    MAIL_USERNAME = 'xmrshadyx'
    MAIL_PASSWORD = 'daredevil911'
