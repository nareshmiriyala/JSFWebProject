package com.dellnaresh.persistence;
// Generated 20/07/2014 5:05:11 PM by Hibernate Tools 3.6.0


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * AgentAuthToken generated by hbm2java
 */
@Entity
@Table(name="AGENT_AUTH_TOKEN"
    ,catalog="mydb"
)
public class AgentAuthToken  implements java.io.Serializable {


     private int id;
     private int agentid;
     private int type;
     private String token;
     private String tokenType;
     private Date expiry;
     private int retryCount;

    public AgentAuthToken() {
    }

	
    public AgentAuthToken(int id, int agentid, int type, String token, int retryCount) {
        this.id = id;
        this.agentid = agentid;
        this.type = type;
        this.token = token;
        this.retryCount = retryCount;
    }
    public AgentAuthToken(int id, int agentid, int type, String token, String tokenType, Date expiry, int retryCount) {
       this.id = id;
       this.agentid = agentid;
       this.type = type;
       this.token = token;
       this.tokenType = tokenType;
       this.expiry = expiry;
       this.retryCount = retryCount;
    }
   
     @Id 

    
    @Column(name="ID", unique=true, nullable=false)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    
    @Column(name="AGENTID", nullable=false)
    public int getAgentid() {
        return this.agentid;
    }
    
    public void setAgentid(int agentid) {
        this.agentid = agentid;
    }

    
    @Column(name="TYPE_", nullable=false)
    public int getType() {
        return this.type;
    }
    
    public void setType(int type) {
        this.type = type;
    }

    
    @Column(name="TOKEN", nullable=false, length=50)
    public String getToken() {
        return this.token;
    }
    
    public void setToken(String token) {
        this.token = token;
    }

    
    @Column(name="TOKEN_TYPE", length=5)
    public String getTokenType() {
        return this.tokenType;
    }
    
    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="EXPIRY", length=10)
    public Date getExpiry() {
        return this.expiry;
    }
    
    public void setExpiry(Date expiry) {
        this.expiry = expiry;
    }

    
    @Column(name="RETRY_COUNT", nullable=false)
    public int getRetryCount() {
        return this.retryCount;
    }
    
    public void setRetryCount(int retryCount) {
        this.retryCount = retryCount;
    }




}


