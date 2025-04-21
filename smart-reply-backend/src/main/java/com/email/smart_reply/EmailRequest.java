package com.email.smart_reply;

import lombok.Data;

@Data
public class EmailRequest {
    private String emailContent;
    private String tone;
}
