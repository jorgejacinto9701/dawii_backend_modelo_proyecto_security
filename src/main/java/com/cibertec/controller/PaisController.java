package com.cibertec.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cibertec.entidad.Pais;
import com.cibertec.service.PaisService;
import com.proyecto.util.AppSettings;

@RestController
@RequestMapping("/url/lista")
@CrossOrigin(origins = AppSettings.URL_CROSS_ORIGIN)
public class PaisController {

	@Autowired
	private PaisService paisService;

	@GetMapping("/listaPais")
	@ResponseBody
	public List<Pais> listaPais() {
		return paisService.listaPais();
	}

}
