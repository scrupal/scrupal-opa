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


import sbt.Keys._
import sbt._

/** Build Dependencies
  * This trait can be mixed in to get all of Scrupals repository resolvers and dependent libraries.
  */
trait Dependencies
{
  // val scrupal_org_releases    = "Scrupal.org Releases" at "http://scrupal.github.org/mvn/releases"
  val google_sedis            = "Google Sedis" at "http://pk11-scratch.googlecode.com/svn/trunk/"
  val typesafe_releases       = "Typesafe Releases" at "http://repo.typesafe.com/typesafe/releases/"
  val sonatype_releases       = "Sonatype Releases"  at "http://oss.sonatype.org/content/repositories/releases/"
  val sonatype_snapshots      = "Sonatype Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/"
  val jcenter_repo            = "JCenter" at "http://jcenter.bintray.com/"

//val scala_lang              = "Scala Language" at "http://mvnrepository.com/artifact/org.scala-lang/"
//val sbt_plugin_releases     = Resolver.url("SBT Plugin Releases",url("http://repo.scala-sbt.org/scalasbt/sbt-plugin-releases"))(Resolver.ivyStylePatterns)
//val geolocation             = "geolocation repository" at "http://blabluble.github.com/modules/releases/"

  val all_resolvers : Seq[MavenRepository] = Seq (
    typesafe_releases, sonatype_releases, sonatype_snapshots, google_sedis, jcenter_repo
  )

  val resolver_settings : Seq[Setting[_]] = Seq(
    resolvers ++= all_resolvers
  )

  // Things we borrow from Play Framework
  val playV = "2.3.7"
  val play_iteratees          = "com.typesafe.play"   %% "play-iteratees"         % playV
  val play_json               = "com.typesafe.play"   %% "play-json"              % playV
  val play_ws                 = "com.typesafe.play"   %% "play-ws"                % playV

  val scalatags               = "com.scalatags"       %% "scalatags"              % "0.5.0-SNAPSHOT"

  // Spray Stuff
  val akkaV = "2.3.6"
  val sprayV = "1.3.2"
  val spray_can               = "io.spray"            %%  "spray-can"             % sprayV
  val spray_routing           = "io.spray"            %%  "spray-routing"         % sprayV
  val spray_http              = "io.spray"            %%  "spray-http"            % sprayV
  val spray_httpx             = "io.spray"            %%  "spray-httpx"           % sprayV
  val spray_caching           = "io.spray"            %%  "spray-caching"         % sprayV

  // Akka Stuff
  val akka_actor              = "com.typesafe.akka"   %%  "akka-actor"            % akkaV
  val akka_slf4j              = "com.typesafe.akka"   %%  "akka-slf4j"            % akkaV

  // Fundamentals
  val scala_arm               = "com.jsuereth"        %% "scala-arm"              % "1.4"

  // Databass, Caches, Data Storage stuff
  // val play_plugins_redis      = "com.typesafe"        %% "play-plugins-redis"     % "2.1.1"
  val reactivemongo           = "org.reactivemongo"   %% "reactivemongo"          % "0.11.0-SNAPSHOT"
  val livestream_scredis      = "com.livestream"      %% "scredis"                % "2.0.6"

  // WebJars based UI components
  val requirejs               = "org.webjars"         % "requirejs"               % "2.1.15"
  val requirejs_domready      = "org.webjars"         % "requirejs-domready"      % "2.0.1-2"
  val angularjs               = "org.webjars"         % "angularjs"               % "1.3.8"
  val angular_drag_drop       = "org.webjars"         % "angular-dragdrop"        % "1.0.6"
  val angular_multi_select    = "org.webjars"         % "angular-multi-select"    % "2.0.1"
  val angular_ui              = "org.webjars"         % "angular-ui"              % "0.4.0-3"
  val angular_ui_bootstrap    = "org.webjars"         % "angular-ui-bootstrap"    % "0.12.0"
  val angular_ui_router       = "org.webjars"         % "angular-ui-router"       % "0.2.13"
  val angular_ui_utils        = "org.webjars"         % "angular-ui-utils"        % "47ff7ef35c"
  val angular_ui_calendar     = "org.webjars"         % "angular-ui-calendar"     % "0.9.0-beta.1"
  val angualr_ckeditor        = "org.webjars"         % "angular-ckeditor"        % "0.2.0"
  val marked                  = "org.webjars"         % "marked"                  % "0.3.2-1"
  val fontawesome             = "org.webjars"         % "font-awesome"            % "4.2.0"

  // Hashing Algorithms
  val pbkdf2                  = "io.github.nremond"   %% "pbkdf2-scala"           % "0.4"
  val bcrypt                  = "org.mindrot"         % "jbcrypt"                 % "0.3m"
  val scrypt                  = "com.lambdaworks"     % "scrypt"                  % "1.4.0"

  // Miscellaneous
  val osgi_core               = "org.osgi"            % "org.osgi.core"           % "6.0.0"
  val grizzled_slf4j          = "org.clapper"         %% "grizzled-slf4j"         % "1.0.2"
  val logback_classic         = "ch.qos.logback"      %  "logback-classic"        % "1.1.2"
  val mango                   = "org.feijoas"         %% "mango"                  % "0.11-SNAPSHOT"
  val joda_time               = "joda-time"           %  "joda-time"              % "2.5"
  val joda_convert            = "org.joda"            % "joda-convert"            % "1.2"
  val mailer_plugin     = "com.typesafe.play.plugins" %% "play-plugins-mailer"    % "2.3.0"
  val config                  =  "com.typesafe"       %  "config"                 % "1.2.1"
  val commons_lang3           = "org.apache.commons"  % "commons-lang3"           % "3.3.2"

  // Test Libraries

//val icu4j                   = "com.ibm.icu"          % "icu4j"                  % "51.1"
//val geolocation             =  "com.edulify"        %% "geolocation"            % "1.1.0"

/*  val all_dependencies : Seq[ModuleID] = Seq(
    play_cache, play_filters, play_test, play_docs, play_ws,
    mailer_plugin,
    reactivemongo,
    pbkdf2, bcrypt, scrypt,
    osgi_core, slf4j,
    webjars_play,
    requirejs, requirejs_domready,
    angularjs, angular_drag_drop, angular_multi_select,
    angular_ui, angular_ui_bootstrap, angular_ui_router, angular_ui_utils, angular_ui_calendar,
    marked, fontawesome
  )
  */

  private object Test {
    val spray_testkit        = "io.spray"            %% "spray-testkit"         % sprayV       % "test"
    val akka_testkit         = "com.typesafe.akka"   %% "akka-testkit"          % akkaV        % "test"
    val specs2               = "org.specs2"          %% "specs2-core"           % "2.3.11"     % "test"
    val commons_io           = "commons-io"          %  "commons-io"            % "2.4"        % "test"
  }

  val common_dependencies : Seq[ModuleID] = Seq(
    // mango,
    grizzled_slf4j, akka_slf4j, logback_classic,
    Test.specs2
  )

  val opa_dependencies : Seq[ModuleID] = Seq(
    scalatags, requirejs, requirejs_domready, angularjs, angular_ui_bootstrap, spray_http, reactivemongo,
    joda_time
    // angular_drag_drop, angular_multi_select,
    // angular_ui, angular_ui_bootstrap, angular_ui_router, angular_ui_utils, angular_ui_calendar
  ) ++ common_dependencies

}
