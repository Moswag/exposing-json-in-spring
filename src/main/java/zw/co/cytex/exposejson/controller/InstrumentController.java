package zw.co.cytex.exposejson.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zw.co.cytex.exposejson.exception.ResourceNotFoundException;
import zw.co.cytex.exposejson.model.InstrumentID;
import zw.co.cytex.exposejson.repository.InstrumentRepository;

import java.util.Collection;


@RestController
@RequestMapping("api")
public class InstrumentController {

    @Autowired
    InstrumentRepository instrumentRepository;

    @RequestMapping("/instrument/{id}")
    ResponseEntity<Boolean> getInstrumentId(@PathVariable String id){
        if(instrumentRepository.existsByInstrument(id)){
            return ResponseEntity.ok(true);
        }
        else{
            return ResponseEntity.ok(false);
        }
    }
}
