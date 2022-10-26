package com.tekup.AgenceImmobilier.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tekup.AgenceImmobilier.model.agent;
import com.tekup.AgenceImmobilier.repos.agentRep;

@Service
public class agentSericempl implements agentService {

	@Autowired
    agentRep agentRep;

	
	@Override
	public agent addAgent(agent A) {
		return agentRep.save(A);
	}

	@Override
	public agent updateAgent(agent A) {
		return agentRep.save(A);
	}

	@Override
	public void deleteAgent(agent A) {
		agentRep.delete(A)	;	
	}

	@Override
	public void deleteAgentById(long id) {
		agentRep.deleteById(id)	;	
		
	}

}
