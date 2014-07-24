/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dellnaresh.data;

import com.dellnaresh.persistence.AgentBody;
import com.dellnaresh.dao.AgentTransfer;

/**
 *
 * @author NARESHM
 */
public class Agent {
    AgentBody agent;
    public Agent(AgentBody ab){
        this.agent=ab;
    }

    Agent() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public String toString() {
               return "agent id = " + agent.getId();
}
    public AgentTransfer getAgentTransferObject() {
AgentTransfer agentTransfer = new AgentTransfer();
agentTransfer.setAgent(agent);
return agentTransfer;
}
}
