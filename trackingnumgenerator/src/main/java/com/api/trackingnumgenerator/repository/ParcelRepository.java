package com.api.trackingnumgenerator.repository;

import com.api.trackingnumgenerator.model.Parcel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParcelRepository extends MongoRepository<Parcel,String> {


}
