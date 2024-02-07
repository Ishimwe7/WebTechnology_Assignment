function validateRegistrationForm() {
    var firstName = document.getElementById("firstName").value;
    var lastName = document.getElementById("lastName").value;
    var email = document.getElementById("email").value;
    var phone = document.getElementById("phone").value;
    var position = document.getElementById("position").value;
    var department = document.getElementById("department").value;
    var dob = document.getElementById("dob").value;
    var address = document.getElementById("address").value;
    var password = document.getElementById("password").value;
    var confirmPassword = document.getElementById("confirmPassword").value;
    const loginBtn = document.getElementById("loginBtn");

    // Basic validation example (you can add more complex validations)
    if (firstName === "" || lastName === "" || email === "" || phone === "" || position === "" ||
        department === "" || dob === "" || address === "" || password === "" || confirmPassword === "") {
        alert("All fields must be filled out");
        return false;
    }

    if (password !== confirmPassword) {
        alert("Password and Confirm Password must match");
        return false;
    }

    return true;
}

loginBtn.onclick = function validateLoginForm() {
    var username = document.getElementById("username").value;
    var password = document.getElementById("password").value;

    // Basic validation example (you can add more complex validations)
    if (username === "" || password === "") {
        alert("All fields are required!");
        return false;
    }
    else if(username ==="admin" && password ==="admin"){
        alert("Login Success!");
    }
    else{
        alert("Login Failed!");
    }

    return true;
}