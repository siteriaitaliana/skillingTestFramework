driver = "chrome"

waiting {
    timeout = 10
    retryInterval = 0.5
}

atCheckWaiting = true

unexpectedPages = [PageNotFoundPage, InternalServerErrorPage]
reportOnTestFailureOnly = true


// #### Test Data #### //

validUser =
    [
        'email': 'christian@skilling.com',
        'password': 'Winter123!',
        'username': 'Christian'
    ]
