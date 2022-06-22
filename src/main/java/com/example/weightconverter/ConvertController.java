package com.example.weightconverter;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConvertController {

        Converter convert = new Converter();

        @RequestMapping("/ed")
        public double ounce (
                @RequestParam double ounce) {
            return convert.ouncetogram(ounce);
        }

    @RequestMapping("/stonetokilo")
    public double stone (
            @RequestParam double stone) {
        return convert.stonetokilo(stone);
    }




}
