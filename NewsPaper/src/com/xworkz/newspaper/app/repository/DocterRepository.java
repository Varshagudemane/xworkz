package com.xworkz.newspaper.app.repository;

import com.xworkz.newspaper.app.DTO.DocterDTO;

public interface DocterRepository {
	int TOTAL = 10;

	void persist(DocterDTO docterDTO);


}
