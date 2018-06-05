Databases postgressql 9.3 :
CREATE DATABASE app_apr
  WITH OWNER = apr
       ENCODING = 'UTF8'
       TABLESPACE = pg_default
       LC_COLLATE = 'English_United States.1252'
       LC_CTYPE = 'English_United States.1252'
       CONNECTION LIMIT = -1;
GRANT ALL ON DATABASE app_apr TO apr;
GRANT ALL ON DATABASE app_apr TO public;

=======================================================================================================

CREATE ROLE apr LOGIN
  ENCRYPTED PASSWORD 'md51b750ddee9e6ff29ecda8f6c1e6dc886'
  SUPERUSER INHERIT NOCREATEDB NOCREATEROLE NOREPLICATION;


=======================================================================================================

CREATE SEQUENCE tblassignment_assignmentid_seq
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 30
  CACHE 1;
ALTER TABLE tblassignment_assignmentid_seq
  OWNER TO apr;
  
=======================================================================================================

CREATE SEQUENCE tblgroup_groupid_seq
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 24
  CACHE 1;
ALTER TABLE tblgroup_groupid_seq
  OWNER TO apr;

=======================================================================================================

CREATE SEQUENCE tblmenuid_seq
  INCREMENT 10000
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 510001
  CACHE 1;
ALTER TABLE tblmenuid_seq
  OWNER TO apr;

=======================================================================================================

  CREATE SEQUENCE tblmodule_moduleid_seq
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 23
  CACHE 1;
ALTER TABLE tblmodule_moduleid_seq
  OWNER TO apr;
  
=======================================================================================================

  CREATE SEQUENCE tblpermission_permissionid_seq
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 194
  CACHE 1;
ALTER TABLE tblpermission_permissionid_seq
  OWNER TO apr;
  
=======================================================================================================

  CREATE SEQUENCE tbluser_userid_seq
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 10
  CACHE 1;
ALTER TABLE tbluser_userid_seq
  OWNER TO apr;

=============================================================

CREATE TABLE tbl_menu
(
  menuid bigint NOT NULL DEFAULT nextval('tblmenuid_seq'::regclass),
  name character varying(255) DEFAULT NULL::character varying,
  createddate timestamp(6) without time zone DEFAULT now(),
  updateddate timestamp(6) without time zone DEFAULT NULL::timestamp without time zone,
  createduser character varying(255) DEFAULT NULL::character varying,
  updateduser character varying(255) DEFAULT NULL::character varying,
  id bigint DEFAULT nextval('tblmenuid_seq'::regclass),
  CONSTRAINT tblmenu_pk PRIMARY KEY (menuid)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE tbl_menu
  OWNER TO apr;
  
===================================================================

CREATE TABLE tbl_module
(
  name character varying(255) DEFAULT NULL::character varying,
  createddate timestamp(6) without time zone DEFAULT now(),
  updateddate timestamp(6) without time zone DEFAULT NULL::timestamp without time zone,
  createduser character varying(255) DEFAULT NULL::character varying,
  updateduser character varying(255) DEFAULT NULL::character varying,
  menuid bigint,
  remarks character varying(255) DEFAULT NULL::character varying,
  paramname character varying(255) DEFAULT NULL::character varying,
  moduleid bigint NOT NULL DEFAULT nextval('tblmodule_moduleid_seq'::regclass),
  moduleregname character varying(255) DEFAULT NULL::character varying,
  modulelink character varying(255) DEFAULT NULL::character varying,
  parentmodule bigint,
  CONSTRAINT tblmodule_pk PRIMARY KEY (moduleid),
  CONSTRAINT tblmodule_fk FOREIGN KEY (menuid)
      REFERENCES tbl_menu (menuid) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=FALSE
);
ALTER TABLE tbl_module
  OWNER TO apr;
  
===================================================================================================

CREATE TABLE tblassignment
(
  assignmentid bigint NOT NULL DEFAULT nextval('tblassignment_assignmentid_seq'::regclass),
  name character varying(255) DEFAULT NULL::character varying,
  schema character varying(10),
  CONSTRAINT tblassignment_pk PRIMARY KEY (assignmentid)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE tblassignment
  OWNER TO apr;
COMMENT ON TABLE tblassignment
  IS 'stores company name';
  
=======================================================================================================

CREATE TABLE tblgroup
(
  groupid bigint NOT NULL DEFAULT nextval('tblgroup_groupid_seq'::regclass),
  name character varying(255) DEFAULT NULL::character varying,
  assignmentid bigint,
  CONSTRAINT tblgroup_pk PRIMARY KEY (groupid),
  CONSTRAINT tblassigmentid FOREIGN KEY (assignmentid)
      REFERENCES tblassignment (assignmentid) MATCH SIMPLE
      ON UPDATE CASCADE ON DELETE CASCADE
)
WITH (
  OIDS=FALSE
);
ALTER TABLE tblgroup
  OWNER TO apr;
COMMENT ON TABLE tblgroup
  IS 'stores user group';
  
========================================================================================================

  CREATE TABLE tblpermissions
(
  permissionid bigint NOT NULL DEFAULT nextval('tblpermission_permissionid_seq'::regclass),
  userid bigint,
  assignmentid bigint,
  moduleid bigint,
  pread boolean DEFAULT false,
  CONSTRAINT tblpermission_pk PRIMARY KEY (permissionid),
  CONSTRAINT tblpermission_fk_assignment FOREIGN KEY (assignmentid)
      REFERENCES tblassignment (assignmentid) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT tblpermission_fk_user FOREIGN KEY (userid)
      REFERENCES tbluser (userid) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=FALSE
);
ALTER TABLE tblpermissions
  OWNER TO apr;

=========================================================================================

CREATE TABLE tblschema
(
  schema_name character varying(25) NOT NULL,
  cabang character varying(50),
  CONSTRAINT pk_tblschema PRIMARY KEY (schema_name)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE tblschema
  OWNER TO apr;

=============================================================================================

CREATE TABLE tbluser
(
  userid bigint NOT NULL DEFAULT nextval('tbluser_userid_seq'::regclass),
  username character varying(255) DEFAULT NULL::character varying,
  pwd character varying(255) DEFAULT NULL::character varying,
  groupid bigint,
  aprvalidasi bigint DEFAULT 0,
  aprvalidasiuser bigint DEFAULT 0,
  aprvalidasiuserguest bigint DEFAULT 0,
  schema character varying(255),
  CONSTRAINT tbluser_pk PRIMARY KEY (userid),
  CONSTRAINT tbluser_fk FOREIGN KEY (groupid)
      REFERENCES tblgroup (groupid) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=FALSE
);
ALTER TABLE tbluser
  OWNER TO apr;

=======================================================================================================

INSERT INTO tbluser( username, pwd, groupid, aprvalidasi, aprvalidasiuser, aprvalidasiuserguest, schema)
    VALUES ('adminApr', 'JcYMfTHY9bpWDUlMkBt6wg==', '15', '1', '1', '1', 'apr1');
    
========================================================================================================

url test heroku : https://api-mobile-evan.herokuapp.com/customers2/getlogin/adminApr/adminApr 
