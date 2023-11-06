package br.edu.fatecrl.mvcDemo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.fatecrl.mvcDemo.modelos.Container;

@RestController
@RequestMapping("api/container")
public class ContainerApiController {
	
	private final List<Container> containers = new ArrayList<>();
	
	public ContainerApiController() {
		containers.add(new Container("Sal", 5, 10));
		containers.add(new Container("Açucar", 10, 10));
		containers.add(new Container("Argila", 3, 20));
	}
	
	@GetMapping
	public List<Container> getContainers() {
		return containers;
	}
	
}
