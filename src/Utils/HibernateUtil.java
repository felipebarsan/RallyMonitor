import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import modelo.Carro;

public class HibernateUtil {
    private static SessionFactory factory;
    static {
              AnnotationConfiguration cfg = new AnnotationConfiguration();
              cfg.addAnnotatedClass(Carro.class);
              factory = cfg.buildSessionFactory();
    }
    public Session getSession() {
              return factory.openSession();
    }
}
