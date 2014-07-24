/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dellnaresh.dao;

/**
 *
 * @author NARESHM
 */
public interface AgentDAO {
    public void insertAgent(AgentTransfer agent);
public AgentTransfer findAgent(int id);
public void updateAgent(int id);
public void deleteAgent(int id);
}
