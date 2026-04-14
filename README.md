#  Registration & Login System (Java)

##  Overview

This project is a simple **Java console-based Registration and Login System**. It allows users to create an account with validated details and then log in using their credentials.

The system focuses on **input validation**, **basic security rules**, and **user authentication**.

---

##  Features

###  User Registration

Users must enter:

* First Name
* Last Name
* Username
* Password
* Cell Phone Number

The system checks every input before accepting registration.

---

### Validation Rules

####  Username

* Must contain an underscore `_`
* Must be **no more than 5 characters**

####  Password

* Must be at least **8 characters long**
* Must contain:

    * At least **one uppercase letter**
    * At least **one number**
    * At least **one special character**

####  Cell Phone Number

* Must start with **+27** (South African international code)
* Must contain **up to 10 digits** after `+27`

---

###  Login System

After successful registration:

* Users can log in using their username and password
* The system checks credentials that were stored when the user was **Registering**
* The system uses a **while loop** for checking if the details match

---

###  System Messages

* Displays clear messages for:

    * Invalid username/password/phone number
    * Successful registration
    * Successful login
    * Failed login attempts

Example:

```
Welcome John, Doe it is great to see you again.
```

---

##  Project Structure

### Login Class

Handles all core logic:

* Username validation
* Password validation
* Phone number validation
* User registration
* Login authentication
* Login status messages

### RegistrationSystem Class

* Contains the `main` method
* Handles user input via `Scanner`
* Controls the flow:

  1. Registration
   2. Validation
    3. Login

---

##  How It Works

1. User enters registration details
2. System validates:

    * Username format
    * Password strength
    * Phone number format
3. If valid:

    * Details are stored
    * User proceeds to login
4. User logs in:

    * Credentials are checked
    * Success or failure message is displayed

---
## References 

Regex researched from : https://www.w3schools.com/tools/tool_regex.php#gsc.tab=0

