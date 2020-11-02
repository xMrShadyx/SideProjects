from flask import Flask, redirect, url_for

app = Flask(__name__)


@app.route("/")
def home():
    return "Welcome first flask try... damn <h1>ELLOOO</h1>"

@app.route("/<name>")
def user(name):
    return f"Hello {name}!"

@app.route("/admin")
def admin():
    return redirect(url_for("home"))

if  __name__ == '__main__':
    app.run()
