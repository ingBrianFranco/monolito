package com.brian.springboot.app.monolito.model.DAO;

import com.brian.springboot.app.monolito.model.entity.TipoIdentificacion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Repository
public class TipoIdentificacionDAOImpl implements ITipoIdentificacionDAO{

    @Autowired
    private ITipoIdentificacionDAO iTipoIdentificacionDAO;

    @Override
    public List<TipoIdentificacion> findAll() {
        return iTipoIdentificacionDAO.findAll();
    }

    @Override
    public List<TipoIdentificacion> findAll(Sort sort) {
        return iTipoIdentificacionDAO.findAll(sort);
    }

    @Override
    public Page<TipoIdentificacion> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<TipoIdentificacion> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(TipoIdentificacion entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends TipoIdentificacion> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends TipoIdentificacion> S save(S entity) {
        return null;
    }

    @Override
    public <S extends TipoIdentificacion> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<TipoIdentificacion> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends TipoIdentificacion> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends TipoIdentificacion> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<TipoIdentificacion> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public TipoIdentificacion getOne(Long aLong) {
        return null;
    }

    @Override
    public TipoIdentificacion getById(Long aLong) {
        return null;
    }

    @Override
    public <S extends TipoIdentificacion> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends TipoIdentificacion> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends TipoIdentificacion> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends TipoIdentificacion> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends TipoIdentificacion> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends TipoIdentificacion> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends TipoIdentificacion, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
