package com.arpit.spring.oauth.controller;

import com.arpit.spring.oauth.dto.ReceiveOCTRequestDTO;
import com.arpit.spring.oauth.dto.rs.ReceiveOctResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/visa/receive")
@CrossOrigin
public class VisaDirectReceiveSideController {

    @PostMapping(value = "/oct")
    public ResponseEntity save(@RequestBody ReceiveOCTRequestDTO receiveOCTRequestDTO) {
        final ReceiveOctResponse receiveOctResponse = new ReceiveOctResponse();
        receiveOctResponse.setResponseCode("00");
        receiveOctResponse.setAuthIdResponse("00");
        receiveOctResponse.setCpsAuthorizationCharacteristicsIndicator("00");
        receiveOctResponse.setReceiverTransactionId("00");
        return new ResponseEntity<>(receiveOctResponse,
                HttpStatus.OK);
    }
}
