package com.il.mo.co.test;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.rethinkdb.RethinkDB;
import com.rethinkdb.RethinkDBConstants;
import com.rethinkdb.gen.ast.Geojson;
import com.rethinkdb.gen.ast.Json;
import com.rethinkdb.gen.exc.ReqlError;
import com.rethinkdb.gen.exc.ReqlQueryLogicError;
import com.rethinkdb.model.MapObject;
import com.rethinkdb.net.Connection;
import com.rethinkdb.net.Cursor;
/**
 * Hello world!
 *
 */
public class App 
{
	public static final RethinkDB r =RethinkDB.r;
	
    public static void main( String[] args )
    {
       Connection conn = r.connection().hostname(RethinkDBConstants.DEFAULT_HOSTNAME).port(RethinkDBConstants.DEFAULT_PORT).connect();
       Cursor cursor= r.db("test").table("Users").filter(r.hashMap("age", 24)).run(conn);
      for(Object doc:cursor)
      {
    	  Gson s= new Gson();
    	  Gson gson = new GsonBuilder().setPrettyPrinting().create();
    	  System.out.println(gson.toJson(doc));
      }
    }
}
