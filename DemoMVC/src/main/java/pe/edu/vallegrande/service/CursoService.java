package pe.edu.vallegrande.service;

import pe.edu.vallegrande.dto.CursoDto;
import pe.edu.vallegrande.service.spec.CrudSpec;

import java.util.List;

public class CursoService implements CrudSpec <CursoDto>{
    @Override
    public List<CursoDto> leerTodo() {
        return List.of();
    }

    @Override
    public List<CursoDto> leerTodo(CursoDto bean) {
        return List.of();
    }

    @Override
    public CursoDto leerPorId(int id) {
        return null;
    }

    @Override
    public CursoDto grabar(CursoDto bean) {
        return null;
    }

    @Override
    public CursoDto actualizar(CursoDto bean) {
        return null;
    }

    @Override
    public int eliminar(int id) {
        return 0;
    }
}
