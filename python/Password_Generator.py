import random
import time
import subprocess

def write_to_clipboard(output):
    process = subprocess.Popen(
        'pbcopy', env={'LANG': 'en_US.UTF-8'}, stdin=subprocess.PIPE)
    process.communicate(output.encode('utf-8'))

chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*()[];:<>/?~"

length = input("\nHow many characters should the password be? \n")

password = ''

def generate_password():
    global password

    for c in range(int(length)):
        password += random.choice(chars)

    print("\n \nGenerating... \n \n")
    time.sleep(0.5)

    print("The generated password is " + password + "\n \n")

generate_password()

copy = input("Would you like to copy the password to your clipboard? (y/n): ")

if copy == 'y':
    write_to_clipboard(password)
    print("Copied to clipboard! Make sure to save it using LastPass or something similar. \n \n")
elif copy == 'n':
    print()
