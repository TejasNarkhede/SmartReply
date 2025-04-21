package com.email.smart_reply;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/email")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class ReplyController {

    private final ReplyService replyService;

    @PostMapping("/reply")
    public ResponseEntity<String> generateReply(@RequestBody EmailRequest emailRequest) {
        String response = replyService.generateEmailReply(emailRequest);
        return ResponseEntity.ok(response);
    }
}
