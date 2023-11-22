package ch.epfl.scala

import ch.epfl.scala.profiledb.utils.AbsolutePath

case class PluginConfig(
    showProfiles: Boolean,
    generateDb: Boolean,
    sourceRoot: Option[AbsolutePath],
    printSearchIds: Set[Int],
    generateMacroFlamegraph: Boolean,
    printFailedMacroImplicits: Boolean,
    concreteTypeParamsInImplicits: Boolean
)
