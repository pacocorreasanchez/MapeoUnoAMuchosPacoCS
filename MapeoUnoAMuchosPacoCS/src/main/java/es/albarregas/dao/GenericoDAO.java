package es.albarregas.dao;

import es.albarregas.beans.PersonaList;
import es.albarregas.beans.PersonaSet;
import es.albarregas.persistencia.HibernateUtil;
import java.util.Iterator;

import java.util.List;

import org.hibernate.Session;

public class GenericoDAO implements IGenericoDAO {

    @Override
    public void add(Object objeto) {
        Session sesion = null;
        try {
            sesion = HibernateUtil.getSessionFactory().openSession();
            sesion.beginTransaction();
            sesion.save(objeto);
            sesion.getTransaction().commit();
        } catch (org.hibernate.JDBCException jdbce) {
            if (sesion != null) {
                sesion.getTransaction().rollback();
            }
        } finally {
            if (sesion != null) {
                sesion.close();
            }
        }
    }

    @Override
    public List<Object> get(String entidad) {
        List<Object> listado = null;
        Session sesion = null;
        try {
            sesion = HibernateUtil.getSessionFactory().openSession();
            sesion.beginTransaction();
            listado = sesion.createQuery(" from " + entidad).list();
            sesion.getTransaction().commit();

            Iterator it = listado.iterator();
            if (entidad.equals("PersonaList")) {
                while (it.hasNext()) {
                    PersonaList personaList = (PersonaList) it.next();
                    personaList.getLibros().size();
                }
            } else {
                while (it.hasNext()) {
                    PersonaSet personaSet = (PersonaSet) it.next();
                    personaSet.getLibros().size();
                }
            }

        } catch (org.hibernate.JDBCException jdbce) {
            if (sesion != null) {
                sesion.getTransaction().rollback();
            }
        } finally {
            if (sesion != null) {
                sesion.close();
            }
        }
        return listado;
    }

    @Override
    public void delete(Object objeto) {
        Session sesion = null;
        try {
            sesion = HibernateUtil.getSessionFactory().openSession();
            sesion.beginTransaction();
            sesion.delete(objeto);
            sesion.getTransaction().commit();
        } catch (org.hibernate.JDBCException jdbce) {
            if (sesion != null) {
                sesion.getTransaction().rollback();
            }
        } finally {
            if (sesion != null) {
                sesion.close();
            }
        }
    }

    @Override
    public void update(Object objeto) {
        Session sesion = null;
        try {
            sesion = HibernateUtil.getSessionFactory().openSession();
            sesion.beginTransaction();
            sesion.update(objeto);
            sesion.getTransaction().commit();
        } catch (org.hibernate.JDBCException jdbce) {
            if (sesion != null) {
                sesion.getTransaction().rollback();
            }
        } finally {
            if (sesion != null) {
                sesion.close();
            }
        }
    }

    @Override
    public Object getOne(Class clase, Long pk) {
        Object objeto = new Object();
        Session sesion = null;
        try {
            sesion = HibernateUtil.getSessionFactory().openSession();
            sesion.beginTransaction();
            objeto = (Object) sesion.get(clase, pk);
            sesion.getTransaction().commit();
        } catch (org.hibernate.JDBCException jdbce) {
            if (sesion != null) {
                sesion.getTransaction().rollback();
            }
        } finally {
            if (sesion != null) {
                sesion.close();
            }
        }
        return objeto;
    }

}
