package com.solvd.lawOffice.utils;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.io.Reader;

public class SessionFactory {

    private final static Logger LOGGER = LogManager.getLogger(SessionFactory.class);
    private static SessionFactory sessionFactory;
    private final static String MY_BATIS_CFG_PATH = "myBatis/mybatis-config.xml";
    private SqlSession session;

    private SessionFactory () {

        try (Reader rd = Resources.getResourceAsReader(MY_BATIS_CFG_PATH)){
            session = new SqlSessionFactoryBuilder().build(rd).openSession();
        } catch (IOException e) {
            LOGGER.error("ERROR: There was an error with my Batis.", e);
            throw new RuntimeException(e);
        }
    }

    public static SessionFactory getInstance() {
        if (sessionFactory == null) {
            return new SessionFactory();
        }
        return sessionFactory;
    }

    public SqlSession getSession() {
        return session;
    }
}
