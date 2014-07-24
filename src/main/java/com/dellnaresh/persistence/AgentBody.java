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
 * AgentBody generated by hbm2java
 */
@Entity
@Table(name="AGENT_BODY"
    ,catalog="mydb"
)
public class AgentBody  implements java.io.Serializable {


     private int id;
     private String salt;
     private Date createdDate;
     private String name;
     private String emailAddress;
     private String smsAddress;
     private String language;
     private int status;
     private int agentType;
     private int organisation;
     private Integer dsCommission;
     private Integer posCommission;
     private String agentObject;
     private Integer regTxn;
     private Integer loBalThres;
     private Integer loBalAmount;
     private String loBalSource;
     private Integer hiBalThres;
     private Integer hiBalAmount;
     private String hiBalSource;
     private Date lastAutoCash;
     private Integer ownerAgent;
     private String agentCategory;

    public AgentBody() {
    }

	
    public AgentBody(int id, String salt, Date createdDate, int status, int agentType, int organisation) {
        this.id = id;
        this.salt = salt;
        this.createdDate = createdDate;
        this.status = status;
        this.agentType = agentType;
        this.organisation = organisation;
    }
    public AgentBody(int id, String salt, Date createdDate, String name, String emailAddress, String smsAddress, String language, int status, int agentType, int organisation, Integer dsCommission, Integer posCommission, String agentObject, Integer regTxn, Integer loBalThres, Integer loBalAmount, String loBalSource, Integer hiBalThres, Integer hiBalAmount, String hiBalSource, Date lastAutoCash, Integer ownerAgent, String agentCategory) {
       this.id = id;
       this.salt = salt;
       this.createdDate = createdDate;
       this.name = name;
       this.emailAddress = emailAddress;
       this.smsAddress = smsAddress;
       this.language = language;
       this.status = status;
       this.agentType = agentType;
       this.organisation = organisation;
       this.dsCommission = dsCommission;
       this.posCommission = posCommission;
       this.agentObject = agentObject;
       this.regTxn = regTxn;
       this.loBalThres = loBalThres;
       this.loBalAmount = loBalAmount;
       this.loBalSource = loBalSource;
       this.hiBalThres = hiBalThres;
       this.hiBalAmount = hiBalAmount;
       this.hiBalSource = hiBalSource;
       this.lastAutoCash = lastAutoCash;
       this.ownerAgent = ownerAgent;
       this.agentCategory = agentCategory;
    }
   
     @Id 

    
    @Column(name="ID", nullable=false)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    
    @Column(name="SALT", nullable=false, length=20)
    public String getSalt() {
        return this.salt;
    }
    
    public void setSalt(String salt) {
        this.salt = salt;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="CREATED_DATE", nullable=false, length=10)
    public Date getCreatedDate() {
        return this.createdDate;
    }
    
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    
    @Column(name="NAME", length=100)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    
    @Column(name="EMAIL_ADDRESS", length=100)
    public String getEmailAddress() {
        return this.emailAddress;
    }
    
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    
    @Column(name="SMS_ADDRESS", length=20)
    public String getSmsAddress() {
        return this.smsAddress;
    }
    
    public void setSmsAddress(String smsAddress) {
        this.smsAddress = smsAddress;
    }

    
    @Column(name="LANGUAGE", length=8)
    public String getLanguage() {
        return this.language;
    }
    
    public void setLanguage(String language) {
        this.language = language;
    }

    
    @Column(name="STATUS", nullable=false)
    public int getStatus() {
        return this.status;
    }
    
    public void setStatus(int status) {
        this.status = status;
    }

    
    @Column(name="AGENT_TYPE", nullable=false)
    public int getAgentType() {
        return this.agentType;
    }
    
    public void setAgentType(int agentType) {
        this.agentType = agentType;
    }

    
    @Column(name="ORGANISATION", nullable=false)
    public int getOrganisation() {
        return this.organisation;
    }
    
    public void setOrganisation(int organisation) {
        this.organisation = organisation;
    }

    
    @Column(name="DS_COMMISSION")
    public Integer getDsCommission() {
        return this.dsCommission;
    }
    
    public void setDsCommission(Integer dsCommission) {
        this.dsCommission = dsCommission;
    }

    
    @Column(name="POS_COMMISSION")
    public Integer getPosCommission() {
        return this.posCommission;
    }
    
    public void setPosCommission(Integer posCommission) {
        this.posCommission = posCommission;
    }

    
    @Column(name="AGENT_OBJECT", length=128)
    public String getAgentObject() {
        return this.agentObject;
    }
    
    public void setAgentObject(String agentObject) {
        this.agentObject = agentObject;
    }

    
    @Column(name="REG_TXN")
    public Integer getRegTxn() {
        return this.regTxn;
    }
    
    public void setRegTxn(Integer regTxn) {
        this.regTxn = regTxn;
    }

    
    @Column(name="LO_BAL_THRES")
    public Integer getLoBalThres() {
        return this.loBalThres;
    }
    
    public void setLoBalThres(Integer loBalThres) {
        this.loBalThres = loBalThres;
    }

    
    @Column(name="LO_BAL_AMOUNT")
    public Integer getLoBalAmount() {
        return this.loBalAmount;
    }
    
    public void setLoBalAmount(Integer loBalAmount) {
        this.loBalAmount = loBalAmount;
    }

    
    @Column(name="LO_BAL_SOURCE", length=64)
    public String getLoBalSource() {
        return this.loBalSource;
    }
    
    public void setLoBalSource(String loBalSource) {
        this.loBalSource = loBalSource;
    }

    
    @Column(name="HI_BAL_THRES")
    public Integer getHiBalThres() {
        return this.hiBalThres;
    }
    
    public void setHiBalThres(Integer hiBalThres) {
        this.hiBalThres = hiBalThres;
    }

    
    @Column(name="HI_BAL_AMOUNT")
    public Integer getHiBalAmount() {
        return this.hiBalAmount;
    }
    
    public void setHiBalAmount(Integer hiBalAmount) {
        this.hiBalAmount = hiBalAmount;
    }

    
    @Column(name="HI_BAL_SOURCE", length=64)
    public String getHiBalSource() {
        return this.hiBalSource;
    }
    
    public void setHiBalSource(String hiBalSource) {
        this.hiBalSource = hiBalSource;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="LAST_AUTO_CASH", length=10)
    public Date getLastAutoCash() {
        return this.lastAutoCash;
    }
    
    public void setLastAutoCash(Date lastAutoCash) {
        this.lastAutoCash = lastAutoCash;
    }

    
    @Column(name="OWNER_AGENT")
    public Integer getOwnerAgent() {
        return this.ownerAgent;
    }
    
    public void setOwnerAgent(Integer ownerAgent) {
        this.ownerAgent = ownerAgent;
    }

    
    @Column(name="AGENT_CATEGORY", length=20)
    public String getAgentCategory() {
        return this.agentCategory;
    }
    
    public void setAgentCategory(String agentCategory) {
        this.agentCategory = agentCategory;
    }




}


