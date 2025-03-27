package com.api.trackingnumgenerator.service;

import com.api.trackingnumgenerator.model.Parcel;

import java.util.UUID;

public interface ParcelService {

    Parcel generateParcelTrackingNumber(String originCountryId, String destinationCountryId,
                                        Double weight, String customerName,
                                        String customerSlug,  UUID customerId,
                                        String createdTimestamp);


}
