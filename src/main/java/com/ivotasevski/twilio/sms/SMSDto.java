package com.ivotasevski.twilio.sms;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class SMSDto {

    @NotEmpty
    private String destination;

    @NotEmpty
    private String payload;
}
