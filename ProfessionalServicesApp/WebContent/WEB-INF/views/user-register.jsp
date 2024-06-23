<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registration Form</title>
    <style>
        body {
            font-family: 'Titillium Web', sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
        }

        .form-bg {
            display: flex;
            align-items: center;
            justify-content: center;
            height: 100vh;
        }

        .form-container {
            background-color: #fff;
            padding: 30px;
            border-radius: 20px;
            box-shadow: 0 0 25px -15px rgba(0, 0, 0, 0.3);
            width: 100%;
            max-width: 800px;
            /* Increased width */
        }

        .form-container .title {
            color: #000;
            font-size: 25px;
            font-weight: 600;
            text-transform: capitalize;
            margin: 0 0 25px;
        }

        .form-container .title:after {
            content: '';
            background-color: #00A9EF;
            height: 3px;
            width: 60px;
            margin: 10px 0 0;
            display: block;
            clear: both;
        }

        .form-container .sub-title {
            color: #333;
            font-size: 18px;
            font-weight: 600;
            text-align: center;
            text-transform: uppercase;
            margin: 0 0 20px;
        }

        .form-container .form-horizontal {
            font-size: 0;
            display: flex;
            flex-wrap: wrap;
            justify-content: space-between;
        }

        .form-container .form-group {
            width: calc(50% - 10px);
            /* Adjusted width for two columns */
            margin-bottom: 15px;
        }

        .form-container .form-group label {
            font-size: 17px;
            font-weight: 600;
            display: block;
            margin-bottom: 5px;
        }

        .form-container .form-control {
            color: #888;
            background: #fff;
            font-weight: 400;
            letter-spacing: 1px;
            height: 40px;
            padding: 6px 12px;
            border-radius: 10px;
            border: 2px solid #e7e7e7;
            box-shadow: none;
            width: 100%;
            box-sizing: border-box;
        }

        .form-container .form-control:focus {
            box-shadow: 0 0 5px #dcdcdc;
        }

        .form-container .check-terms {
            margin-bottom: 25px;
        }

        .form-container .check-terms .check-label {
            color: #333;
            font-size: 14px;
            font-weight: 500;
            font-style: italic;
            vertical-align: top;
            display: inline-block;
        }

        .form-container .check-terms .checkbox {
            height: 17px;
            width: 17px;
            min-height: auto;
            margin: 2px 8px 0 0;
            border: 2px solid #d9d9d9;
            border-radius: 2px;
            cursor: pointer;
            display: inline-block;
            position: relative;
            appearance: none;
            -moz-appearance: none;
            -webkit-appearance: none;
            transition: all 0.3s ease 0s;
        }

        .form-container .check-terms .checkbox:before {
            content: '';
            height: 5px;
            width: 9px;
            border-bottom: 2px solid #00A9EF;
            border-left: 2px solid #00A9EF;
            transform: rotate(-45deg);
            position: absolute;
            left: 2px;
            top: 2.5px;
            transition: all 0.3s ease;
        }

        .form-container .check-terms .checkbox:checked:before {
            opacity: 1;
        }

        .form-container .check-terms .checkbox:not(:checked):before {
            opacity: 0;
        }

        .form-container .check-terms .checkbox:focus {
            outline: none;
        }

        .form-container .signin-link {
            color: #333;
            font-size: 14px;
            margin-bottom: 15px;
            display: block;
        }

        .form-container .signin-link a {
            color: #00A9EF;
            font-weight: 600;
            transition: all 0.3s ease 0s;
        }

        .form-container .signin-link a:hover {
            text-decoration: underline;
        }

        .form-container .form-horizontal .signup {
            color: #fff;
            background: #00A9EF;
            font-size: 15px;
            font-weight: 700;
            text-transform: uppercase;
            letter-spacing: 1px;
            width: 100%;
            padding: 8px 15px 9px;
            border-radius: 10px;
            transition: all 0.3s ease 0s;
            cursor: pointer;
        }

        .form-container .form-horizontal .signup:hover {
            text-shadow: 0 0 5px rgba(0, 0, 0, 0.5);
            box-shadow: 3px 3px rgba(0, 0, 0, 0.15), 5px 5px rgba(0, 0, 0, 0.1);
            outline: none;
        }
    </style>
</head>

<body>
    <div class="form-bg">
        <div class="form-container">
            <h3 class="title">Register</h3>
            <form class="form-horizontal" action="addUserCustomer" method="post">

                <div class="form-group">
                    <label>User Name</label>
                    <input type="text" name="name" class="form-control" placeholder="User Name">
                </div>
                <div class="form-group">
                    <label>Email ID</label>
                    <input type="email" name="email" class="form-control" placeholder="Email Address">
                </div>

                <div class="form-group">
                    <label>Password</label>
                    <input type="password" name="pass" class="form-control" placeholder="Password">
                </div>
                <div class="form-group">
                    <label>Contact</label>
                    <input type="tel" name="cont" class="form-control" placeholder="Contact Number">
                </div>

                <div class="form-group">
                    <label>DOB</label>
                    <input type="date" name="dob" class="form-control" placeholder="DOB">
                </div>
                <div class="form-group">
                    <label>Gender</label>
                    <select class="form-control" name="gen">
                        <option value="male">Male</option>
                        <option value="female">Female</option>
                        <option value="other">Other</option>
                    </select>
                </div>

                <div class="form-group">
                    <label>Address</label>
                    <input type="text" name="address" class="form-control" placeholder="Address">
                </div>
                <div class="form-group">
                    <label>Pincode</label>
                    <input type="text" name="pin" class="form-control" placeholder="Pincode">
                </div>

                <div class="form-group">
                    <label>Area</label>
                    <input type="text" name="area" class="form-control" placeholder="Area">
                </div>
                <div class="form-group">
                    <label>City</label>
                    <input type="text" name="city" class="form-control" placeholder="City">
                </div>

                <div class="form-group">
                    <label>Latitude</label>
                    <input type="text" name="lat" class="form-control" placeholder="Latitude">
                </div>
                <div class="form-group">
                    <label>Longitude</label>
                    <input type="text" name="log" class="form-control" placeholder="Longitude">
                </div>

                <div class="check-terms">
                    <input type="checkbox" class="checkbox">
                    <span class="check-label">I agree to the terms</span>
                </div>
                <span class="signin-link">Already have an account? Click here to <a
                        href="user-login.html">Login</a></span>
                <button class="signup">Create Account</button>
            </form>
        </div>
    </div>
</body>

</html>