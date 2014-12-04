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

/** AngularJS module for the Scrupal Configuration Wizard
  */

define([
  'angular'
], function (ng) {
  'use strict';

  require(['nguibootstrap', 'ng.ui.bootstrap.tpls']);

  /**
   * Declare the scrupal module. This is fundamental to Scrupal applications and this module provides all the basic
   * elements and capabilities that any Scrupal application needs. What it doesn't do is provide any particular
   * application level constructs, just facilities applications can utilize.
   */
  var config = ng.module('config', [
    'nguibootstrap',
    'ng.ui.bootstrap.tpls'
  ]);

  return config;
});

