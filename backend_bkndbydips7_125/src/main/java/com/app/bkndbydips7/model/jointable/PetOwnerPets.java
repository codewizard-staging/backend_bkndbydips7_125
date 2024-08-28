package com.app.bkndbydips7.model.jointable;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import lombok.Data;
import javax.persistence.*;

import com.app.bkndbydips7.model.Manager;
import com.app.bkndbydips7.model.Pet;
import com.app.bkndbydips7.model.PetCareCenter;
import com.app.bkndbydips7.model.PetOwner;
import com.app.bkndbydips7.model.Document;
import com.app.bkndbydips7.model.PetService;
import com.app.bkndbydips7.enums.PetServiceType;
import com.app.bkndbydips7.converter.PetServiceTypeConverter;

@Entity(name = "PetOwnerPets")
@Table(schema = "\"bkndbydips7\"", name = "\"PetOwnerPets\"")
@Data
public class PetOwnerPets{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"OwnerId\"")
	private Integer ownerId;

    
    @Column(name = "\"PetId\"")
    private Integer petId;
 
}