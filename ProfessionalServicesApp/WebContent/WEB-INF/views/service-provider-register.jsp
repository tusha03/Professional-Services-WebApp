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
            <form class="form-horizontal" action="serviceProviderRegister" method="post">
                <div class="form-group">
                    <label>User Name</label>
                    <input type="text" name="serName" class="form-control" placeholder="User Name">
                </div>
                <div class="form-group">
                    <label>Email ID</label>
                    <input type="email" name="serEmail" class="form-control" placeholder="Email Address">
                </div>
                <div class="form-group">
                    <label>Password</label>
                    <input type="password" name="serPass" class="form-control" placeholder="Password">
                </div>
                <div class="form-group">
                    <label>Confirm Password</label>
                    <input type="password" name="serConPass" class="form-control" placeholder="Confirm Password">
                </div>
                <div class="form-group">
                    <label>Age</label>
                    <input type="text" name="serAge" class="form-control" placeholder="Age">
                </div>
                <div class="form-group">
                    <label>Contact</label>
                    <input type="tel" name="serCont" class="form-control" placeholder="Contact Number">
                </div>
                <div class="form-group">
                    <label>Address</label>
                    <input type="text" name="serAdd" class="form-control" placeholder="Address">
                </div>
                <div class="form-group">
                    <label>Pincode</label>
                    <input type="text" name="serPin" class="form-control" placeholder="Pincode">
                </div>
                <div class="form-group">
                    <label>Area</label>
                    <input type="text" name="serArea" class="form-control" placeholder="Area">
                </div>
                <div class="form-group">
                    <label>City</label>
                    <input type="text" name="serCity" class="form-control" placeholder="City">
                </div>
                <div class="form-group">
                    <label>Latitude</label>
                    <input type="text" name="serLat" class="form-control" placeholder="Latitude">
                </div>
                <div class="form-group">
                    <label>Longitude</label>
                    <input type="text" name="serLong" class="form-control" placeholder="Longitude">
                </div>
                <div class="form-group">
                    <label>Category</label>
                     <select class="form-control" name="serCat" id="categorySelect" onchange="updateServiceTypes()">
			        <option value="none">Select Category</option>
			        <option value="Home Cleaning">Home Cleaning</option>
			        <option value="Electrical">Electrical</option>
			        <option value="Carpentry">Carpentry</option>
			        <option value="Lock Installation">Lock Installation</option>
			        <option value="Security System">Security System Installation</option>
			        <option value="Plumbing">Plumbing</option>
			    </select>
                </div>
                
                
                    <div class="form-group">
                    <label>Service Type</label>
                    <select class="form-control" name="serSer" id="serviceTypeSelect">
                        <option value="none">Select Service Type</option>
                    </select>
                </div>
                <div class="form-group">
                    <label>Open Time</label>
                    <input type="time" name="serOpen" class="form-control" placeholder="Open Time">
                </div>
                <div class="form-group">
                    <label>Close Time</label>
                    <input type="time" name="serClose" class="form-control" placeholder="Close Time">
                </div>
                <div class="form-group">
                    <label>Gender</label>
                    <select class="form-control" name="serGen">
                        <option value="male">Male</option>
                        <option value="female">Female</option>
                        <option value="other">Other</option>
                    </select>
                </div>
                <div class="check-terms">
                    <input type="checkbox" class="checkbox">
                    <span class="check-label">I agree to the terms</span>
                </div>
                <span class="signin-link">Already have an account? Click here to <a href="service-provider-login">Login</a></span>
                <button class="signup">Create Account</button>
            </form>
        </div>
    </div>



    <script>
    function updateServiceTypes() {
        var categorySelect = document.getElementById("categorySelect");
        var serviceTypeSelect = document.getElementById("serviceTypeSelect");
        var selectedCategory = categorySelect.value;
        serviceTypeSelect.innerHTML = ""; // Clear previous options

        if (selectedCategory === "none") {
            serviceTypeSelect.innerHTML = "<option value='none'>Select Service Type</option>"; // Reset service type dropdown
        } else if (selectedCategory === "Home Cleaning") {
            var homeCleaningServices = ["Regular Cleaning", "Deep Cleaning", "Carpet Cleaning", "Window Washing"];
            populateDropdown(serviceTypeSelect, homeCleaningServices);
        } else if (selectedCategory === "Electrical") {
            var electricalServices = ["Installation", "Repair", "Wiring", "Fixture Installation"];
            populateDropdown(serviceTypeSelect, electricalServices);
        } else if (selectedCategory === "Carpentry") {
            var carpentryServices = ["Furniture Repair", "Cabinet Installation", "Door Repair", "Woodworking"];
            populateDropdown(serviceTypeSelect, carpentryServices);
        } else if (selectedCategory === "Lock Installation") {
            var lockInstallationServices = ["Door Lock Installation", "Window Lock Installation", "Safe Installation"];
            populateDropdown(serviceTypeSelect, lockInstallationServices);
        } else if (selectedCategory === "Security System") {
            var securitySystemServices = ["Alarm System Installation", "CCTV Installation", "Access Control System"];
            populateDropdown(serviceTypeSelect, securitySystemServices);
        } else if (selectedCategory === "Plumbing") {
            var plumbingServices = ["Pipe Repair", "Drain Cleaning", "Water Heater Installation", "Leak Detection"];
            populateDropdown(serviceTypeSelect, plumbingServices);
        }
        // Add more categories and their respective service types as needed
    }

        
         
        
        function populateDropdown(selectElement, optionsArray) {
            optionsArray.forEach(function (option) {
                var optionElement = document.createElement("option");
                optionElement.value = option;
                optionElement.textContent = option;
                selectElement.appendChild(optionElement);
            });
        }
    </script>
</body>

</html>