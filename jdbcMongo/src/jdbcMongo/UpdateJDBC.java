package jdbcMongo;

import com.mongodb.*;
public class UpdateJDBC {

	public static void main(String[] args) {
		// create a connection
		MongoClient mongo = new MongoClient("localhost",27017);
				
		//create a db
		DB db= mongo.getDB("jdbcMongo");
				
		//create a  collection
				
		DBCollection coll = db.getCollection("jdbc2");
		
		//display doc before update
		DBCursor cursor = coll.find();
		while(cursor.hasNext())
			System.out.print(cursor.next());
		
		BasicDBObject oldDoc = new BasicDBObject("name","Pratik");
		BasicDBObject newDoc = new BasicDBObject("name","Dtroy");
		BasicDBObject updateDoc = new BasicDBObject("$set",newDoc);	
		coll.update(oldDoc, updateDoc);
		
		System.out.print("The updated doc looks like -> ");
		//display doc after update
		DBCursor cursor1 = coll.find();
		while(cursor1.hasNext())
			System.out.print(cursor1.next());
				

	}

}
