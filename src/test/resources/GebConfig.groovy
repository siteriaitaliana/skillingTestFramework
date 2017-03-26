driver = "chrome"

waiting {
    timeout = 10
    retryInterval = 0.5
}

reportsDir = "geb-reports"


// #### Test Data #### //

validUser =
    [
        'email': 'christian@skilling.com',
        'password': 'Winter123!',
        'username': 'Christian'
    ]
