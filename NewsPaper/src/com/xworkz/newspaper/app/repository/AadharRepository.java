package com.xworkz.newspaper.app.repository;

import com.xworkz.newspaper.app.DTO.AadharDTO;

public interface AadharRepository {
	int TOTAL = 10;

	void persistant(AadharDTO dto);

}
