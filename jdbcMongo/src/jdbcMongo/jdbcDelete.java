package jdbcMongo;

import com.mongodb.*;

public class jdbcDelete {

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
				
				BasicDBObject d = new BasicDBObject("name","Dtroy");
				coll.remove(d);
				
				System.out.print("The updated doc looks like -> ");
				//display doc after delete
				DBCursor cursor1 = coll.find();
				while(cursor1.hasNext())
					System.out.print(cursor1.next());
		
	}

}
