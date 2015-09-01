package com.boldradius.clusterconsole.client.domain

import com.boldradius.clusterconsole.client.d3.Layout.GraphLink

import scala.scalajs.js

trait ClusterGraphLink extends GraphLink {
  var sourceHost: String = js.native
  var targetHost: String = js.native
}

trait ClusterGraphRoleLink extends ClusterGraphLink {
  var index: Int = js.native
}
