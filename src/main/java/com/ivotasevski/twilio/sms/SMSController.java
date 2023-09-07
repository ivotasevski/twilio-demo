package com.ivotasevski.twilio.sms;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/sms")
public class SMSController {

    private final SMSService smsService;

    @PostMapping
    public void sendSMS(@RequestBody SMSDto sms) {
        smsService.sendSMS(sms.getDestination(), sms.getPayload());
    }

}
