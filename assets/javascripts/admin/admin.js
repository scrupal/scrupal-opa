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

define([
    'angular',
    './controllers.js',
    './directives.js',
    './filters.js',
    './services.js'
], function (ng) {
    'use strict';

    var admin = ng.module('admin', [
        'admin.filters',
        'admin.services',
        'admin.directives',
        'admin.controllers'
    ]);

    admin.config(['$routeProvider', function($routeProvider) {

        $routeProvider
            .when( '/Scrupal', {
                templateUrl: 'chunks/admin/scrupal.html',
                controller: 'Scrupal'
            })
            .when('/Sites', {
                templateUrl: 'chunks/admin/sites.html',
                controller: 'Sites'
            })
            .when('/Modules', {
                templateUrl: 'chunks/admin/modules.html',
                controller: 'Modules'
            })
            .when('/Modules/:modName', {
                templateUrl: 'chunks/admin/module.html',
                controller: 'Module'
            })
            .when('/Entities', {
                templateUrl: 'chunks/admin/entities.html',
                controller: 'Entities'
            })
            .when('/Traits', {
                templateUrl: 'chunks/admin/traits.html',
                controller: 'Traits'
            })
            .when('/Types', {
                templateUrl: 'chunks/admin/types.html',
                controller: 'Types'
            })
            .otherwise({redirectTo: '/Scrupal'});
    }]);

    return admin;
});

