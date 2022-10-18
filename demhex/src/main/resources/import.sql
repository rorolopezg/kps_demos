insert into P_USER_ACCOUNTS (ACCOUNT_ID, USER_NAME, USER_EMAIL, LANGUAGE, COUNTRY, LOCK_ACCOUNT, LOCK_ACCOUNT_DATE, CHANGE_PWD, PWD_EXPIRE_DATE) values (1, 'rorolopezg', 'lopez.rodrigo@kopernicus.tech', 'SPANISH', 'UY', 'N', null, 'N', null);
insert into P_USER_ACCOUNTS (ACCOUNT_ID, USER_NAME, USER_EMAIL, LANGUAGE, COUNTRY, LOCK_ACCOUNT, LOCK_ACCOUNT_DATE, CHANGE_PWD, PWD_EXPIRE_DATE) values (2, 'user2', 'user.2@kopernicus.tech', 'SPANISH', 'UY', 'N', null, 'N', null);
insert into P_USER_ACCOUNTS (ACCOUNT_ID, USER_NAME, USER_EMAIL, LANGUAGE, COUNTRY, LOCK_ACCOUNT, LOCK_ACCOUNT_DATE, CHANGE_PWD, PWD_EXPIRE_DATE) values (3, 'user3', 'user.3@kopernicus.tech', 'SPANISH', 'UY', 'N', null, 'N', null);

insert into P_AGENTS (AGENT_ID, AGENT_NO, AGENT_TYPE, AGENT_STATE) values (1, '111', 0, 1);
insert into P_AGENTS (AGENT_ID, AGENT_NO, AGENT_TYPE, AGENT_STATE) values (2, '222', 0, 1);

insert into P_ACCOUNT_AGENTS (ACCOUNT_ID, AGENT_ID) values (1, 1);
insert into P_ACCOUNT_AGENTS (ACCOUNT_ID, AGENT_ID) values (1, 2);
insert into P_ACCOUNT_AGENTS (ACCOUNT_ID, AGENT_ID) values (2, 2);
