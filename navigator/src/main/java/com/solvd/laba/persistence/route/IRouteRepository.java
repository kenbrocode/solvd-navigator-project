package com.solvd.laba.persistence.route;

import com.solvd.laba.model.City;
import com.solvd.laba.model.Route;

import java.util.List;
import java.util.Optional;

public interface IRouteRepository {
    void create(Route route);

    Route findById(Long id);

    List<Route> getAllRoutes();

    void updateById(Route route);

    void deleteById(Long id);

    Optional<Route> getRouteBetweenTwoCities(Long startCityId, Long endCityId);
}
