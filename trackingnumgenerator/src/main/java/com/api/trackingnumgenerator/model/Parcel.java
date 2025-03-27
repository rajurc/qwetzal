package com.api.trackingnumgenerator.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data

@Document(collection = "parcel")

public class Parcel {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private String id;

    @Column(name = "origin_country_id")
    private String originCountryId;

    @Column(name = "destination_country_id:")
    private String destinationCountryId;

    @Column(name = "weight")
    private Double weight;

    @Column(name = "created_at")
    //Get the current timestamp
    private String  createdTimestamp = new SimpleDateFormat("yyyy-MM-dd'T'h:m:ssZZZZZ").format(new Date());

    @Column(name = "customer_id")
    private UUID customerId = UUID.randomUUID();

    @Column(name = "customer_name")
    private String customerName;

    @Column(name = "customer_slug")
    private String customerSlug;

    @Column(name = "tracking_number")
    private String trackingNumber;


    // Data annotation not creating the getter and setter methods. To start and run the application,
    // providing the getter and setter methods below explicitly.

    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id;
    }


    public String getOriginCountryId() {
        return originCountryId;
    }

    public void setOriginCountryId(String originCountryId) {
        this.originCountryId = originCountryId;
    }

    public String getDestinationCountryId() {
        return destinationCountryId;
    }

    public void setDestinationCountryId(String destinationCountryId) {
        this.destinationCountryId = destinationCountryId;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getCreatedTimestamp() {
        return createdTimestamp;
    }

    public void setCreatedTimestamp(String createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    public UUID getCustomerId() {
        return customerId;
    }

    public void setCustomerId(UUID customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerSlug() {
        return customerSlug;
    }

    public void setCustomerSlug(String customerSlug) {
        this.customerSlug = customerSlug;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Parcel parcel = (Parcel) o;
        return Objects.equals(id, parcel.id) && Objects.equals(originCountryId, parcel.originCountryId) && Objects.equals(destinationCountryId, parcel.destinationCountryId) && Objects.equals(weight, parcel.weight) && Objects.equals(createdTimestamp, parcel.createdTimestamp) && Objects.equals(customerId, parcel.customerId) && Objects.equals(customerName, parcel.customerName) && Objects.equals(customerSlug, parcel.customerSlug) && Objects.equals(trackingNumber, parcel.trackingNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, originCountryId, destinationCountryId, weight, createdTimestamp, customerId, customerName, customerSlug, trackingNumber);
    }


}
