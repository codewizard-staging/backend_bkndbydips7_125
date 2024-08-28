package com.app.bkndbydips7.function;

import com.app.bkndbydips7.model.Manager;
import com.app.bkndbydips7.model.Pet;
import com.app.bkndbydips7.model.PetCareCenter;
import com.app.bkndbydips7.model.PetOwner;
import com.app.bkndbydips7.model.Document;
import com.app.bkndbydips7.model.PetService;
import com.app.bkndbydips7.enums.PetServiceType;
import com.app.bkndbydips7.converter.PetServiceTypeConverter;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataFunction;
import com.app.bkndbydips7.repository.PetServiceRepository;
import com.app.bkndbydips7.repository.PetOwnerRepository;
import com.app.bkndbydips7.repository.PetCareCenterRepository;
import com.app.bkndbydips7.repository.ManagerRepository;
import com.app.bkndbydips7.repository.DocumentRepository;
import com.app.bkndbydips7.repository.PetRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Component
public class JavaFunctions implements ODataFunction {


    
    
}
   
