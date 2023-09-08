package com.xworkz.newspaper.app.repository;

import com.xworkz.newspaper.app.DTO.PrinterDTO;

public interface PrinterRepository {
	int TOATL = 10;

	void persist(PrinterDTO dto);

}
