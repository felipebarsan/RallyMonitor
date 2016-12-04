package dao;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import java.util.List;
@SessionScoped
@ManagedBean
public interface InterfaceDAO {
	
	public void save(Object bean);
	public Object getById(int id);
	public List<Object> getAll();
	public void remove(int id);
	public void update(Object bean);
}
