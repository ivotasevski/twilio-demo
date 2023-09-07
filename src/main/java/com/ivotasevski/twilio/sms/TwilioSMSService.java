package com.ivotasevski.twilio.sms;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Slf4j
@Service
public class TwilioSMSService implements SMSService {

    @Value("${twilio.apikey.sid}")
    private String twilioApiKeySid;

    @Value("${twilio.apikey.secret}")
    private String twilioApiKeySecret;

    @Value("${twilio.account.sid}")
    private String twilioAccountSid;

    @Value("${twilio.phonenumber.origin}")
    private String twilioPhoneNumber;


    @PostConstruct
    private void init() {
        Twilio.init(twilioApiKeySid, twilioApiKeySecret, twilioAccountSid);
    }

    public void sendSMS(String destination, String payload) {
        Message message = Message.creator(
                        new PhoneNumber(destination),
                        new PhoneNumber(twilioPhoneNumber),
                        payload)
                .create();

        log.info("Message was sent to {}. Status: {}. Payload: '{}'", destination, message.getStatus(), payload);
    }
}
