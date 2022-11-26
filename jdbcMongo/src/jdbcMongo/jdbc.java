package jdbcMongo;

import com.mongodb.*;
public class jdbc {

	public static void main(String[] args) {
		// create a connection
		MongoClient mongo = new MongoClient("localhost",27017);
		
		//create a db
		DB db= mongo.getDB("jdbcMongo");
		
		//create a  collection
		
		DBCollection coll = db.getCollection("jdbc2");
		
		//insert a document 
		//create a db object
		BasicDBObject d1 = new BasicDBObject("roll","1").append("name", "Pratik").append("age", 23);
		BasicDBObject d2 = new BasicDBObject("roll","2").append("name", "Kunal").append("age", 21);
		//insert in collection
		coll.insert(d1);
		coll.insert(d2);
		
		//display document
		DBCursor cursor = coll.find();
		while(cursor.hasNext())
			System.out.print(cursor.next());
		
		}
}

