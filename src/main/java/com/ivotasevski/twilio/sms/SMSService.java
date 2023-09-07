package com.ivotasevski.twilio.sms;

public interface SMSService {

    void sendSMS(String destination, String payload);
}
