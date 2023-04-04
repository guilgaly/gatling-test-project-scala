enablePlugins(GatlingPlugin)

scalaVersion := "2.12.17"

scalacOptions := Seq(
  "-encoding", "UTF-8", "-target:jvm-1.8", "-deprecation",
  "-feature", "-unchecked", "-language:implicitConversions", "-language:postfixOps")

val gatlingVersion = "3.3.1"
libraryDependencies += "io.gatling.highcharts" % "gatling-charts-highcharts" % gatlingVersion % "test,it"
libraryDependencies += "io.gatling"            % "gatling-test-framework"    % gatlingVersion % "test,it"

// Enterprise Cloud (https://cloud.gatling.io/) configuration reference: https://gatling.io/docs/gatling/reference/current/extensions/sbt_plugin/#working-with-gatling-enterprise-cloud
// Enterprise Self-Hosted configuration reference: https://gatling.io/docs/gatling/reference/current/extensions/sbt_plugin/#working-with-gatling-enterprise-self-hosted

Gatling / enterpriseUrl := new URL("https://cloud.dev.gatling.io")
Gatling / enterpriseApiToken := "cOGBlKXhyDraLfFDmFkH5rT390yNxBt3mD1.nmlO5QJwdDuSq.88M6SmisDv48ZzS"
Gatling / enterpriseSimulationId := "f9070b2f-f8a5-477d-8e4c-c6cdfd7fe7dc"
Gatling / waitForRunEnd := true
