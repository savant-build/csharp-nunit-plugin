/*
 * Copyright (c) 2016, Inversoft Inc., All Rights Reserved
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific
 * language governing permissions and limitations under the License.
 */
package org.savantbuild.plugin.csharp.nunit

import java.nio.file.Path
import java.nio.file.Paths

/**
 * Settings class that defines the settings used by the NUnit plugin.
 */
class CSharpNUnitSettings {
  List<Map<String, Object>> dependencies = [
      [group: "provided", transitive: true, fetchSource: false, transitiveGroups: ["provided", "compile", "runtime"]],
      [group: "compile", transitive: true, fetchSource: false, transitiveGroups: ["provided", "compile", "runtime"]],
      [group: "runtime", transitive: true, fetchSource: false, transitiveGroups: ["provided", "compile", "runtime"]],
      [group: "test-compile", transitive: true, fetchSource: false, transitiveGroups: ["provided", "compile", "runtime"]],
      [group: "test-runtime", transitive: true, fetchSource: false, transitiveGroups: ["provided", "compile", "runtime"]]
  ]

  List<String> nunitArguments = []

  String nunitVersion

  Path xmlReportFile = Paths.get("build/test/test-report.xml")

  String sdkVersion
}
