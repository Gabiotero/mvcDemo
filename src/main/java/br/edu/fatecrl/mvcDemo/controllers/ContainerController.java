package br.edu.fatecrl.mvcDemo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.edu.fatecrl.mvcDemo.modelos.Container;
import org.springframework.ui.Model;

@Controller
@RequestMapping("container")
public class ContainerController {
	
	private final List<Container> containers = new ArrayList<>();
	
	public ContainerController() {
		containers.add(new Container("Sal", 5, 10));
		containers.add(new Container("Açucar", 10, 10));
		containers.add(new Container("Argila", 3, 20));
	}
	
	@GetMapping
	public String getContainers(Model model) {
		model.addAttribute("containers", containers);
		return "containers";
	}
	
}
