package com.api.trackingnumgenerator.service.impl;

import com.api.trackingnumgenerator.model.Parcel;
import com.api.trackingnumgenerator.repository.ParcelRepository;
import com.api.trackingnumgenerator.service.ParcelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.UUID;

@Service
public class ParcelServiceImpl implements ParcelService {

    @Autowired
    private ParcelRepository parcelRepository;

    @Override
    public Parcel generateParcelTrackingNumber( String originCountryId, String destinationCountryId,
                                                Double weight, String customerName,
                                                String customerSlug, UUID customerId,
                                                String createdTimestamp) {


        String parcelTrackingNumber = randomAlphanumericString(16);
        Parcel parcel = new Parcel();
        parcel.setOriginCountryId(originCountryId);
        parcel.setDestinationCountryId(destinationCountryId);
        parcel.setWeight(weight);
        parcel.setCreatedTimestamp(createdTimestamp);
        parcel.setCustomerId(customerId);
        parcel.setCustomerName(customerName);
        parcel.setCustomerSlug(customerSlug);
        parcel.setTrackingNumber(parcelTrackingNumber);

        return parcelRepository.save(parcel);

        //return null;

    }


    public  String randomAlphanumericString(int length) {
        String alphanumericCharacters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

        StringBuffer randomString = new StringBuffer(length);
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(alphanumericCharacters.length());
            char randomChar = alphanumericCharacters.charAt(randomIndex);
            randomString.append(randomChar);
        }

        return randomString.toString();
    }

}


