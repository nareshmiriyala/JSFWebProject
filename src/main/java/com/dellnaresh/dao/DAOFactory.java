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
// DAOFactory.java
public class DAOFactory {
public static AgentDAO getAgentDAO(String sourceType) {
// This is a simple example, so we have listed only "RDBMS" as the only source type
// In a real-world application, you can provide more source types
switch(sourceType){
case "RDBMS":
return new RDBMSDAO();
}
return null;
}
}
