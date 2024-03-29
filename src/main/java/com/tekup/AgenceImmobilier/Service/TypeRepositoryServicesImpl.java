package com.tekup.AgenceImmobilier.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tekup.AgenceImmobilier.model.TypeImmobilier;
import com.tekup.AgenceImmobilier.repos.TypeImmobilierRepository;

@Service
public class TypeRepositoryServicesImpl implements TypeImmobilierServices {

	
@Autowired TypeImmobilierRepository typeImmobilierRepository;

@Override
public TypeImmobilier saveTypeImmobilier(TypeImmobilier T) {
	
	return typeImmobilierRepository.save(T);
}

@Override
public void deleteTypeImmobilier(TypeImmobilier T) {
	 typeImmobilierRepository.delete(T);
}

@Override
public TypeImmobilier getTypeImmobilier(Long id) {
	
	return  typeImmobilierRepository.findById(id).get();
}

@Override
public List<TypeImmobilier> getAllTypeImmobilier() {
	
	return typeImmobilierRepository.findAll();
}
	

	
}
