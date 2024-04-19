package mathtest.pgsql;


import org.hibernate.Session;    
import org.hibernate.SessionFactory;    
import org.hibernate.Transaction;  
import org.hibernate.boot.Metadata;  
import org.hibernate.boot.MetadataSources;  
import org.hibernate.boot.registry.StandardServiceRegistry;  
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;  

public class StoreData {    
    public static void main(String[] args) {    
        
    StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
    Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
  
	SessionFactory factory = meta.getSessionFactoryBuilder().build();  
	Session session = factory.openSession();  
	Transaction t = session.beginTransaction();   
            
    MathResult e1 = new MathResult();    
    e1.setId(101);    
    e1.setFirstName("Student");    
    e1.setLastName("Good");    
    System.out.println(e1);
    session.persist(e1);  
    t.commit();  
    System.out.println("successfully saved");    
    factory.close();  
    session.close();    
    }    
}   
