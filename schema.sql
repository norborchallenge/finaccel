/**
 * Author:  nuboat
 * Created: Apr 10, 2016
 */
DROP TABLE IF EXISTS accounts;

CREATE TABLE accounts
(
  email character varying(128) NOT NULL,

  enname character varying(128) NOT NULL,
  bio character varying(1024) NOT NULL,
  birthday timestamp with time zone,

  CONSTRAINT pk_accounts PRIMARY KEY (email)
);
ALTER TABLE accounts OWNER TO finaccel;
