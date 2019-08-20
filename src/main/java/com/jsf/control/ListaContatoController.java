package com.jsf.control;

import java.util.List;

import org.ocpsoft.rewrite.annotation.Join;
import org.ocpsoft.rewrite.annotation.RequestAction;
import org.ocpsoft.rewrite.el.ELBeanName;
import org.ocpsoft.rewrite.faces.annotation.Deferred;
import org.ocpsoft.rewrite.faces.annotation.IgnorePostback;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.jsf.model.Contato;
import com.jsf.repository.ContatoRepository;

@Scope (value = "session")
@Component (value = "listaContatos")
@ELBeanName(value = "listaContatos")
@Join(path = "/", to = "/contato/contato-list.jsf")
public class ListaContatoController {
	
	@Autowired
	private ContatoRepository contatoRepository;
	
	private List<Contato> contatos;
	
	@Deferred
	@RequestAction
	@IgnorePostback
	public void loadData() {
		contatos = contatoRepository.findAll();
	}
	
	public List<Contato> getContatos(){
		return contatos;
	}
	
	public String delete(Contato contato) {
		contatoRepository.delete( contato );
		loadData();
		return null;
	}

}
