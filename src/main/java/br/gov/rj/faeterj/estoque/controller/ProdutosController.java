package br.gov.rj.faeterj.estoque.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.gov.rj.faeterj.estoque.model.Produto;

@Controller
public class ProdutosController { 

	//metodo GET
	@RequestMapping("/produtos/novo")
	public String novo () { 
		return "produto/CadastroProduto";
	}
	
	//metodo POST
	@RequestMapping(value = "/produtos/novo",method = RequestMethod.POST)
	public String novo (@Valid Produto produto, BindingResult result, Model model,
			RedirectAttributes attributes) {
		if (result.hasErrors()) {
			model.addAttribute("mensagem", "Erro no formulário");
			return "produto/CadastroProduto";
		}
		System.out.println(">>> SKU: " + produto.getSku());
		attributes.addFlashAttribute("mensagem", "Produto salvo com sucesso");
		return "redirect:/produtos/novo";
		
	}
}
