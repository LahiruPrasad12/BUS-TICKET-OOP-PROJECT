function myfun() {
    var UserName = document.getElementById('uid').value;
    var UserFname = document.getElementById('UFname').value;
    var UserLname = document.getElementById('ULname').value;
    var UserEmail = document.getElementById('UEmail').value;
    var UserPass = document.getElementById('UPass').value;
    var UserConfir = document.getElementById('UCPass').value;

    if (UserName != "" && UserFname != "" && UserLname != "" && UserEmail != "" && UserPass.length > 8 && UserConfir != "") {
        return true;
    } else {
        if (UserName == "") {
            console.log("false");
            document.getElementById('UBlank').innerHTML = "*Please enter the user name";
        } else if (UserName != "") {
            document.getElementById('UBlank').innerHTML = "";
        }
        if (UserFname == "") {
            document.getElementById('FBlank').innerHTML = "*Please enter the First Name";
        } else if (UserFname != "") {
            document.getElementById('FBlank').innerHTML = "";
        }
        if (UserLname == "") {
            document.getElementById('LBlank').innerHTML = "*Please enter the Last Name";
        } else if (UserLname != "") {
            document.getElementById('LBlank').innerHTML = "";
        }
        if (UserEmail == "") {
            document.getElementById('EmailBlank').innerHTML = "*Please enter the Email";
        } else if (UserEmail != "") {
            document.getElementById('EmailBlank').innerHTML = "";
        }
        if (UserPass == "") {
            document.getElementById('PassBlank').innerHTML = "*Please enter your password";
        }
        if (UserPass.length <= 8) {
            document.getElementById('PassBlank').innerHTML = "Minimum length is eight";
        } else if (UserPass != "") {
            document.getElementById('PassBlank').innerHTML = "";
        }
        if (UserConfir == "") {
            document.getElementById('PasscBlank').innerHTML = "*Please enter your password Again";
        } else if (UserConfir != "") {
            document.getElementById('PasscBlank').innerHTML = "";
        }
        if (UserPass != UserConfir) {
            document.getElementById('PasscBlank').innerHTML = "*Please enter confirm password";
        }
        return false
    }

}