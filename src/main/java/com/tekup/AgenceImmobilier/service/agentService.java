package com.tekup.AgenceImmobilier.service;
import com.tekup.AgenceImmobilier.model.agent;
public interface agentService {

	agent addAgent(agent A);
	agent updateAgent(agent A);
    void deleteAgent(agent A);
    void deleteAgentById(long id);

}
