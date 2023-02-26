package com.tekup.AgenceImmobilier.Service;

import java.util.List;


import com.tekup.AgenceImmobilier.model.TypeImmobilier;

public interface TypeImmobilierServices {


	TypeImmobilier saveTypeImmobilier(TypeImmobilier T);
	void deleteTypeImmobilier(TypeImmobilier T);
	TypeImmobilier getTypeImmobilier(Long id);
	List<TypeImmobilier> getAllTypeImmobilier();
}