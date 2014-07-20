
CREATE TABLE AGENT_BODY
(
   	ID INT(18) NOT NULL ,
        SALT VARCHAR(20) NOT NULL ,
	CREATED_DATE DATE NOT NULL ,
        NAME VARCHAR(100),
        EMAIL_ADDRESS VARCHAR(100),
        SMS_ADDRESS VARCHAR(20),
        LANGUAGE VARCHAR(8),
	STATUS INT(10) DEFAULT 0 NOT NULL ,
        AGENT_TYPE INT(10) DEFAULT 0 NOT NULL ,
	ORGANISATION INT(5) DEFAULT 0 NOT NULL,
	DS_COMMISSION INT(18),
	POS_COMMISSION INT(18),
	AGENT_OBJECT VARCHAR(128),
	REG_TXN INT(18),
	LO_BAL_THRES INT(18),
	LO_BAL_AMOUNT INT(18),
	LO_BAL_SOURCE VARCHAR(64),
	HI_BAL_THRES INT(18),
	HI_BAL_AMOUNT INT(18),
	HI_BAL_SOURCE VARCHAR(64),
	LAST_AUTO_CASH DATE,
   	OWNER_AGENT INT(18),
    AGENT_CATEGORY VARCHAR(20),
         CONSTRAINT PK_AGENT_BODY PRIMARY KEY (ID)
        
  )