package pe.edu.vallegrande.service.spec;

import java.util.List;

public interface CrudSpec<T> {

    List<T> leerTodo();

    List<T> leerTodo(T bean);

    T leerPorId(int id);

    T grabar(T bean);

    T actualizar(T bean);

    int eliminar(int id);
}
