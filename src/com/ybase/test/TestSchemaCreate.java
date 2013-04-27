package com.ybase.test;

import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;
public class TestSchemaCreate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	//Configuration conf= new Configuration().addClass(User.class);
	//	Configuration conf= new Configuration().addClass(User.class).addClass(Role.class);
		
		Configuration conf= new Configuration().configure();
		SchemaExport dbExport=new SchemaExport(conf);
		dbExport.create(true, true);
	}

}
