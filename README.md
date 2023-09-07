# twilio-demo
Demo Application for sending SMS with Twilio

## Instructions
1. Create a free trial Twilio account. You will get some credit to test with (15$).
2. Verify your phone with Twilio (you can only send SMS to verified numbers during trial)
3. Register new Twilio number (US region). This number will be used to send SMS from (origin).
4. Create API Key (copy the secret as it will not be shown afterward).
5. Specify the following environment variables when running the app:
`
 TWILIO_ACCOUNT_SID=
 TWILIO_API_KEY_SID=
 TWILIO_API_KEY_SECRET=
 TWILIO_PHONE_NUMBER_ORIGIN=
`
6. Run the app and prepared Postman Request. 
   