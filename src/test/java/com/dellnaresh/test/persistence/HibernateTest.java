/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dellnaresh.test.persistence;

import com.dellnaresh.persistence.AgentAuthToken;
import com.dellnaresh.persistence.AgentBody;
import com.dellnaresh.persistence.NewHibernateUtil;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author nareshm
 */
public class HibernateTest {
    static NewHibernateUtil util;

    public HibernateTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        Logger.getLogger("com.dellnaresh.tests").log(Level.INFO, "Inside before.");
            util = new NewHibernateUtil();
    }
    
    @After
    public void tearDown() {
    }

   
    
    @Test
    public void testAgentBodyConnection(){
         System.out.println("Maven + Hibernate + MySQL");
        Session session = util.getSessionFactory().openSession();
 
        session.beginTransaction();
        AgentBody agent = new AgentBody();
 
       agent.setId(123);
       agent.setSalt("admin");
       agent.setCreatedDate(new Date());
       agent.setStatus(0);
       agent.setAgentType(1);
       agent.setOrganisation(2);
       session.save(agent);
      
         session.getTransaction().commit();
        listAgents();
         assertNotNull(agent.getId());
        
        
    }
    @Test
    public void testAgentAuthTokenConnection(){
         System.out.println("Maven + Hibernate + MySQL");
        Session session = util.getSessionFactory().openSession();
 
        session.beginTransaction();
        AgentAuthToken token = new AgentAuthToken();
 
         token.setAgentid(123);
         token.setId(1);
         token.setToken("6339098");
         token.setExpiry(new Date());
         token.setRetryCount(0);
         token.setType(1);
         session.getTransaction().commit();
         
         assertNotNull(token.getId());
        
        
    }
    
    /* Method to  READ all the employees */
   public void listAgents( ){
      Session session = NewHibernateUtil.getSessionFactory().openSession();
      Transaction tx = null;
      try{
         tx = session.beginTransaction();
         @SuppressWarnings("unchecked")
         List<AgentBody> agents = session.createQuery("FROM AGENT_BODY").list(); 
           Logger.getLogger("com.dellnaresh.tests").log(Level.INFO, "Agents list size", agents.size());
          for (AgentBody agent : agents) {
             Logger.getLogger("com.dellnaresh.tests").log(Level.INFO, "Agent Id:{0}", agent.getId());
               Logger.getLogger("com.dellnaresh.tests").log(Level.INFO, "Agent Username:{0}", agent.getSalt());
          }
         tx.commit();
      }catch (HibernateException e) {
         if (tx!=null) {
             tx.rollback();
         }
      }finally {
         session.close(); 
      }
   }
    
}
