package com.api.trackingnumgenerator.controller;


import com.api.trackingnumgenerator.model.Parcel;
import com.api.trackingnumgenerator.service.ParcelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class ParcelController {

    @Autowired
    private ParcelService parcelService;

    @GetMapping("/next-tracking-number")
    public ResponseEntity<Parcel> getDeviceById(@RequestParam(name="origin_country_id", required = false) String originCountryId,
                                                @RequestParam(name="destination_country_id",required = false) String destinationCountryId,
                                                @RequestParam(name="weight",required = false) Double weight,
                                                @RequestParam(name="created_at",required = false) String createdTimestamp,
                                                @RequestParam(name="customer_id",required = false) UUID customerId,
                                                @RequestParam(name="customer_name",required = false) String customerName,
                                                @RequestParam(name="customer_slug",required = false) String customerSlug){



        Parcel parcel = parcelService.generateParcelTrackingNumber(originCountryId,destinationCountryId,
                weight,customerName,customerSlug,customerId,createdTimestamp );

        return new ResponseEntity<Parcel>(parcel, HttpStatus.OK);
    }
}
