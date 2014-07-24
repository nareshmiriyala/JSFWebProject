/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dellnaresh.dao;

import com.dellnaresh.persistence.AgentBody;
import java.io.Serializable;

/**
 *
 * @author NARESHM
 */

public class AgentTransfer implements Serializable{
    AgentBody agent;

    public AgentBody getAgent() {
        return agent;
    }

    public void setAgent(AgentBody agent) {
        this.agent = agent;
    }
    
}
