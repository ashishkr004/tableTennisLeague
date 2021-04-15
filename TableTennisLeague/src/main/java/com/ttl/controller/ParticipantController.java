package com.ttl.controller;

import com.ttl.entities.ParticipantDto;
import com.ttl.entities.ResponseDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ttl/v1.0/participant")
public class ParticipantController {

    @PostMapping
    public ResponseEntity<ResponseDto> addParticipant(@RequestBody ParticipantDto participantDto) throws Exception {
        try{

        }catch (Exception e) {
            throw new Exception();
        }

        return null;
    }
}
