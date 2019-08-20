package com.jsf.control;

import org.ocpsoft.rewrite.annotation.Join;
import org.ocpsoft.rewrite.el.ELBeanName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.jsf.model.Contato;
import com.jsf.repository.ContatoRepository;

@Scope(value = "session")
@Component(value = "contatoController")
@ELBeanName(value = "contatoController")
@Join(path = "/contato", to = "/contato/contato-form.jsf")
public class ContatoController {
	
	@Autowired
	private ContatoRepository contatoRepository;
	
	private Contato contato = new Contato();
	
	public String save() {
		contatoRepository.save(contato);
		contato = new Contato();
		return "/contato/contato-list.xhtml?faces-redirect=true";
	}
	
	public Contato getContato() {
		return contato;
	}

}
