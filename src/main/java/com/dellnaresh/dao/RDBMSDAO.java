/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dellnaresh.dao;

import com.dellnaresh.persistence.AgentBody;
import com.dellnaresh.persistence.NewHibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author NARESHM
 */
public class RDBMSDAO implements AgentDAO {
@Override
public void insertAgent(AgentTransfer agent) {
// insertAgent implementation
System.out.println("insertAgent implementation");
    Session session = NewHibernateUtil.getSessionFactory().openSession();
     session.beginTransaction();
     session.save(agent.getAgent());
     session.getTransaction().commit();
     session.close();
}
@Override
public AgentTransfer findAgent(int id) {
// findAgent implementation
return null;
}
@Override
public void deleteAgent(int id) {
// deleteAgent implementation
    System.out.println("DeleteAgent implementation");
   
    Session session = NewHibernateUtil.getSessionFactory().openSession();
    
     session.beginTransaction();
     AgentBody ab=new AgentBody();
     ab.setId(id);
     session.delete(ab);
     session.getTransaction().commit();
     session.close();
}
@Override
public void updateAgent(int id) {
// deleteAgent implementation
}
}