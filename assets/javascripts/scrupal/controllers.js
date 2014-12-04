/**********************************************************************************************************************
 * Copyright © 2014 Reactific Software LLC                                                                            *
 *                                                                                                                    *
 * This file is part of Scrupal, an Opinionated Web Application Framework.                                            *
 *                                                                                                                    *
 * Scrupal is free software: you can redistribute it and/or modify it under the terms                                 *
 * of the GNU General Public License as published by the Free Software Foundation,                                    *
 * either version 3 of the License, or (at your option) any later version.                                            *
 *                                                                                                                    *
 * Scrupal is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;                               *
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.                          *
 * See the GNU General Public License for more details.                                                               *
 *                                                                                                                    *
 * You should have received a copy of the GNU General Public License along with Scrupal.                              *
 * If not, see either: http://www.gnu.org/licenses or http://opensource.org/licenses/GPL-3.0.                         *
 **********************************************************************************************************************/

/* Scrupal Controllers Definitions */

define(['angular', 'ngRoute', 'domReady'], function(ng, ngRoute, domReady) {
    'use strict';

    var mod = ng.module('scrupal.controllers', ['ngRoute']);

    var simpleNavCtrl = function($scope, $route, $routeParams, $location) {
        $scope.navClass = function (page) {
            var currentRoute = $location.path().substring(1) || '/';
            return page === currentRoute ? 'active' : '';
        };
        $scope.absUrl = $location.absUrl();
        $scope.url = $location.path();
    };

    var acquireUrl = function($location, $scope) {
        var hash = $location.hash;
        var base = $location.path('').hash('');
        var result = base + '/assets/docs/' + hash;
        $scope.newUrl = result;
        return result;
    };

    mod.controller('scrupal', function($scope) {
        $scope.page_is_ready = domReady;
    });

    mod.controller('simpleNavCtrl', simpleNavCtrl);

    mod.config( function ($routeProvider, $locationProvider) {
        $routeProvider.when('/:path*', {
            templateUrl: acquireUrl,
            controller: simpleNavCtrl,
            controllerAs: 'simpleUrlNav'
        }).
        otherwise( {
                redirectTo: '/'
        });

        $locationProvider.html5Mode(true);
    });
    return mod;
});
